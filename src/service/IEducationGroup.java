package service;

import data.EducationGroup;
import data.People;

import java.util.ArrayList;
import java.util.Set;

public interface IEducationGroup {
    EducationGroup educationGroup(String facultyName, String numberOfGroup, String fileNameStudents,
                                  String fileNameTeachers);
}
