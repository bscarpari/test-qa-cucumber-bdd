package bugbank.factory.data;

import bugbank.dto.RegisterDTO;
import bugbank.util.DataFakerGenerator;

import java.util.Random;

public class RegisterData {
    static DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();
    Random random = new Random();

    public static RegisterDTO registerValidData() {
        RegisterDTO registerDTO = new RegisterDTO();
        registerDTO.setEmail(dataFakerGenerator.emailFaker());
        registerDTO.setFullName(dataFakerGenerator.fullNameFaker());
        registerDTO.setPassword(dataFakerGenerator.passwordFaker());
        registerDTO.setConfirm_password(registerDTO.getPassword());
        registerDTO.setAccount_with_balance(true);
        return registerDTO;
    }

    public RegisterDTO registerWithEmptyData() {
        RegisterDTO registerDTO = new RegisterDTO();
        registerDTO.setEmail("");
        registerDTO.setFullName("");
        registerDTO.setPassword("");
        registerDTO.setConfirm_password("");
        registerDTO.setAccount_with_balance(random.nextBoolean());
        return registerDTO;
    }
}
