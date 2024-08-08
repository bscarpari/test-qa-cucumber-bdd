package bugbank.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BankStatement {
    private String textBalanceAvailable;
    private String textDateTransaction;
    private String textTypeTransaction;
    private String textDescription;
    private String textTransferValue;
}
