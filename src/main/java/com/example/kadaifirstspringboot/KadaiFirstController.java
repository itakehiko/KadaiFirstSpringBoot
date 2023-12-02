package com.example.kadaifirstspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{targetDateString}")
    public String dispDayOfWeek(@PathVariable String targetDateString) {
        DateTimeFormatter formatter     = DateTimeFormatter.ofPattern("yyyyMMdd");
        DayOfWeek targetDayOfWeek       = LocalDate.parse(targetDateString, formatter).getDayOfWeek();
        String targetDayOfWeekString    = targetDayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        return targetDayOfWeekString;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
        return String.valueOf(val1 + val2);
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
        return String.valueOf(val1 - val2);
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
        return String.valueOf(val1 * val2);
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
        return String.valueOf(val1 / val2);
    }

}
