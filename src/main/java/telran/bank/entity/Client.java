package telran.bank.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Data
public class Client {
    private UUID id;
    private String firstName;
    private String lastName;
    private int status;
    private String taxCode;
    private String email;
    private String address;
    private String phone;
    private LocalDate createIt;

}
