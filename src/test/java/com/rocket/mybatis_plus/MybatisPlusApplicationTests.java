package com.rocket.mybatis_plus;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Test
    void contextLoads() {
        int [] ints = {0,1,2,3,4};
        Arrays.stream(ints).forEach(System.out::println);
    }

}
