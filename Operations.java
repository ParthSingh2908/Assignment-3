import java.util.Scanner;

public class Operations {

    
    public Student[] addStudent(Student[] students) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of Students you want to add: ");
        int number = scan.nextInt();
        int prn;
        String name;
        String dob;
        int marks;
        int len;

        if(students == null){
            len =0;
        }
        else{
            len = students.length;
        }

        Student[] array = new Student[len + number];

        for(int i=0;i<len;i++) {
            array[i] = students[i];
        }

        for (int i = len; i < len + number; i++) {
            System.out.println("Enter PRN: ");
            prn = scan.nextInt();
            System.out.println("Enter Name: ");
            name = scan.next();
            System.out.println("Enter DOB: ");
            dob = scan.next();
            System.out.println("Enter marks: ");
            marks = scan.nextInt();

            array[i] = new Student(0, "", "", 0);
            array[i].setPrn(prn);
            array[i].setName(name);
            array[i].setDob(dob);
            array[i].setMarks(marks);
        }

        return array;
    }

    public void displayStudents(Student[] students){

        System.out.println("PRN         Name                    DOB         Marks");

        int len;

        if(students == null){
            len = 0;
        }
        else{
            len = students.length;
        }

        for(int i=0; i<len; i++){
            if(students.length == 0){
                System.out.println("There's no students added. Please add first.");
                return;
            }
            String name = students[i].getName();
            String dob = students[i].getDob();
            int marks = students[i].getMarks();
            int prn = students[i].getPrn();

            System.out.println(prn+"            "+name+"           "+dob+"            "+marks);
        }
    }

    public void searchByPrn(Student[] students){
        Scanner scan = new Scanner(System.in);
        int searchPrn = scan.nextInt();

        for(int i=0; i<students.length; i++){
            if(students[i].getPrn() == searchPrn){
                System.out.println("PRN: "+students[i].getPrn()+"   Name: "+students[i].getName()+" DOB: "+students[i].getDob()+"   Marks: "+students[i].getMarks());
                break;
            }
        }
    }

    public int searchByName(Student[] students){
        Scanner scan = new Scanner(System.in);
        String searchName = scan.nextLine();
        int i=0;
        for (Student student : students) {
            if (student.getName().equals(searchName)) {
                System.out.println("PRN: " + student.getPrn() + "   Name: " + student.getName() + " DOB: " + student.getDob() + "   Marks: " + student.getMarks());
                break;
            }
            i++;
        }
        return i;
    }

    public void searchByIndex(Student[] students){
        Scanner scan = new Scanner(System.in);
        int idx = scan.nextInt();

        System.out.println("PRN: "+students[idx].getPrn()+"   Name: "+students[idx].getName()+" DOB: "+students[idx].getDob()+"   Marks: "+students[idx].getMarks());
    }

    public Student[] edit(Student[] students){
        int idx = searchByName(students);
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Edit PRN");
        System.out.println("2. Edit Name");
        System.out.println("3. Edit DOB");
        System.out.println("4. Edit Marks");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                int prn = scan.nextInt();
                students[idx].setPrn(prn);
                break;
            case 2:
                String name = scan.nextLine();
                students[idx].setName(name);
                break;
            case 3:
                String dob = scan.nextLine();
                students[idx].setDob(dob);
                break;
            case 4:
                int marks = scan.nextInt();
                students[idx].setMarks(marks);
                break;
        }

        return students;
    }

    public Student[] delete(Student[] students){
        Student[] array = new Student[students.length];

        int index = searchByName(students);

        int j=0;
        for(int i=0;i<students.length;i++) {
            if(i == index){
                continue;
            }
            array[j] = students[i];
            j++;
        }
        return array;
    }
}
