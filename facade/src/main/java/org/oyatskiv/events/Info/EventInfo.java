package org.oyatskiv.events.Info;

import org.oyatskiv.events.model.event.EventType;

public class EventInfo {

    private EventType eventType;

    public EventInfo() {
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(final EventType eventType) {
        this.eventType = eventType;
    }
}
