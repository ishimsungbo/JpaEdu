package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class Controller {


    @Autowired
    private WordService wordService;

    @GetMapping("/test")
    public String test(){
        log.info("호출했습니다.");
        return "test";
    }

    @GetMapping("/world")
    public List<World> test1(){
        return wordService.findAll();
    }

    @GetMapping("/worldOne")
    public World test2(){
        return wordService.getOne(3);
    }

    @GetMapping("/createWorld")
    public World test3(){
        World world = new World();
        world.setLang("korean");
        world.setMoney("won");
        world.setNation("kor");
        world.setPopulation(5000);
        wordService.saveWorld(world);

        System.out.println("생성됨....");

        return world;
    }

    @GetMapping("/worldLang")
    public List<World> langLike(){
        return wordService.findByLangEndingWith("English");
    }
}
