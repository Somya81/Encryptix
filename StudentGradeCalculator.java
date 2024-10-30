import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalmarks = 0;
        double averageMarks;

        // Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        System.out.print("Enter the english marks :");
        int a = scanner.nextInt();

        System.out.print("Enter the Hindi marks :");
        int b = scanner.nextInt();
       
        System.out.print("Enter the sst marks :");
        int c = scanner.nextInt();

        System.out.print("Enter the maths marks :");
        int e = scanner.nextInt();

        System.out.print("Enter the evs marks :");
        int d = scanner.nextInt();
 
        totalmarks = (a+b+c+d+e);
        System.out.print("The total marks is :");
        System.err.println(totalmarks);

        averageMarks = totalmarks/numSubjects;
        System.err.println("The average marks is: ");
        System.out.println(averageMarks);

        char grade;
        if (averageMarks>=90){
           grade = 'A';
        }else if(averageMarks>=80){
            grade = 'B';
        }else if(averageMarks>=70){
            grade = 'C';
        }else if (averageMarks>=60){
            grade = 'D';
        
        }else{
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
   

        scanner.close();  

    }
}
