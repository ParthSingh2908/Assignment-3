public class Student {
    private int prn;
    private String name;
    private String dob;
    private int marks;

    public int getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    Student(int prn, String name, String dob, int marks){
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }
}
