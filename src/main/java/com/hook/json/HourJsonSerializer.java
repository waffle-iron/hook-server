package com.hook.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class HourJsonSerializer extends JsonSerializer<Date> {

    private static final String HOUR_MINUTES = "HH:mm";
    
    /**
     * (non-Javadoc) {@inheritDoc}
     * 
     * @see org.codehaus.jackson.map.JsonSerializer#serialize(java.lang.Object,
     *      org.codehaus.jackson.JsonGenerator,
     *      org.codehaus.jackson.map.SerializerProvider)
     */
    @Override
    public void serialize(final Date value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
        SimpleDateFormat format = new SimpleDateFormat(HOUR_MINUTES);
        jgen.writeString(format.format(value));
    }
}