package com.hook.json;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class DateHourJsonDeserializer extends JsonDeserializer<Date> {

    private static final String DAY_MONTH_YEAR_HOUR_MINUTES = "dd/MM/yyyy HH:mm";
    
    @Override
    public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        return new DeserializarDate().deserializarDate(jp.getText(), DAY_MONTH_YEAR_HOUR_MINUTES);
    }

}
