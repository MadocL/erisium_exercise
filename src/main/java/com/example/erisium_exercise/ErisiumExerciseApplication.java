package com.example.erisium_exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class  ErisiumExerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErisiumExerciseApplication.class, args);
    }

}
