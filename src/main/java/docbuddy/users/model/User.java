package docbuddy.users.model;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@Builder
public class User {
    private String id;
    private boolean admin;
    private boolean doctor;
    private String userName;
    private String password;
    private UUID accessToken;
    private String firstName;
    private String lastName;
    private String birth;
    private List<String> specialties;
    private List<String> illnesses;
}
