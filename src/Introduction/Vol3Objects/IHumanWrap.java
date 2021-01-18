package Introduction.Vol3Objects;

import java.util.ArrayList;

public interface IHumanWrap {
    void showAll();
    Human findById(long id);
    ArrayList<Human> findByName(String name);
    ArrayList<Human> findByAge(int age);
    ArrayList<Human> findByPhone(String phone);
    void add(Human human);
}
