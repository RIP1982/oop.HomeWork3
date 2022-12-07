package service;

import data.EducationGroup;
import data.People;
import data.Student;
import data.Teacher;
import util.ReadFromTxt;
import java.util.ArrayList;


public class EducationGroupService implements IEducationGroup {

    public EducationGroup educationGroup(String facultyName, String numberOfGroup, String fileNameStudents,
                                         String fileNameTeachers) {
        ArrayList<People> teachers = ReadFromTxt.readTeachersList(fileNameTeachers);
        ArrayList<People> students = ReadFromTxt.readStudentsList(fileNameStudents);
        People teacher = null;
        ArrayList<People> groupOfStudents = new ArrayList<>();
        for (People student: students) {
            Student temp = (Student) student;
            if (temp.getFaculty().equals(facultyName)) {
                if (temp.getGroup().equals(numberOfGroup)) {
                    groupOfStudents.add(student);
                }
            }
        }
        for (People lecturer: teachers) {
            Teacher temp = (Teacher) lecturer;
            if (temp.getDiscipline().equals(facultyName)) {
                teacher = temp;
            }
        }
        return new EducationGroup(teacher, groupOfStudents);
    }
}
