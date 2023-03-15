package thirdproject.entity;

public class UniversityEntty {
    private int id;
    private String name;

    public UniversityEntty() {

    }
    public UniversityEntty(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
