package domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author Claudio E. de Oliveira on 28/02/16.
 */
@Data
@Builder(toBuilder = true)
public class Participant {
    
    private String id;
    
    private String nickname;
    
    private String email;
    
}
