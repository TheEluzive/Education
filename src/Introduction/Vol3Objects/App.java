package Introduction.Vol3Objects;


import java.util.*;

public class App {
    public static void main(String[] args) {
        IHumanWrap studentWrap = new StudentWrap();


        studentWrap.add(
                new Student(0, "Вася", "Иванов", "Михайлович", new GregorianCalendar(1900,12,31),
                        "улица Петровых, дом 10", "+799999", "Факультет факультетов", 3, "ГР-12"
        ));
        studentWrap.add(
                new Student(2, "Вася2", "Иванов2", "Михайлович", new GregorianCalendar(1900,12,31),
                        "улица Петровых, дом 10", "+799999", "Факультет факультетов", 3, "ГР-12"
                ));
        studentWrap.add(
                new Student(3, "Вася3", "Иванов3", "Михайлович3", new GregorianCalendar(1900,12,31),
                        "улица Петровых, дом 10", "+799999", "Факультет факультетов", 4, "ГР-12"
                ));

        studentWrap.add(
                new Student(1, "Виолетта", "Смирнова", "Евгеньевна", new GregorianCalendar(2010,5,16),
                        "улица Смирновых, дом 14", "+795828", "Факультет больших факультетов", 4, "ГР-1245"
                ));

        //studentWrap.showAll();

        System.out.println(studentWrap.findById(0));

        System.out.println(studentWrap.findByAge(119));
        System.out.println();

        if (studentWrap instanceof  StudentWrap) {
            System.out.println(((StudentWrap) studentWrap).findByFaculty("Факультет факультетов").size());
            HashMap<String[], ArrayList<Student>> hashMap = ((StudentWrap) studentWrap).getListsStudentsByFacultyByYears();

            for (String[] key : hashMap.keySet()) {
                System.out.println(key[0] + key[1]);
                System.out.println(hashMap.get(key));
                System.out.println();
            }
            System.out.println(((StudentWrap) studentWrap).findByAge(50, StudentWrap.Compare.SMALLER_OR_EQUAL));
            System.out.println();
            System.out.println(((StudentWrap) studentWrap).findByGroup("ГР-1245"));

        }

        ;
    }
}
