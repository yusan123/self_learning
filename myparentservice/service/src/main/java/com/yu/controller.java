package com.yu;

import org.jboss.logging.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/4/10.
 */
@RestController
public class controller {

    Logger logger = Logger.getLogger(getClass());

    @GetMapping("/e")
    public entity getEntity(){
        logger.info("begin get entity");
        System.out.println("do something");
        return new entity("sdjfaksdjkfjalksdjfkl",123);
    }
}
