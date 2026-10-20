import java.util.Scanner;
public class Gradecal {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 60) {
            System.out.println("Good");
        } else if (marks >= 35) {
            System.out.println("pass");
        } else if (marks < 35) {
            System.out.println("Fail");
        }
    }
}