package exception;

import lombok.Getter;

/**
 * User not found Exception
 * @author Claudio E. de Oliveira on 20/03/16.
 */
public class UserNotFound extends RuntimeException {

    @Getter
    private final String userId;

    public UserNotFound(String userId) {
        this.userId = userId;
    }

}
