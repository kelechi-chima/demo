package com.demo.misc;

import java.util.Date;
import java.util.Objects;

public class Event {
    
    private Date date;
    private String payload;
    
    public Event(final Date date, final String payload) {
        this.date = date;
        this.payload = payload;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(final Date date) {
        this.date = date;
    }
    
    public String getPayload() {
        return payload;
    }
    
    public void setPayload(final String payload) {
        this.payload = payload;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final Event event = (Event) o;
        return Objects.equals(date, event.date) && Objects.equals(payload, event.payload);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(date, payload);
    }
}
