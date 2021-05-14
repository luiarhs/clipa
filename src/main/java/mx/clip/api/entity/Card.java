package mx.clip.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    private String cardId;
    private String cardNumber;
    private String amount;
    private String expirationDate;
    private String state;
    private String userId;
    private Transaction[] transactions;
    
}
