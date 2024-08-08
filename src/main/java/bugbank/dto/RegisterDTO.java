package bugbank.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegisterDTO {
    private String email;
    private String fullName;
    private String password;
    private String confirm_password;
    private Boolean account_with_balance;
}
