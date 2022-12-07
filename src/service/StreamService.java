package service;

import data.*;
import util.ReadFromTxt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class StreamService implements IStream {
    @Override
    public Stream getStream(String fileNameStudents, String fileNameTeachers, String faculty) {
        ArrayList<People> students = ReadFromTxt.readStudentsList(fileNameStudents);
        ArrayList<EducationGroup> educationGroups = new ArrayList<>();
        ArrayList<String> numbersOfGroups = new ArrayList<>();
        IEducationGroup iEducationGroup = new EducationGroupService();
        for (People student: students) {
            Student temp = (Student) student;
            numbersOfGroups.add(temp.getGroup());
        }
        Set<String> set = new LinkedHashSet<>(numbersOfGroups);
        int id = 0;
        for (String group: set) {
            for (People student: students) {
                Student temp = (Student) student;
                if (temp.getFaculty().equals(faculty)) {
                    if (temp.getGroup().equals(group)) {
                        educationGroups.add(iEducationGroup.educationGroup(faculty, group, fileNameStudents,
                                fileNameTeachers));
                    }
                }
            }
        }
        Stream stream = new Stream(educationGroups);
        return stream;
    }

    @Override
    public ArrayList<People> sortStream(String fileName) {
        ArrayList<People> studentsList = ReadFromTxt.readStudentsList(fileName);
        Collections.sort(studentsList, new StreamComparator());
        return studentsList;
    }
}
