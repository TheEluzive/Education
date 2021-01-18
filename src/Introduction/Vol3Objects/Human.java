package Introduction.Vol3Objects;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public abstract class Human {
    protected long id;
    protected String name;
    protected String secondName;
    protected String fatherName = null;
    protected Calendar birthday;
    protected String address;
    protected String phoneNumber;
    protected int age;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Human(long id, String name, String secondName, String fatherName, Calendar birthday, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = calculateAge(birthday);
    }

    public Human(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(secondName, human.secondName) &&
                Objects.equals(fatherName, human.fatherName) &&
                Objects.equals(birthday, human.birthday) &&
                Objects.equals(address, human.address) &&
                Objects.equals(phoneNumber, human.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, fatherName, birthday, address, phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int calculateAge(Calendar dob){
        int age = 0;
        Calendar now = Calendar.getInstance();


        if (dob.after(now)) {
            throw new IllegalArgumentException("Can't be born in the future");
        }
        int year1 = now.get(Calendar.YEAR);
        int year2 = dob.get(Calendar.YEAR);
        age = year1 - year2;
        int month1 = now.get(Calendar.MONTH);
        int month2 = dob.get(Calendar.MONTH);
        if (month2 > month1) {
            age--;
        } else if (month1 == month2) {
            int day1 = now.get(Calendar.DAY_OF_MONTH);
            int day2 = dob.get(Calendar.DAY_OF_MONTH);
            if (day2 > day1) {
                age--;
            }
        }
        return age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", birthday=" + birthday.getTime() +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


}
