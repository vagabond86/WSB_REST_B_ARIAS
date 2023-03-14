package wsb.rest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class BaritoneArias {


    private Long id;
    private String name;
    private String character;
    private String composer;
    private String opera;
    private Long year;
    private String language;
}
