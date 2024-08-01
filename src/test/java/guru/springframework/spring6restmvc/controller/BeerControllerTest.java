package guru.springframework.spring6restmvc.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/*
 ** 2024, August 01, Thursday, 5:32 PM
 */
@Slf4j
@SpringBootTest
class BeerControllerTest {

    @Autowired
    BeerController beerController;

    @Test
    void getBeerById() {
        log.debug("{}.{}()", getClass().getSimpleName(), new Object(){}.getClass().getEnclosingMethod().getName());

        System.out.println(beerController.getBeerById(UUID.randomUUID()));
    }
}