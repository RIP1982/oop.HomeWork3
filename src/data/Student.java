package data;

public class Student extends People{
    private Integer studentId;
    private String faculty;
    private String group;

    public Student(Integer studentId, String name, String gender, int age, String faculty, String group) {
        this.studentId = studentId;
        super.setName(name);
        super.setGender(gender);
        super.setAge(age);
        this.faculty = faculty;
        this.group = group;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student: " + "id " + studentId + " name='" + getName() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", age=" + getAge() +
                ", faculty='" + faculty + '\'' +
                ", group='" + group + '\'';
    }
}
