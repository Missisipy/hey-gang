package charpter5.Операторif;

public class Main {
    public static void main(String[] args){
        int month = 4; // апрель
        String season;

        if (month == 12 || month == 1 || month == 2)
            season = "зима";
        else if (month == 3 || month == 4 || month == 5)
            season = "весна";
        else if (month == 6 || month == 7 || month == 8 )
            season = "лето";
        else if (month == 9 || month == 10 || month == 11)
            season = "осень";
        else
            season = "Несуществующий месяц";
        System.out.println ("Aпpeль - это " + season + ".\n");

        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i равно нулю.");
                    break;
                case 1:
                    System.out.println("i равно одному.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3 :
                    System.out.println("i равно трем.");
                    break;
                default:
                    System.out.println("i больше трех.");
            }
    }
}
