package guru.sfg.common.events;

import guru.sfg.springframework.msscbeerservice.web.model.BeerDto;
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
