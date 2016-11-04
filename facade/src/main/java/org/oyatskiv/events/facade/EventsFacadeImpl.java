package org.oyatskiv.events.facade;

import org.oyatskiv.events.Info.EventInfo;
import org.oyatskiv.events.converter.EventInfoConverter;
import org.oyatskiv.events.service.event.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventsFacadeImpl implements EventsFacade {

    @Autowired
    private EventsService eventsService;

    @Autowired
    private EventInfoConverter eventInfoConverter;

    @Override
    public void createEvent(final EventInfo eventInfo) {
        eventsService.createEvent(eventInfoConverter.convert(eventInfo));
    }
}
