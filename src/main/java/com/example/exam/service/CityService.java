package com.example.exam.service;

import com.example.exam.model.City;
import com.example.exam.model.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CityService {

    Page<City> fillAll(Pageable pageable);

    City findById(Long id);

    void save(City city);

    void remove(Long id);

    Iterable<City> findAllByCountry(Country country);

    Page<City> findAllByNameContaining(String name, Pageable pageable);

}
