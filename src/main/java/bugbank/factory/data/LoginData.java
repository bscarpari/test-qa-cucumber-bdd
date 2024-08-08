package bugbank.factory.data;

import bugbank.dto.LoginDto;
import bugbank.util.DataFakerGenerator;

public class LoginData {
    DataFakerGenerator dataFakeGenerator = new DataFakerGenerator();

    public LoginDto loginWithValidFixedData() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("onurb@gmail.com");
        loginDto.setPassword("123");
        return loginDto;
    }

    public LoginDto loginWithInvalidData() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail(dataFakeGenerator.emailFaker());
        loginDto.setPassword(dataFakeGenerator.passwordFaker());
        return loginDto;
    }

    public LoginDto loginWithEmptyData() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("");
        loginDto.setPassword("");
        return loginDto;
    }
}
