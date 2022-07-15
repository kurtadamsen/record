package dk.tdc.test;

public class MainClass {


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
        System.out.println(" --- end ---");

        // Auto-generated toString() method
        System.out.println("toString: " + ceStatus);

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
    }
}