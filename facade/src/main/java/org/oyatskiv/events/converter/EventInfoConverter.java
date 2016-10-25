package org.oyatskiv.events.converter;

import org.oyatskiv.events.Info.EventInfo;
import org.oyatskiv.events.common.AbstractConverter;
import org.oyatskiv.events.model.event.Event;
import org.springframework.stereotype.Component;

@Component
public class EventInfoConverter extends AbstractConverter<EventInfo, Event> {

    @Override
    public Event convert(final EventInfo eventInfo) {
        final Event event = new Event();
        event.setEventType(eventInfo.getEventType());
        return event;
    }
}
