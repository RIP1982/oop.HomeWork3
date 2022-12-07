package util;

import data.People;
import data.Student;
import data.Teacher;
import java.io.*;
import java.util.*;

public class ReadFromTxt {
    public static ArrayList<People> readStudentsList(String fileName) {
        ArrayList<People> studentsList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                List<String> studentData = Arrays.stream((line.split(", "))).toList();
                People student = new Student(Integer.parseInt(studentData.get(0)), studentData.get(1), studentData.get(2),
                        Integer.parseInt(studentData.get(3)), studentData.get(4), studentData.get(5));
                studentsList.add(student);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentsList;
    }

    public static ArrayList<People> readTeachersList(String fileName) {
        ArrayList<People> teachersList = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line = bufferedReader.readLine();
            while (line != null) {
                List<String> teacherData = Arrays.stream((line.split(", "))).toList();
                People teacher = new Teacher(Integer.parseInt(teacherData.get(0)), teacherData.get(1), teacherData.get(2),
                        Integer.parseInt(teacherData.get(3)), teacherData.get(4), teacherData.get(5));
                teachersList.add(teacher);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teachersList;
    }
}
