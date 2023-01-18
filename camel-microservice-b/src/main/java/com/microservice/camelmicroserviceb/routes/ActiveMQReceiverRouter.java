package com.microservice.camelmicroserviceb.routes;

import com.microservice.camelmicroserviceb.dto.User;
import com.microservice.camelmicroserviceb.processors.UserProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;


@Component
public class ActiveMQReceiverRouter extends RouteBuilder {
    private final UserProcessor userProcessor;

    public ActiveMQReceiverRouter(UserProcessor userProcessor) {
        this.userProcessor = userProcessor;
    }

    @Override
    public void configure() throws Exception {
//        from("activemq:my-activemq-queue")
//                .unmarshal().json(JsonLibrary.Jackson, User.class)
//                .bean(userProcessor)
//                .to("log:received-message-from-active-mq");
    }
}
