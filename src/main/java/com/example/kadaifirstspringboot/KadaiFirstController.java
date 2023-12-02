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
    public String dayOfWeek(@PathVariable String targetDateString) {
        DateTimeFormatter formatter     = DateTimeFormatter.ofPattern("yyyyMMdd");
        DayOfWeek targetDayOfWeek       = LocalDate.parse(targetDateString, formatter).getDayOfWeek();
        String targetDayOfWeekString    = targetDayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        return targetDayOfWeekString;
    }

}
