package thirdproject.entity;

public class Lesson extends UniversityEntty {
    Professor professor = new Professor();
    Student[] student = new Student[5];

    public Lesson(int id, String name, Professor professor, Student[] student) {
        super(id, name);
        this.professor = professor;
        this.student = student;
    }

    public Lesson() {
    }

    public void Print() {
        System.out.println("Lesson : " + getName());
        System.out.println("professor : " + professor.getName());
        for (Student stu : student) {
            System.out.println(stu.toString());
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public Student[] getStudent() {
        return student;
    }

}
