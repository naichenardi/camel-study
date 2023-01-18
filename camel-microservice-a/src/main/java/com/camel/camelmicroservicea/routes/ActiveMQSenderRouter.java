package com.camel.camelmicroservicea.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQSenderRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//        from("timer:active-mq-timer?period=10000")
//                .transform().constant("{ \"id\": 12332, \"name\": \"Naiche\", \"cellphone\": \"321321321\"}")
//                .log("${body}")
//                .to("activemq:my-activemq-queue");kAFKA
    }
}
