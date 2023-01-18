package com.microservice.camelmicroserviceb.processors;

import com.microservice.camelmicroserviceb.dto.User;
import com.microservice.camelmicroserviceb.routes.ActiveMQReceiverRouter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserProcessor {
    Logger log = LoggerFactory.getLogger(ActiveMQReceiverRouter.class);

    public void processMessage(User user){
        log.info("Doing something with ${user.toString()}");
    }
}
