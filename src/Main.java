public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке" + "\n");
        } else if (clientOS == 1) {
        } else {
            System.out.println("Операционная система не опознана" + "\n");
        }
        int clientDeviceYear = 2010;
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке" + "\n");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке" + "\n");
                    break;
                default:
                    System.out.println("Операционная система не опознана" + "\n");
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке" + "\n");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке" + "\n");
                    break;
                default:
                    System.out.println("Операционная система не опознана" + "\n");
            }
        }
        System.out.println("Задача 3");
        int year = 2026;
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным" + "\n");
        } else {
            System.out.println(year + " год не является високосным" + "\n");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int dayDelivery = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + dayDelivery + "\n");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            dayDelivery = dayDelivery + 1;
            System.out.println("Потребуется дней: " + dayDelivery + "\n");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            dayDelivery = dayDelivery + 2;
            System.out.println("Потребуется дней: " + dayDelivery + "\n");
        } else {
            System.out.println("Доставки нет" + "\n");
        }
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Принадлежит к сезону: Зима" + "\n");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону: Весна " + "\n");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону: Лето " + "\n");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону: Осень " + "\n");
                break;
            default:
                System.out.println("Такого месяца не существует. " + "\n");
        }
    }
}


