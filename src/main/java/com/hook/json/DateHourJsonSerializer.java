package com.hook.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class DateHourJsonSerializer extends JsonSerializer<Date> {

    private static final String DAY_MONTH_YEAR_HOUR_MINUTES = "dd/MM/yyyy HH:mm";
    
    @Override
    public void serialize(Date value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        SimpleDateFormat format = new SimpleDateFormat(DAY_MONTH_YEAR_HOUR_MINUTES);
        jgen.writeString(format.format(value));
    }

}
