package guru.springframework.spring6restmvc.controller;

/*
 ** 2024, August 01, Thursday, 5:18 PM
 */

import guru.springframework.spring6restmvc.model.Beer;
import guru.springframework.spring6restmvc.services.BeerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@Controller
public class BeerController {
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    public Beer getBeerById(UUID id) {
        log.debug("{}.{}()", getClass().getSimpleName(), new Object(){}.getClass().getEnclosingMethod().getName());

        return beerService.getBeerById(id);
    }
}
