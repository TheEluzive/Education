package Introduction.Vol3Objects;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Student extends Human  {
    protected String faculty;
    protected int yearEducation;
    protected String group;




    public Student(long id, String name, String secondName, String fatherName, Calendar birthday, String address, String phoneNumber, String faculty, int yearEducation, String group) {
        super(id, name, secondName, fatherName, birthday, address, phoneNumber);
        this.faculty = faculty;
        this.yearEducation = yearEducation;
        this.group = group;
    }

    public Student() {
    }

    public String getFaculty() {
        return faculty;
    }

    public int getYearEducation() {
        return yearEducation;
    }

    public String getGroup() {
        return group;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setYearEducation(int yearEducation) {
        this.yearEducation = yearEducation;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return yearEducation == student.yearEducation &&
                Objects.equals(faculty, student.faculty) &&
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculty, yearEducation, group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "faculty='" + faculty + '\'' +
                ", yearEducation=" + yearEducation +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", birthday=" + birthday.getTime() +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
