package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        // todo impl
        return new ResponseEntity<>(BeerDto.builder().id(UUID.randomUUID()).build(), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveNewBeer(@RequestBody BeerDto beerDto) {
        // todo impl
    }

    @PutMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        // todo impl
    }

}
