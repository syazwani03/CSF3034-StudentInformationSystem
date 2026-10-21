/*
 * Author Name: Nur Syazwani bt Saziri
 * Program Name: SudentInformationSystem
 * Date: 14 October 2026
*/

public class StudentInformationSystem {

    public static void main(String[] args) {
        // Display student name and student id
        System.out.println("Name: Nur Syazwani binti Saziri");
        System.out.println("Student ID: S87414");
        
        // Store two marks using varibles
        double mark1 = 45.5;
        double mark2 = 41.5;
        
        double totalMark = mark1 + mark2;
        
        System.out.println("Total Mark: " + totalMark);
        
        if (totalMark >= 80){
            System.out.println("Result: Excellent");
        }else if (totalMark >= 60){
            System.out.println("Result: Good");
        }else{
            System.out.println("Result: Need Improvement");
        }
        
        
    }
    
}
