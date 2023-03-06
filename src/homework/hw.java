package homework;

public class hw {
    public static void exercise1(){

        System.out.println("Exercise 1:");

        int year = 2024;

        boolean yearCheck = tasks.isYearIsLeap(year);

        tasks.printYearCheck(yearCheck, year);

        //**********check another data**********

        year = 2022;

        yearCheck = tasks.isYearIsLeap(year);

        tasks.printYearCheck(yearCheck, year);


        System.out.println(" ");
    }
    public static void exercise2(){
        System.out.println("Exercise 2:");

        int releaseDate = 2025;
        int clientOS = 0;

        tasks.isDeviceOk(releaseDate, clientOS);


        //**********check another data**********
        releaseDate = 2022;
        clientOS = 1;

        tasks.isDeviceOk(releaseDate, clientOS);

        System.out.println(" ");

    }
    public static void exercise3(){
        System.out.println("Exercise 3:");


        int clientDistance = 39;
        int days = tasks.daysToDelivery(clientDistance);
        tasks.printDeliveryTime(days);

        //**********check another data**********
        clientDistance = 150;
        days = tasks.daysToDelivery(clientDistance);
        tasks.printDeliveryTime(days);


        System.out.println(" ");
    }
}
