package com.hook.json;

import java.io.IOException;
import java.text.DecimalFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class FloatJsonSerializer extends JsonSerializer<Float> {

    @Override
    public void serialize(final Float value, final JsonGenerator jgen, final SerializerProvider provider) throws IOException {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        jgen.writeString(df.format(value));
    }
}