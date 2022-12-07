package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

public class Stream implements Iterable<EducationGroup>{
    private ArrayList<EducationGroup> educationGroups;
    private  static final AtomicLong id = new AtomicLong(0);
    private Long streamId;

    public Stream(ArrayList<EducationGroup> educationGroups) {
        this.educationGroups = educationGroups;
        this.streamId = id.incrementAndGet();
    }

    @Override
    public Iterator<EducationGroup> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super EducationGroup> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<EducationGroup> spliterator() {
        return Iterable.super.spliterator();
    }

    @Override
    public String toString() {
        return "Stream №" + streamId + educationGroups;
    }
}
