package dk.tdc.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DateFeature {
    private static final Logger log = LoggerFactory.getLogger(DateFeature.class);

    public void checkDate() {

        log.info("checkDate ---------- ");
        String format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, h:mm B")
                .format(LocalDateTime.now());
        log.info("date: {}", format);


    }

}
