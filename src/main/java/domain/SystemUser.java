package domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Tolerate;

/**
 * Model of logged user
 *
 * @author Claudio E. de Oliveira on on 28/04/16.
 */
@Data
@EqualsAndHashCode(of = {"nickname"})
@Builder(toBuilder = true)
public class SystemUser {

    private String id;

    private String nickname;

    private String email;

    @Tolerate
    SystemUser(){}

}
