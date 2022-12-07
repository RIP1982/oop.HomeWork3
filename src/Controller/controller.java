package Controller;

import data.EducationGroup;
import data.People;
import data.Stream;
import service.*;
import util.ReadFromTxt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Logger;

public class controller {
    public static void apkButton() {
        Logger logger = Logger.getAnonymousLogger();
        IStream stream = new StreamService();

        logger.info(stream.sortStream("students.txt").toString());

        logger.info(stream.getStream("students.txt", "teachers.txt",
                "medical").toString());
        logger.info(stream.getStream("students.txt", "teachers.txt",
                "physics").toString());
    }
}
