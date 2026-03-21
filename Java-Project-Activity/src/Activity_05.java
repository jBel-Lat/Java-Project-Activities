import java.util.Scanner;

public class Activity_05 {
    public static void main(String[] args) {

        Scanner eskan = new Scanner(System.in);

        double bal = 1000.00;
        int choice;

        while (true) {
            System.out.println("\n===== SIMPLE ATM SYSTEM =====\n1 - Check Balance\n2 - Deposit Money\n3 - Withdraw Money\n4 - Exit\nEnter choice: ");
            choice = eskan.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Balance: %.2f\n", bal);
                    break;
                case 2:
                    System.out.print("Deposit amount: ");
                    double dep = eskan.nextDouble();
                    if (dep > 0) {
                        bal += dep;
                        System.out.printf("Success! New Balance: %.2f\n", bal);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;
                case 3:
                    System.out.print("Withdraw amount: ");
                    double wd = eskan.nextDouble();
                    if (wd > 0 && wd <= bal) {
                        bal -= wd;
                        System.out.printf("Success! Remaining Balance: %.2f\n", bal);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Pawer opp");
                    eskan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Inpput. Try again.");
            }
        }
    }
}