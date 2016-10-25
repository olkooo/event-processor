package org.oyatskiv.events.service.event;

import org.oyatskiv.events.model.event.Event;
import org.oyatskiv.events.model.event.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventsServiceImpl implements EventsService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void createEvent(final Event event) {
        eventRepository.insert(event);
    }

}
