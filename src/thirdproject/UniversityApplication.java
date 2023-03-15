package thirdproject;

import thirdproject.entity.Lesson;
import thirdproject.entity.Professor;
import thirdproject.entity.Student;
import thirdproject.entity.*;
import thirdproject.repository.University;



public class UniversityApplication {


    public static void main(String[] args) {
        Professor professor =new Professor(1,"Yarah Ahmadi");
        Professor professor1 =new Professor(2,"Rezai");

        Student[] math1 =new Student[5];

        math1[0]=new Student(1,"Reza Mohammadi",UniversityMajor.mechanic,5,15.5);
        math1[1]=new Student(2,"Homan Ahmadi",UniversityMajor.Art,2,14.5);
        math1[2]=new Student(3," Nilofar Hajipour",UniversityMajor.computer,1,12.5);
        math1[3]=new Student(4,"Navid Vahidi",UniversityMajor.engineeringMathematics,5,11.5);
        math1[4]=new Student(5,"Ali Rezvani",UniversityMajor.LaboratorySciences,2,10);
        Lesson lesson=new Lesson(1,"math1",professor, math1);

        Student[] Physics =new Student[5];
        Physics[0]=new Student(1,"Reza Mohammadi",UniversityMajor.mechanic,5,15.5);
        Physics[1]=new Student(2,"Arman Varaste",UniversityMajor.Art,2,14.5);
        Physics[2]=new Student(3," Sorosh babaki",UniversityMajor.computer,1,12.5);
        Physics[3]=new Student(4,"Navid Vahidi",UniversityMajor.engineeringMathematics,5,11.5);
        Physics[4]=new Student(5,"Ali Klidbari",UniversityMajor.LaboratorySciences,2,10);
        Lesson lesson1=new Lesson(1,"Physics",professor1, Physics);

        Student[] math2 =new Student[5];
        math2[0]=new Student(1,"Reza Mohammadi",UniversityMajor.mechanic,5,15.5);
        math2[1]=new Student(2,"Nader Naderi",UniversityMajor.Art,2,14.5);
        math2[2]=new Student(3,"Ali karimi ",UniversityMajor.computer,1,12.5);
        math2[3]=new Student(4,"Navid Vahidi",UniversityMajor.engineeringMathematics,5,11.5);
        math2[4]=new Student(5,"Sosan jon",UniversityMajor.LaboratorySciences,2,10);
        Lesson lesson2=new Lesson(1,"math2",professor, math2);

        lesson.Print();
        System.out.println("------------------------------------------------------------------------------------------------");
        lesson1.Print();
        System.out.println("------------------------------------------------------------------------------------------------");
        lesson2.Print();
        System.out.println("------------------------------------------------------------------------------------------------");


        University university=new University();
        university.setLesson(lesson);
        university.setLesson(lesson1);
        university.setLesson(lesson2);
        university.SearchProfessor("Yarah Ahmadi");
        System.out.println("****************************************");
        university.SearchStudent("Reza Mohammadi");



    }
}
