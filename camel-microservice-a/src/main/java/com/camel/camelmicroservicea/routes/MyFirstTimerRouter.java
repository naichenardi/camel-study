package com.camel.camelmicroservicea.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MyFirstTimerRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//        from("timer:first-time")
//                .log("${body}")
//                .transform().constant("Date Time is " + LocalDateTime.now())
//                .log("${body}")
//                .to("log:first-time");
    }
}
