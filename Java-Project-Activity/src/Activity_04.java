import  java.util.Scanner;
public class Activity_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month;
        int day;

        System.out.print("Enter Month: ");
        month = input.nextLine();

        System.out.print("Enter Day: ");
        day = input.nextInt();

        if (month.equalsIgnoreCase("January")) {
            if (day >= 1 && day <= 19) {
                System.out.println("\nAng horoscope mo Capricornus ay...\n" + "Makaka-commit ka sa GitHub...\n" + "pero nakalimutan mong i-test ang program.\n" + "Good luck sa pull request.");
            } else if (day >= 20 && day <= 31) {
                System.out.println("\nAng horoscope mo Aquarius ay...\n" + "Magkakaroon ka ng bright idea today...\n" + "pagkatapos mong uminom ng 3 kape habang nagco-code.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("February")) {
            if (day >= 1 && day <= 18) {
                System.out.println("\nAng horoscope mo Aquarius ay...\n" + "Magkakaroon ka ng bright idea today...\n" + "pagkatapos mong uminom ng 3 kape habang nagco-code.");
            } else if (day >= 19 && day <= 29) {
                System.out.println("\nAng horoscope mo Pisces ay...\n" + "Magiging smooth ang coding mo today...\n" + "hanggang sa ma-delete mo ang buong file by accident.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("March")) {
            if (day >= 1 && day <= 20) {
                System.out.println("\nAng horoscope mo Pisces ay...\n" + "Magiging smooth ang coding mo today...\n" + "hanggang sa ma-delete mo ang buong file by accident.");
            } else if (day >= 21 && day <= 31) {
                System.out.println("\nAng horoscope mo Aries ay...\n" + "Magiging confident ka today sa coding...\n" + "hanggang sa makita mo ang error na: missing ; sa line 2.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("April")) {
            if (day >= 1 && day <= 19) {
                System.out.println("\nAng horoscope mo Aries ay...\n" + "Magiging confident ka today sa coding...\n" + "hanggang sa makita mo ang error na: missing ; sa line 2.");
            } else if (day >= 20 && day <= 30) {
                System.out.println("\nAng horoscope mo Taurus ay...\n" + "Makakagawa ka ng program na gumagana...\n" + "pero hindi mo na alam kung paano mo siya napaandar.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("May")) {
            if (day >= 1 && day <= 20) {
                System.out.println("\nAng horoscope mo Taurus ay...\n" + "Makakagawa ka ng program na gumagana...\n" + "pero hindi mo na alam kung paano mo siya napaandar.");
            } else if (day >= 21 && day <= 31) {
                System.out.println("\nAng horoscope mo Gemini ay...\n" + "May dalawang tab kang bukas:\n" + "Java code\n" + "StackOverflow\n" + "Guess mo kung saan ka mas nakatingin today.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("June")) {
            if (day >= 1 && day <= 21) {
                System.out.println("\nAng horoscope mo Gemini ay...\n" + "May dalawang tab kang bukas:\n" + "Java code\n" + "StackOverflow\n" + "Guess mo kung saan ka mas nakatingin today.");
            } else if (day >= 22 && day <= 30) {
                System.out.println("\nAng horoscope mo Cancer ay...\n" + "Akala mo tama na ang code mo...\n" + "pero may lalabas na bagong error pagkatapos mong ayusin yung isa.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("July")) {
            if (day >= 1 && day <= 22) {
                System.out.println("\nAng horoscope mo Cancer ay...\n" + "Akala mo tama na ang code mo...\n" + "pero may lalabas na bagong error pagkatapos mong ayusin yung isa.");
            } else if (day >= 23 && day <= 31) {
                System.out.println("\nAng horoscope mo Leo ay...\n" + "Tatawagin ka ng instructor para i-explain ang code mo...\n" + "sasabihin mo: \"Sir gumana siya bigla.\"");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("August")) {
            if (day >= 1 && day <= 22) {
                System.out.println("\nAng horoscope mo Leo ay...\n" + "Tatawagin ka ng instructor para i-explain ang code mo...\n" + "sasabihin mo: \"Sir gumana siya bigla.\"");
            } else if (day >= 23 && day <= 31) {
                System.out.println("\nAng horoscope mo Virgo ay...\n" + "Ikaw ang magiging class hero today...\n" + "dahil ikaw lang ang nakakaalam kung saan ilalagay ang Scanner.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("September")) {
            if (day >= 1 && day <= 22) {
                System.out.println("\nAng horoscope mo Virgo ay...\n" + "Ikaw ang magiging class hero today...\n" + "dahil ikaw lang ang nakakaalam kung saan ilalagay ang Scanner.");
            } else if (day >= 23 && day <= 30) {
                System.out.println("\nAng horoscope mo Libra ay...\n" + "Balanced ang buhay mo today:\n" + "50% debugging\n" + "50% staring sa screen wondering bakit ayaw gumana.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("October")) {
            if (day >= 1 && day <= 23) {
                System.out.println("\nAng horoscope mo Libra ay...\n" + "Balanced ang buhay mo today:\n" + "50% debugging\n" + "50% staring sa screen wondering bakit ayaw gumana.");
            } else if (day >= 24 && day <= 31) {
                System.out.println("\nAng horoscope mo Scorpius ay...\n" + "May matutuklasan kang bagong kaibigan sa coding:\n" + "NullPointerException");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("November")) {
            if (day >= 1 && day <= 21) {
                System.out.println("\nAng horoscope mo Scorpius ay...\n" + "May matutuklasan kang bagong kaibigan sa coding:\n" + "NullPointerException");
            } else if (day >= 22 && day <= 30) {
                System.out.println("\nAng horoscope mo Sagittarius ay...\n" + "Mabilis ka mag-type ng code today...\n" + "pero mas mabilis ang paglabas ng errors.");
            } else {
                System.out.println("\nInvalid Input!");
            }

        } else if (month.equalsIgnoreCase("December")) {
            if (day >= 1 && day <= 21) {
                System.out.println("\nAng horoscope mo Sagittarius ay...\n" + "Mabilis ka mag-type ng code today...\n" + "pero mas mabilis ang paglabas ng errors.");
            } else if (day >= 22 && day <= 31) {
                System.out.println("\nAng horoscope mo Capricornus ay...\n" + "Makaka-commit ka sa GitHub...\n" + "pero nakalimutan mong i-test ang program.\n" + "Good luck sa pull request.");
            } else {
                System.out.println("\nInvalid Input!");
            }
        } else {
            System.out.println("\nInvalid Input!");
        }
        input.close();
        }
    }