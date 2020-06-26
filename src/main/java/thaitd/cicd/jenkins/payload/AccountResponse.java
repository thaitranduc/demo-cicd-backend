package thaitd.cicd.jenkins.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import thaitd.cicd.jenkins.model.Account;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountResponse {
    private int id;
    private String email;
    private String name;
    private String role;

    public static AccountResponse setResponse(Account account) {
        return AccountResponse.builder()
                .id(account.getId())
                .email(account.getEmail())
                .name(account.getName())
                .role(account.getRole().getName())
                .build();
    }
}
