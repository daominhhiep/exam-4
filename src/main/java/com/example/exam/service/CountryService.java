package com.example.exam.service;

import com.example.exam.model.Country;

public interface CountryService {

    Iterable<Country> findAll();

    Country findById(Long id);

    void save(Country country);

    void remove(Long id);
}
