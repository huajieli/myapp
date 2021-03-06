package cn.huajieli.controller;

import cn.huajieli.log.MyLog;
import cn.huajieli.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huajieli
 * @create 2021-10-02 11:58
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @MyLog(desc = "这是方法的描述")
    @GetMapping("/say")
    public String sayHello() {
        return helloService.sayHello();
    }
}
