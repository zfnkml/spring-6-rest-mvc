package guru.springframework.spring6restmvc.services;

import guru.springframework.spring6restmvc.model.Beer;

import java.util.UUID;

/*
 ** 2024, August 01, Thursday, 5:08 PM
 */
public interface BeerService {

    Beer getBeerById(UUID id);
}
