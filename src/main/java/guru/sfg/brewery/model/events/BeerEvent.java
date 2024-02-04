package guru.sfg.brewery.model.events;

import guru.sfg.brewery.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = 1548909497305769317L;

    private BeerDto beerDto;
}
