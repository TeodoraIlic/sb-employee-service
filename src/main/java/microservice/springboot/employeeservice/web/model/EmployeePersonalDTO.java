package microservice.springboot.employeeservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeePersonalDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String bankAccount;
    private String address;
    private String superior;

}
