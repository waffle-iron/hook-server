package com.hook.json;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class HourJsonDeserializer extends JsonDeserializer<Date> {

    private static final String HOUR_MINUTES = "HH:mm";

    /**
     * (non-Javadoc) {@inheritDoc}
     * 
     * @throws IOException
     * 
     * @see org.codehaus.jackson.map.JsonDeserializer#deserialize(org.codehaus.jackson.JsonParser,
     *      org.codehaus.jackson.map.DeserializationContext)
     */
    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        return new DeserializarDate().deserializarDate(jp.getText(), HOUR_MINUTES);
    }

}