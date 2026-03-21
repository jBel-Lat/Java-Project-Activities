import java.util.Scanner;

public class Activity_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password;
        boolean isLoggedIn = false;
        int i,pick,pin, pinpin = 1234;
        for (i = 1; i <= 3; i++) {
            System.out.print("Enter Pin: ");
            pin = input.nextInt();

            if (pin== pinpin) {
                System.out.println("Access Granted!");
                isLoggedIn = true;
                break;
            } else {
                if (i == 1) {
                    System.out.println("Attempt 1! Incorrect Password");
                } else if (i == 2) {
                    System.out.println("Attempt 2! Warning: Last attempt remaining");
                } else {
                    System.out.println("Attempt 3! Card Blocked");
                }
            }
        }
        if (!isLoggedIn) {
            System.out.println("Too many failed attempts.\nTry after 5 minutes to login again!");
            System.exit(0);
        }

        double balance = 1000.00,deposit,withdraw;


        while (true) {
            System.out.println("\n===== ATM MENU =====\n1 - Check Balance\n2 - Deposit\n3 - Withdraw\n4 - Exit\nEnter choice: ");

            pick = input.nextInt();

            switch (pick) {
                case 1:
                    System.out.printf("Current Balance: %.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                     deposit = input.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposit successful! New Balance: %.2f%n", balance);
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdraw amount: ");
                     withdraw = input.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Withdrawal successful! Remaining Balance: %.2f%n", balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("pawer off");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Inpput");
            }
        }
    }
}