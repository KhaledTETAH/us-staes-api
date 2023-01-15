package com.info.usstates.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StateUtility {
    
    /* utility function to convert a string in 'dd-MM-yyyy' to date type */
    public static Date stringToDate(String date){
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd-MM-yyyy").parse(date);
            
        } catch (ParseException e) {
            
            e.printStackTrace();
        }

      
      return date1;
    }
    
}
