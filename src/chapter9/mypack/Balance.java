package chapter9.mypack;

public class Balance {
    private String name;
    private double bal;
    public Balance (String name, double bal) {
        this.name = name;
        this.bal = bal;
    }
    public void show () {
        if (bal < 0) System.out.println("--> ");
        System.out.println(name + ": $" + bal);
    }
}