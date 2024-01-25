package chapter7;


class StringDemo {

    static boolean eqString (String x, String y){

        return x.equals(y);
    }
    static char HexStr(String x) {

        char y = x.charAt(x.length() - 1);
        return y;
    }

    public static void main(String[] args) {

        String str1 = "JavaCompetition";
        String str2 = "JavaCompiler";

        System.out.println(HexStr(str1));
        System.out.println(eqString(str1, str2));
    }
}
