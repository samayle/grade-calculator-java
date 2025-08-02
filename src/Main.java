import java.util.Scanner;

public class Main {
    static String studentFirstName = "";
    static String studentLastName = "";
    static String studentID = "";
    static String course = "";
    static String section = "";
    static int PrelimScore = 0;
    static int MidtermScore = 0;
    static int SemiFinalScore = 0;
    static int FinalScore = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter Student Information:");

            System.out.print("First Name:");
            studentFirstName = scan.nextLine();

            System.out.print("Last Name:");
            studentLastName = scan.nextLine();

            System.out.print("ID:");
            studentID = scan.nextLine();

            System.out.print("Course:");
            course = scan.nextLine();

            System.out.print("Section:");
            section = scan.nextLine();

            System.out.println("Enter the following scores:");

            System.out.print("Prelim Score:");
            PrelimScore = scan.nextInt();

            System.out.print("Midterm Score:");
            MidtermScore = scan.nextInt();

            System.out.print("Semi-Final Score:");
            SemiFinalScore = scan.nextInt();

            System.out.print("Final Score:");
            FinalScore = scan.nextInt();

            double generalAverage = 0;
            generalAverage = ((PrelimScore + MidtermScore + SemiFinalScore + FinalScore) / 400d)*100;
            System.out.println("GWA: " +generalAverage);

        if(generalAverage < 75){
            System.out.println("REMARKS: FAILED");
        } else{
            System.out.println("REMARKS: PASSED");
        }
    }
}