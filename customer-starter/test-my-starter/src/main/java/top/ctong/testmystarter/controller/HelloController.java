package top.ctong.testmystarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import top.ctong.springboothelloservicestarterautoconfigure.servlet.HelloService;

import java.io.Serializable;

/**
 * █████▒█      ██  ▄████▄   ██ ▄█▀     ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒      ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░      ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄      ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄     ██████╔╝╚██████╔╝╚██████╔╝
 * ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒     ╚═════╝  ╚═════╝  ╚═════╝
 * ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 * ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 * ░     ░ ░      ░  ░
 * Copyright 2021 UpYou.
 * <p>
 * 测试HelloServer
 * </p>
 *
 * @author UpYou
 * @version V1.0
 * @class HelloController
 * @create 2021-07-18 18:17
 */
@RestController
public class HelloController implements Serializable {

    public final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        // 防止存在一个或多个有参构造器时反射通过无参构造起实例化发生异常
        this.helloService = helloService;
    }

    public String sayHello() {
        return helloService.sayHello("Clover");
    }

}
