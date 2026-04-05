import java.util.Scanner;

public class Activity07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        String studNo,studName, subject,Remarks,Rating,finalRemarks;
        double prelim, midterm,semifinal,finals,highest, lowest, average;
        while (true) {

            System.out.println("===== MENU =====\n1 - Start Student Grading System\n2 - Exit\nEnter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student No.: ");
                    studNo = input.nextLine();

                    System.out.print("Enter Student Name: ");
                    studName = input.nextLine();
                    System.out.print("Enter Subject: ");
                    subject = input.nextLine();

                    System.out.print("Enter Prelim Grade: ");
                    prelim = input.nextDouble();

                    System.out.print("Enter Midterm Grade: ");
                    midterm = input.nextDouble();

                    System.out.print("Enter Pre-final Grade: ");
                    semifinal = input.nextDouble();

                    System.out.print("Enter Final Grade: ");
                    finals = input.nextDouble();

                    int completed = 0;

                    if (prelim > 0) {
                        completed++;
                    }
                    if (midterm > 0) {
                        completed++;
                    }
                    if (semifinal > 0) {
                        completed++;
                    }
                    if (finals > 0) {
                        completed++;
                    }

                    highest = prelim;
                    lowest = prelim;

                    if (midterm > highest) {
                        highest = midterm;
                    }
                    if (semifinal > highest) {
                        highest = semifinal;
                    }
                    if (finals > highest) {
                        highest = finals;
                    }

                    if (midterm < lowest) {
                        lowest = midterm;
                    }
                    if (semifinal < lowest) {
                        lowest = semifinal;
                    }
                    if (finals < lowest) {
                        lowest = finals;
                    }

                    average = (prelim + midterm + semifinal + finals) / 4;

                  
                    if (completed == 4) {
                        Remarks = "Complete!";
                    } else if (completed == 0) {
                        Remarks = "Dropped!";
                    } else {
                        Remarks = "Incomplete!";
                    }

                   
                    if (average == 0) {
                        Rating = "Dropped";
                        finalRemarks = "Failed";
                    } else {
                        if (average > 100) {
                            Rating = "Out of Range";
                        } else {
                            if (average >= 98 && average <= 100) {
                                Rating = "1.00";
                            } else if (average >= 95 && average <= 97) {
                                Rating = "1.25";
                            } else if (average >= 92 && average <= 94) {
                                Rating = "1.50";
                            } else if (average >= 89 && average <= 91) {
                                Rating = "1.75";
                            } else if (average >= 86 && average <= 88) {
                                Rating = "2.00";
                            } else if (average >= 83 && average <= 85) {
                                Rating = "2.25";
                            } else if (average >= 80 && average <= 82) {
                                Rating = "2.50";
                            } else if (average >= 77 && average <= 79) {
                                Rating = "2.75";
                            } else if (average >= 75 && average <= 76) {
                                Rating = "3.00";
                            } else {
                                Rating = "5.00";
                            }
                        }

                        if (average >= 75) {
                            finalRemarks = "Passed";
                        } else {
                            finalRemarks = "Failed";
                        }
                    }

                    System.out.println("\n===== RESULT =====\n" + "Student No.: " + studNo+ "\nStudent Name: " + studName + "\nSubject: " + subject + "Subject: " + subject + "Academic Grading Period Completed: " + completed
                        + "\nRemarks: " + Remarks + "Highest Grade: " + highest + "\nLowest Grade: " + lowest + "\nGeneral Average: " + average + "\nCollege Rating: " + Rating + "\nRemarks: " + finalRemarks+"\n\n");
                    break;

                case 2:
                    System.out.println("Program Ended.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}