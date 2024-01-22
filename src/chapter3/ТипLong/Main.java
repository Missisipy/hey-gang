package chapter3.ТипLong;

public class Main {
    public static void main(String[] args){
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // по данным Yandex скорсть света составляет 299 792 458 м/с

        lightspeed = 299_792_458;

        days = 500;

        seconds = days * 24 * 3600;

        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдёт около ");
        System.out.println(distance + " метров");
    }
}
