import  java.util.Scanner;
public class Activity_03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double rate,otHours,otRate,allowance,sss, pagibig,phil,cashAdv,bond,others,regular,OT,gross;

        System.out.println("----- PAYROLL INPUT -----");
        System.out.print("Days Worked: ");
        int days = inp.nextInt();
        if (days < 0) {
            System.out.println("Invalid input! Days worked cannot be negative.");
            return;
        }

        System.out.print("Rate per Day: ");
         rate = inp.nextDouble();

        System.out.print("Overtime Hours: ");
        otHours = inp.nextDouble();

        System.out.print("Overtime Rate: ");
        otRate = inp.nextDouble();

        System.out.print("Allowance: ");
         allowance = inp.nextDouble();

        System.out.println("\n----- DEDUCTIONS -----");

        System.out.print("SSS/GSIS: ");
         sss = inp.nextDouble();

        System.out.print("Pagibig: ");
        pagibig = inp.nextDouble();

        System.out.print("PhilHealth: ");
        phil = inp.nextDouble();

        System.out.print("Cash Advance: ");
         cashAdv = inp.nextDouble();

        System.out.print("Cash Bond: ");
         bond = inp.nextDouble();
        System.out.print("Others: ");
        others = inp.nextDouble();

         regular = days * rate;
         OT = otHours * otRate;
         gross = regular + OT + allowance;

        double tax;
        if (gross <= 10000) {
            tax = gross * 0.05;
        } else if (gross <= 20000) {
            tax = gross * 0.10;
        } else {
            tax = gross * 0.15;
        }
        double totalDed = sss + pagibig + phil + cashAdv + bond + others + tax;
        double net = gross - totalDed;
        /*System.out.printf("\n----- PAYROLL SUMMARY -----"+ "\nRegular Income: %.2f\n",regular+"Overtime Income: %.2f\n", OT+"Gross Income: %.2f\n", gross+
                "Tax: %.2f\n", tax+"Total Deductions: %.2f\n", totalDed+"Net Pay: %.2f\n", net);*/
        System.out.println("\n----- PAYROLL SUMMARY -----");
        System.out.printf("Regular Income: %.2f%n", regular);
        System.out.printf("Overtime Income: %.2f%n", OT);
        System.out.printf("Gross Income: %.2f%n", gross);
        System.out.printf("Withholding Tax: %.2f%n", tax);
        System.out.printf("Total Deductions: %.2f%n", totalDed);
        System.out.printf("Net Pay: %.2f%n", net);
        if (net < 0) {
            System.out.println("Warning: Deductions are greater than income.");
        } else if (net < 5000) {
            System.out.println("Note: Net pay is relatively low.");
        } else {
            System.out.println("Good! Net pay is within normal range.");
        }
        inp.close();
    }
}