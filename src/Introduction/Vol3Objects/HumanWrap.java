package Introduction.Vol3Objects;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class HumanWrap implements IHumanWrap {
    protected HashMap<Long, Human> humanHashMap = new HashMap<>();

    public void add(Human human){
        humanHashMap.put(human.getId(), human);
    }

    @Override
    public ArrayList<Human> findByPhone(String phone) {
        ArrayList<Human> arrHumans = new ArrayList<>();
        for (Human iterator:
                humanHashMap.values()) {
            if (iterator.getName().equals(phone))
                arrHumans.add(iterator);
        }

        return arrHumans;
    }

    @Override
    public void showAll() {
        for (Human iterator:
                humanHashMap.values()) {
            System.out.println(iterator.toString());
        }
    }

    @Override
    public Human findById(long id) {
        for (Human iterator:
                humanHashMap.values()) {
            if (iterator.getId() == id) return iterator;
        }
        return null;
    }

    @Override
    public ArrayList<Human> findByName(String name) {
        ArrayList<Human> arrHumans = new ArrayList<>();
        for (Human iterator:
                humanHashMap.values()) {
            if (iterator.getName().equals(name))
                arrHumans.add(iterator);
        }

        return arrHumans;
    }

    @Override
    public ArrayList<Human> findByAge(int age) {
        ArrayList<Human> arrHumans = new ArrayList<>();
        for (Human iterator:
                humanHashMap.values()) {
            if (iterator.getAge() == age)
                arrHumans.add(iterator);

        }
        return arrHumans;
    }
}
