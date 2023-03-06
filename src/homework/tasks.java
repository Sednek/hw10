package homework;

import java.time.LocalDate;

public class tasks {
    public static boolean isYearIsLeap(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void printYearCheck(boolean yearCheck, int year){
        if (yearCheck){
            System.out.printf("%d год - високосный год\n", year);
        } else {
            System.out.printf("%d год - невисокосный год\n", year);
        }
    }



    public static void isDeviceOk(int releaseDate, int clientOS){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (releaseDate >= currentYear){
                System.out.println("Установите версию приложения для iOS по ссылке : https://mybank.com/ios");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке: https://mybank.com/ios/light_version");
            }
        }
        else {
            if (releaseDate >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке: https://mybank.com/android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке: https://mybank.com/android/light_version");
            }
        }

    }



    public static int daysToDelivery(int deliveryDistance) {
        int deliveryTime = 0;

        if (deliveryDistance <= 20){
            deliveryTime = deliveryTime + 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = deliveryTime + 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 3;
        }
        if (deliveryDistance > 100) {
            deliveryTime = -1;
        }

        return deliveryTime;
    }
    public static void printDeliveryTime(int deliveryTime){
        if (deliveryTime < 0){
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println("Дней доставки: " + deliveryTime);
        }
    }
}