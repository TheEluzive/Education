package Introduction.Vol3Objects;


import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        StudentWrap studentWrap = new StudentWrap();


        studentWrap.addStudent(
                new Student(0, "Вася", "Иванов", "Михайлович", new GregorianCalendar(1900,12,31),
                        "улица Петровых, дом 10", "+799999", "Факультет факультетов", 3, "ГР-12"
        ));
        studentWrap.addStudent(
                new Student(1, "Виолетта", "Смирнова", "Евгеньевна", new GregorianCalendar(2010,5,16),
                        "улица Смирновых, дом 14", "+795828", "Факультет больших факультетов", 4, "ГР-1245"
                ));
        studentWrap.showAll();

        System.out.println(studentWrap.findById(0));
        ;
    }
}
