package dk.tdc.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
    private static final Logger log = LoggerFactory.getLogger(MainClass.class);


    // Main driver method
    public static void main(String[] args) {

        // Creating object with default constructor
        CeStatus ceStatus = new CeStatus("accepted");
        CeStatus ceStatus2 = new CeStatus("accepted");
        CeStatus ceStatusRejected = new CeStatus("rejected");

        // check the auto generated getter methods
        System.out.println(" --- start ---");
        System.out.println("Accepted?: " + ceStatus.ceStatus());
        System.out.println("Rejected?: " + ceStatusRejected.ceStatus());

        // Auto-generated toString() method
        System.out.println("toString: " + ceStatus);

        System.out.println("Check Equal");

        if (ceStatus.equals(ceStatusRejected)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (ceStatus.equals(ceStatus2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        System.out.println(" --- end ---");

        System.out.println("runtime on mac: 75 ms On windows 300 ms");

        log.info("--------------------------------------------------------");
        log.info("");
        DateFeature dateFeature = new DateFeature();
        dateFeature.checkDate();
        StreamFeature streamFeature = new StreamFeature();
        streamFeature.checkStream();

        OtherFeatures otherFeatures = new OtherFeatures();
        otherFeatures.checkFeatures();

    }
}