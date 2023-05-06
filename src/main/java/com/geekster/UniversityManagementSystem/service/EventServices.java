package com.geekster.UniversityManagementSystem.service;

import com.geekster.UniversityManagementSystem.model.Event;
import com.geekster.UniversityManagementSystem.repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EventServices {
    @Autowired
    IEventRepository eventRepository;
    public String addEvent(Event e) {
        eventRepository.save(e);

        return "event added!!!!!!!!!!!!";
    }

    public String updateEventByEventId(Integer eventId, String eventName) {
        eventRepository.updateEventByEventId(eventId,eventName);
        return "Event updated!!!!!!!!!";
    }

    public String deleteEventById(Integer eventId) {
        eventRepository.deleteById(eventId);
        return "event Deleted........!!!!!";
    }

    public List<Event> getAllEvents() {
        return eventRepository.getAllEvent();
    }
}
