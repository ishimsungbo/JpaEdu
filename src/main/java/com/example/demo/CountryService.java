package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository worldRepository;

    public CountryService(CountryRepository worldRepository) {
        this.worldRepository = worldRepository;
    }

    public List<Country> findAll(){
        return worldRepository.findAll();
    }

    public Country getOne(Integer id){
        return worldRepository.getOne(id);
    }

    public void saveWorld(Country world){
        worldRepository.save(world);
    }

    public List<Country> findByLangEndingWith(String lang){
        return worldRepository.findByLangEndingWith(lang);
    }


}
