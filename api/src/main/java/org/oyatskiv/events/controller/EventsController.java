package org.oyatskiv.events.controller;

import org.oyatskiv.events.common.ControllerPath;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ControllerPath.Events.ROOT)
public class EventsController {

    @RequestMapping(value = "/hello")
    public String greeting(){
        return "Hello!";
    }

}
