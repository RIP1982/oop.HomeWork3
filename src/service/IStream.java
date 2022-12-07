package service;

import data.People;
import data.Stream;

import java.util.ArrayList;

public interface IStream {
    Stream getStream(String fileNameStudents, String fileNameTeachers, String faculty);
    ArrayList<People> sortStream(String fileName);
}
