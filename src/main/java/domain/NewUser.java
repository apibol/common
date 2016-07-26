package domain;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

/**
 * Register request new user
 *
 * @author Claudio E. de Oliveira on 03/05/16.
 */
@Data
@Builder(toBuilder = true)
public class NewUser {

    String id;

    String email;

    String nickname;

    @Tolerate
    NewUser(){}

}
