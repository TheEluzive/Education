package Introduction.Vol3Objects;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentWrap implements IHumanWrap {
    private HashMap<Long, Student> students = new HashMap<>();

    public StudentWrap() {
    }

    public void addStudent(Student student){
        students.put(student.getId(), student);
    }

    @Override
    public void showAll() {
        for (Student iterator:
             students.values()) {
            System.out.println(iterator.toString());
        }
    }

    @Override
    public Human findById(long id) {
        for (Student iterator:
             students.values()) {
            if (iterator.getId() == id) return iterator;
        }
        return null;
    }

    @Override
    public ArrayList<Human> findByName(String name) {
        ArrayList<Human> arrStudents = new ArrayList<>();
        for (Student iterator:
             students.values()) {
            if (iterator.getName().equals(name))
                arrStudents.add(iterator);
        }

        return arrStudents;
    }

    @Override
    public ArrayList<Human> findByAge(int age) {
        return null;
    }

    @Override
    public ArrayList<Human> findByPhone(String phone) {
        return null;
    }
}
