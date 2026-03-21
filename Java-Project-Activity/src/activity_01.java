import java.util.Scanner;
public class activity_01 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       String name,course,bday,home,status,pro;
            System.out.print("Enter your name: ");
            name= input.nextLine();
            System.out.print("Enter your course: ");
            course= input.nextLine();
            System.out.print("Enter your birthday: ");
            bday= input.nextLine();
            System.out.print("Enter your home town: ");
            home= input.nextLine();
            System.out.print("Enter your status: ");
            status= input.nextLine();
            System.out.print("Enter your profession: ");
            pro= input.nextLine();


       System.out.print("Welcome "+name+"!\n"+"Welcome to "+course+"!\n"+
               "We will be recording you as our birth month celebrant. Your birthday is "+
               bday+"\nHere are some of your Personal Information!\n"+
               "Home Town: "+home+"\nStatus: "+status+"\nProfession: "+pro);
        }
    }
