package day33_Statics;

public class Student {
    public String name;
    public char gender;
    public int age,studentId;
    public char grade;


    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentId) {
        this(name);
        this.studentId = studentId;
    }

    public Student(String name, int studentId, char grade) {
        this(name,studentId);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name,gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentId) {
        this(name,gender,age);
        this.studentId = studentId;
    }

    public Student(String name, char gender, int age, int studentId, char grade) {
        this(name,gender,age,studentId);
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}
