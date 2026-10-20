import java.util.Scanner;
public class Student2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        // Sid = student id same for all
        System.out.println("Enter ID ");
        int sId = sc.nextInt();
        System.out.println("Enter name ");
        String sName = sc.next();
        System.out.println("Enter college name ");
        String sCollegeName = sc.next();
        System.out.println("Enter branch ");
        String sBranch = sc.next();
        System.out.println("Enter cgpa ");
        float sCgpa = sc.nextFloat();
        System.out.println("Enter section");
        char sSection = sc.next().charAt(0);
        System.out.println("Enter hostel ");
        boolean sHostel = sc.nextBoolean();
        System.out.println(sId);
        System.out.println(sName);
        System.out.println(sCollegeName);
        System.out.println(sBranch);
        System.out.println(sCgpa);
        System.out.println(sSection);
        System.out.println(sHostel);
    }
}