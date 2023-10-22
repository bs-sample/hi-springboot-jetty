package net.hifor.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IKin <br/>
 * @description hello  <br/>
 * @date 2023/10/22 <br/>
 */
@RestController
public class HelloSpringbootController {

    /**
     * 第一个方法
     * @return
     */
    @GetMapping("/")
    public String hello() {
        return "Hello Spring boot Jetty!";
    }
}
