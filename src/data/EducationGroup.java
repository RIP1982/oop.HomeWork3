package data;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class EducationGroup {
    private People teacher;
    private ArrayList<People> studentsList;

    public EducationGroup(People teacher, ArrayList<People> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "EducationGroup: " + " " +
                this.teacher + "; " + this.studentsList;
    }
}
