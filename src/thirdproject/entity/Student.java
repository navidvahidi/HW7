package thirdproject.entity;

enum UniversityMajor {
    mechanic,
    engineeringMathematics,
    computer,
    Art,
    LaboratorySciences
}

public class Student extends UniversityEntty {
    private UniversityMajor universitymajor;
    private int term;
    private double score;

    public Student() {
    }

    public Student(int id, String name, UniversityMajor universitymajor, int term, double score) {
        super(id, name);
        this.universitymajor = universitymajor;
        this.term = term;
        this.score = score;
    }

    @Override
    public String toString() {
        return "\n    Student : " +getId() + "  Name : "+getName() +
                "   UniversityMajor : " + universitymajor +
                "   Term : " + term +
                "   Score : " + score ;
    }
}


