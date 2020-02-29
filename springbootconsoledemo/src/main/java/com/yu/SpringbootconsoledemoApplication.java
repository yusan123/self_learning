package com.yu;

import com.yu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringbootconsoledemoApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(SpringbootconsoledemoApplication.class);

    public static void main(String[] args) {
        //这种可以关掉banner
//        SpringApplication springApplication = new SpringApplication(SpringbootconsoledemoApplication.class);
//        springApplication.setBannerMode(Banner.Mode.OFF);
//        springApplication.run();
        SpringApplication.run(SpringbootconsoledemoApplication.class, args);

    }

    @Value("#{'${user.ids}'.split(',')}")
    private List<Integer> ids;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("springboot CommandLinaRunner is running");

        if (strings.length < 1) {
            System.err.println("lost param check type");
        } else if (strings.length == 1) {
            if("querybyconfig".equals(strings[0])){
                userService.queryFromConfig(ids);
            }else if("all".equals(strings[0])){
                userService.showAllUsers();
            }else {
                System.err.println("param type error");
            }
        } else {
            if ("one".equals(strings[0])) {
                userService.showOneUserById(Integer.parseInt(strings[1]));
            } else {
                System.err.println("param type error");
            }
        }

    }

}
