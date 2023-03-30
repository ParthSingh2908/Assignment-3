/*
 * Name: Parth Singh
 * PRN: 21070126062
 * Batch: AIML A3
 */

import java.util.Scanner;

public class Main {
    static Student[] students;
    public static void main(String[] args) {
        int count;
        do {
            System.out.println("1. Add Students");
            System.out.println("2. Display");
            System.out.println("3. Search(by prn)");
            System.out.println("4. Search(by name)");
            System.out.println("5. Search(by position)");
            System.out.println("6. Edit Details");
            System.out.println("7. Delete");
            Scanner sc = new Scanner(System.in);

            int choice;
            choice = sc.nextInt();
            Operations operate = new Operations();
            switch (choice) {
                case 3:
                    operate.searchByPrn(students);
                    break;

                case 4:
                    int index = operate.searchByName(students);
                    break;

                case 5:
                    operate.searchByIndex(students);
                    break;

                case 6:
                    students = operate.edit(students);
                    operate.displayStudents(students);
                    break;

                case 7:
                    students = operate.delete(students);
                    operate.displayStudents(students);
                    break;

                case 1:
                    students = operate.addStudent(students);

                case 2:
                default:
                    operate.displayStudents(students);
                    break;
            }
            System.out.println("Do you want to perform more operations?(Y=1|N=0): ");
            count = sc.nextInt();
        }while(count == 1); // While condition for do while loop
    }
}