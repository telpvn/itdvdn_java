package a;

public class Account {
    double UAN;
    String name;
    static double courseUSDtoUAN;

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Robert";
        a1.UAN = 2000.05;
        Account.courseUSDtoUAN = 26.1;
        Account a2 = new Account();
        a2.name = "Edward";
        a2.UAN = 1800;
    }
}
