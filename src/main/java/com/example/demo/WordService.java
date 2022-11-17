package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordService {

    private final WorldRepository worldRepository;

    public WordService(WorldRepository worldRepository) {
        this.worldRepository = worldRepository;
    }

    public List<World> findAll(){
        return worldRepository.findAll();
    }

    public World getOne(Integer id){
        return worldRepository.getOne(id);
    }

    public void saveWorld(World world){
        worldRepository.save(world);
    }

    public List<World> findByLangEndingWith(String lang){
        return worldRepository.findByLangEndingWith(lang);
    }


}
