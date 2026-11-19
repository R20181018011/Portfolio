import java.util.Scanner;
public class StudentGradeManagement {
   public static void main(String[] args) {
       // Create Scanner to accept user input.
       Scanner input = new Scanner(System.in);
       // Declare the subjects and section names.
       String[] subjects = {"Java", "Database", "Networking"};
       String[] sections = {"ITE 101", "ITE 102"};
       // Declare and initialize the 3D array.
       // 2 sections, 3 students, and 3 subjects.
       int[][][] grades = new int[2][3][3];
       // Input grades using nested for loops.
       for (int section = 0; section < grades.length; section++) {
           System.out.println("\n" + sections[section]);
           for (int student = 0; student < grades[section].length; student++) {
               System.out.println("Student " + (student + 1));
               for (int subject = 0; subject < grades[section][student].length; subject++) {
                   System.out.print("Enter grade in " + subjects[subject] + ": ");
                   grades[section][student][subject] = input.nextInt();
               }
           }
       }
       // Display all grades and calculate student averages.
       System.out.println("\n===== STUDENT GRADE REPORT =====");
       for (int section = 0; section < grades.length; section++) {
           // Stores the total grades of the current section.
           double sectionTotal = 0;
           System.out.println("\n" + sections[section]);
           for (int student = 0; student < grades[section].length; student++) {
               // Reset the total for each student.
               int studentTotal = 0;
               System.out.println("Student " + (student + 1) + ":");
               // Display grades and calculate the student's total.
               for (int subject = 0; subject < grades[section][student].length; subject++) {
                   System.out.println(subjects[subject] + ": "
                           + grades[section][student][subject]);
                   studentTotal += grades[section][student][subject];
               }
               // Calculate the average of the student's 3 subjects.
               double studentAverage = studentTotal / 3.0;
               // Add the student's total to the section total.
               sectionTotal += studentTotal;
               System.out.printf("Average: %.2f%n", studentAverage);
               // spaciing for each line after each student
               System.out.println();
           }
           // Calculate the section average.
           // 3 students multiplied by 3 subjects equals 9 grades.
           double sectionAverage = sectionTotal / 9.0;
           System.out.printf("Section Average: %.2f%n", sectionAverage);
       }
       // Close Scanner.
       input.close();
   }
}