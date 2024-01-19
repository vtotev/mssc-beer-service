package guru.sfg.springframework.msscbeerservice.services;

import guru.sfg.springframework.msscbeerservice.web.model.BeerDto;
import guru.sfg.springframework.msscbeerservice.web.model.BeerPagedList;
import guru.sfg.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getByUpc(String upc);

}
