package top.ctong.springboothelloservicestarterautoconfigure.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import top.ctong.springboothelloservicestarterautoconfigure.bean.HelloProperties;

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
 *
 * </p>
 *
 * @author UpYou
 * @version V1.0
 * @class HelloServlet
 * @create 2021-07-18 17:16
 */
public class HelloService implements Serializable {

    public HelloService() {
        // 防止存在一个或多个有参构造器时反射通过无参构造起实例化发生异常
    }

    @Autowired
    private HelloProperties helloProperties;

    public String sayHello(String userName) {
        return helloProperties.getPrefix()+" : " + userName + " >> " + helloProperties.getSuffix();
    }
}
