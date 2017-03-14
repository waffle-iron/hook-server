package com.hook.json;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeserializarDate {

    public Date deserializarDate(String date, String parser) {
        SimpleDateFormat format = new SimpleDateFormat(parser);
        Date value = null;

        if(date != null && !date.isEmpty()){
            try {
                value = format.parse(date);
            } catch (ParseException e) {
                return null;
            }
        }
        
        return value;
    }
}
