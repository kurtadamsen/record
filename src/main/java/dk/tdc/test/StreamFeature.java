package dk.tdc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFeature {
    private static final Logger log = LoggerFactory.getLogger(DateFeature.class);

    public void checkStream() {
        List<String> integersAsString = Arrays.asList("1", "2", "3");
        List<Integer> intsOld = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> intsNew = integersAsString.stream().map(Integer::parseInt).toList();
        log.info(intsNew.toString());
    }
}
