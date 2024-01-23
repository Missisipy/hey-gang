package charpter5.Операторfor;

public class Main {
    public static void main(String[] args) {

        int num;
        boolean isPrime;
        num = 14;
        if (num < 2) isPrime = false;
        else isPrime = true;
        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("являeтcя простым\n");
        else System.out.println("не является простым\n");

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : nums) {
            System.out.println("Значение: " + x);
            sum += x;
        }
        System.out.println("Сумма: " + sum + "\n");

        int[] nums2 = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int x : nums){
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Знaчeниe найдено!");
    }
}
