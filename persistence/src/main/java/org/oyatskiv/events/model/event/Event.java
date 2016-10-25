package org.oyatskiv.events.model.event;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = Event.COLLECTION_NAME)
public class Event {

    public static final String COLLECTION_NAME = "events";

    @Id
    private String id;

    private EventType eventType;

    private LocalDateTime creationDate;

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(final EventType eventType) {
        this.eventType = eventType;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(final LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Event event = (Event) o;

        if (eventType != event.eventType) return false;
        return creationDate != null ? creationDate.equals(event.creationDate) : event.creationDate == null;

    }

    @Override
    public int hashCode() {
        int result = eventType != null ? eventType.hashCode() : 0;
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }

    public interface Meta {
        String ID = "_id";
        String EVENT_TYPE = "eventType";
        String CREATION_DATE = "creationDate";
    }

}
