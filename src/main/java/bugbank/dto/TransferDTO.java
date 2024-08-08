package bugbank.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransferDTO {
    private String accountNumber;
    private String digit;
    private String transferValue;
    private String description;
}
