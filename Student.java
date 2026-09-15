import java.util.Scanner;

public class Student {
        String name;
        int studentId;
        String program;
        String yearLevel;

            public Student (String pName, int pStudentId, String pProgram, String pYearLevel) {
                name = pName;
                studentId = pStudentId;
                program = pProgram;
                yearLevel = pYearLevel;
            
            }

            public void display() {
                System.out.println("Name: " + name);
                System.out.println("Student ID: " + studentId);
                System.out.println("Program: " + program);
                System.out.println("Year level: " + yearLevel);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("== Enter details for Student 1 == ");
        System.out.print("Name: ");
        String name1 = input.nextLine();
        System.out.print("Student ID: ");
        int id1 = input.nextInt();
                input.nextLine();
        System.out.print("Program: ");
        String program1 = input.nextLine();
        System.out.print("Year Level: ");
        String year1 = input.nextLine();
        Student student1 = new Student(name1, id1, program1, year1);


        System.out.println("\n== Enter details for Student 2 ==");
        System.out.print("Name: ");
        String name2 = input.nextLine();
        System.out.print("Student ID: ");
        int id2 = input.nextInt();
                input.nextLine();
        System.out.print("Program: ");
        String program2 = input.nextLine();
        System.out.print("Year Level: ");
        String year2 = input.nextLine();
        Student student2 = new Student(name2, id2, program2, year2);


        System.out.println("\n== Enter details for Student 3 ==");
        System.out.print("Name: ");
        String name3 = input.nextLine();
        System.out.print("Student ID: ");
        int id3 = input.nextInt();
                input.nextLine();
        System.out.print("Program: ");
        String program3 = input.nextLine();
        System.out.print("Year Level: ");
        String year3 = input.nextLine();
        Student student3 = new Student(name3, id3, program3, year3);

        displayAll (student1, student2, student3);
    
        input.close();
    }
    
    public static void displayAll(Student student1, Student student2, Student student3) {
        System.out.println("\n=====================");
        System.out.println("\n Student Details ");

        System.out.println("\n=== Student 1 ===");
        student1.display();
        System.out.println();

        System.out.println("=== Student 2 ===");
        student2.display();
        System.out.println();

        System.out.println("=== Student 3 ===");
        student3.display();
        System.out.println();
        System.out.println("\n=====================");
    }
        
}