// Behruz Omonullaev, Section 001, Assignment 3
// The goal of this assignment is to utilize the scanner for user-inputs and calculate the average grade.

import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double Homework = HomeworkGrade(console);
        double ExamOne = ExamOneGrade(console);
        double ExamTwo = ExamTwoGrade(console);
        double Grade = Homework + ExamOne + ExamTwo;
        Grade = Math.round(Grade);
        System.out.println(Grade);
    }
    public static double HomeworkGrade(Scanner console) {
        System.out.println("Weight of Homework?");
        Integer HomeworkWeight = console.nextInt();

        System.out.println("Number of Assignments?");
        Integer NumAssignments = console.nextInt();

        System.out.println("Average Homeowrk grade?");
        double HomeworkAverage = console.nextDouble();

        System.out.println("How many late days did you use?");
        Integer LateDays = console.nextInt();

        System.out.println("How many labs did you attend?");
        Integer LabsAttended = console.nextInt();
        // Same # of Homework and Labs (ex; 10)
        // Labs worth 4 each, homework 10.

        if (NumAssignments<=0) {
            double HomeworkGrade = NumAssignments*10 + NumAssignments*4;
            return HomeworkGrade;
        }

        if (HomeworkAverage<=0) {
            HomeworkAverage = 0;
        } 
        if (HomeworkAverage>10){
            HomeworkAverage = 10;
        }


        double HomeworkGrade = HomeworkWeight * (HomeworkAverage*NumAssignments+LabsAttended*4) / (NumAssignments*NumAssignments + 4*NumAssignments );
        if (LateDays>NumAssignments/2){
            HomeworkGrade -= HomeworkGrade*.1;
        } else if (LateDays == 0) {
            if (HomeworkGrade + 5 <= NumAssignments*NumAssignments + 4*NumAssignments ) {
                HomeworkGrade += 5;
            }
        }
        return HomeworkGrade;
    }
    public static double ExamOneGrade(Scanner console) {
        System.out.println("Weight of Exam 1?");
        Integer ExamOneWeight = console.nextInt();

        System.out.println("Grade you got on Exam 1?");
        Integer ExamOneScore = console.nextInt();

        System.out.println("Any curve?");
        Integer ExamOneCurve = console.nextInt();
        if (ExamOneScore + ExamOneCurve <= 100) {
            ExamOneScore += ExamOneCurve;
        } else if (ExamOneScore + ExamOneCurve > 100) {
            ExamOneScore = 100;
        }

        if (ExamOneScore < 0) { 
            ExamOneScore = 0;
        }
        double ExamOneGrade = ExamOneWeight * ExamOneScore/100;

        
        return ExamOneGrade;
    }
    public static double ExamTwoGrade(Scanner console) {
        System.out.println("Weight of Exam 2?");
        Integer ExamTwoWeight = console.nextInt();

        System.out.println("Grade you got on Exam 2?");
        Integer ExamTwoScore = console.nextInt();

        System.out.println("Any curve?");
        Integer ExamTwoCurve = console.nextInt();
        if (ExamTwoScore + ExamTwoCurve <= 100) {
            ExamTwoScore += ExamTwoCurve;
        } else if (ExamTwoScore + ExamTwoCurve > 100) {
            ExamTwoScore = 100;
        }

        if (ExamTwoScore < 0) { 
            ExamTwoScore = 0;
        }
        double ExamTwoGrade = ExamTwoWeight * ExamTwoScore/100;

        return ExamTwoGrade;
    }

}


