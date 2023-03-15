package thirdproject.repository;

import thirdproject.entity.Lesson;
import thirdproject.entity.Student;

import java.util.ArrayList;

public class University {
    ArrayList<Lesson> lessonArrayList = new ArrayList<>();

    public void setLesson(Lesson lesson) {
        lessonArrayList.add(lesson);
    }

    public University() {
    }

    public void SearchProfessor(String name) {
        boolean check = false;
        for (Lesson lesson : lessonArrayList) {
            if (name.equals(lesson.getProfessor().getName())) {
                check = true;
                System.out.println(">>>>>>>>>>> " + lesson.getProfessor().getName() + " <<<<<<<<<<<");
                System.out.println("Lesson : " + lesson.getName());
                for (Student stu : lesson.getStudent()) {
                    System.out.println(stu.toString());
                }
            }
        }
        if (!check) {
            System.out.println("Message : This professor's name does not exist ");
        }
    }

    public void SearchStudent(String name) {
        boolean check = false;
        for (Lesson lesson : lessonArrayList) {
            for (Student stu : lesson.getStudent()) {
                if (name.equals(stu.getName())) {
                    check = true;
                    System.out.println("Lesson : " + lesson.getName());
                    System.out.println("Professor : " + lesson.getProfessor().getName());
                    System.out.println("------------------");
                }
            }
        }
        if (!check) {
            System.out.println("Message: This student is not present in this university ");
        }
    }
}
