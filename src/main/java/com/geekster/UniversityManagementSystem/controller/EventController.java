package com.geekster.UniversityManagementSystem.controller;

import com.geekster.UniversityManagementSystem.model.Event;
import com.geekster.UniversityManagementSystem.service.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/uni/event")
public class EventController {
    @Autowired
    EventServices eventServices;
    @PostMapping(value = "/addEvent")
    public String addEvent(@RequestBody Event e){
        return eventServices.addEvent(e);
    }
    @PutMapping(value = "/updateEvent/{eventId}/{eventName}")
    public String updateEventByEventId(@PathVariable Integer eventId,@PathVariable String eventName){
       return eventServices.updateEventByEventId(eventId,eventName);
    }
    @DeleteMapping(value = "/deleteEvent/{eventId}")
    public String deleteEventById(@PathVariable Integer eventId){
        return eventServices.deleteEventById(eventId);
    }
    @GetMapping(value = "/getAllEvents")
    public List<Event> getAllEvents(){
        return eventServices.getAllEvents();
    }


}
