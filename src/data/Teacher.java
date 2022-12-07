package data;

public class Teacher extends People{
    private Integer teacherId;
    private String degree;
    private String discipline;

    public Teacher(Integer teacherId, String name, String gender, int age, String degree, String discipline) {
        this.teacherId = teacherId;
        super.setName(name);
        super.setGender(gender);
        super.setAge(age);
        this.degree = degree;
        this.discipline = discipline;
    }

    public Integer getTeacherId() {
        return this.teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getDegree() {
        return this.degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDiscipline() {
        return this.discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "[Teacher: " + "id " + teacherId + " name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", age=" + getAge() +
                ", degree='" + degree + '\'' +
                ", discipline='" + discipline + '\'' + "]";
    }
}
