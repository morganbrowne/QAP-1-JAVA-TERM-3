package QAP1;

public class TestDate {
    public static void main(String[] args) {
        // Create date object 
        Date today = new Date(18, 9, 2024);

        //Print the date with toString...
        System.out.println("Todays date: " + today.toString());

        // Print new date... 
        today.setDate(9, 12, 2024);
        System.out.println("New Date: " + today.toString());
    }
}
