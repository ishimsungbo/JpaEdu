package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TemplateDatabasesLoader {

    // 부트 최초 시작시 하는 행동?

    @Bean
    CommandLineRunner initialize(){
        return args ->{
          System.out.println("모지 =======================");
        };
    }

}
