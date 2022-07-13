package bansal.navjeet.msscberservice.web.controller;

import bansal.navjeet.msscberservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId ){
        return new ResponseEntity<>( HttpStatus.CREATED);
    }
    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beerDto){

        return new ResponseEntity<>(beerDto, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        return new ResponseEntity<>(beerDto, HttpStatus.ACCEPTED);
    }
}
