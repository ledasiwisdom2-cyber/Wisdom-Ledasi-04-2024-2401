public class StudentInfo {

    public static void main(String[] args) {

        // Student Information
        String fullName = "Wisdom Ledasi";
        String program = "Computer Networking";

        short age = 21;
        byte level = 100;
        long studentID = 20242401L;

        float gpa = 3.75f;
        double feesPaid = 2500.50;

        char grade = 'A';
        boolean isRegistered = true;

        // Display Information
        System.out.printf("========== STUDENT PROFILE ==========%n");
        System.out.printf("Full Name: %s%n", fullName);
        System.out.printf("Student ID: 04/2024/2389D%n");
        System.out.printf("Program: %s%n", program);
        System.out.printf("Age (short): %d%n", age);
        System.out.printf("Level (byte): %d%n", level);
        System.out.printf("Student Number (long): %d%n", studentID);
        System.out.printf("GPA (float): %.2f%n", gpa);
        System.out.printf("Fees Paid (double): GHS %.2f%n", feesPaid);
        System.out.printf("Grade (char): %c%n", grade);
        System.out.printf("Registered (boolean): %b%n", isRegistered);
        System.out.printf("=====================================%n");
    }
}
