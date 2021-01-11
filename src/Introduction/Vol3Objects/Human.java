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
