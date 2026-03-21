import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Activity_02 {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm a");
        LocalDateTime date = LocalDateTime.now();
        String time = date.format(format);

        String user,act;
        System.out.print("\nEnter your username: ");
        user = scan.nextLine();
        System.out.println("\nLogin successful!\nUser: "+user+"\nLogin time: "+time);

        System.out.print("\nEnter Enter your activity: ");
        act=scan.nextLine();
        System.out.println("\n-----USER ACTIVITY-----\n"+
                "User: "+user+
                "\nActivity: "+act+
                "\nActivity time:: "+time);
        System.out.print("\nPress ENTER to logout...\n");
        scan.nextLine();
        System.out.println("\nLogout  successful!\n"+
                "User: "+user+"\nLogout time: "+time);
        scan.close();
    }
}