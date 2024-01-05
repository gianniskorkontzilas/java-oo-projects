package gr.aueb.cf.bankapp.model;

public class Main {

    public static void main(String[] args) {

        OverdraftAccount overdraftAccount = new OverdraftAccount(1, 100.5,500.2);
        JointAccount jointAccount = new JointAccount(2, 2000, "John Doe", "Jane Doe");


        try {
            overdraftAccount.withdraw(4000.50);
            System.out.println("Successful deposit");

            jointAccount.deposit(100.5);
            System.out.println("Successful withdraw");

            System.out.println(overdraftAccount.overdraftToString());
            System.out.println(jointAccount.jointAccountToString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

