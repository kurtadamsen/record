package dk.tdc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OtherFeatures {
    private static final Logger log = LoggerFactory.getLogger(OtherFeatures.class);

    public void checkFeatures() {

        Object obj = "TEST";
        // declare the var text as part of if
        if (obj instanceof String text) {
            log.info("tekst is: {}", text);
        }
    }
}
