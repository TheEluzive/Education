package Introduction.Vol3Objects;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentWrap extends HumanWrap {


    public ArrayList<Student> findByFaculty(String faculty) {
        ArrayList<Student> arrStudents = new ArrayList<>();

        for (Human iterator :
                humanHashMap.values()) {
            if (iterator instanceof Student) {
                if (((Student) iterator).faculty.equals(faculty)) {
                    arrStudents.add(((Student) iterator));
                }
            }
        }

        return arrStudents;
    }

    public HashMap<String[], ArrayList<Student>> getListsStudentsByFacultyByYears() {
        HashMap<String[], ArrayList<Student>> hashMap = new HashMap<>();
        HashMap<String, String[]> hashMapStrings = new HashMap<>();


        //string[0] - faculty, string[1] - year
        for (Human iterator :
                humanHashMap.values()) {
            if (iterator instanceof Student) {
                if (hashMapStrings.get(
                        stringConcatenation(((Student) iterator).faculty, ((Student) iterator).yearEducation))
                        == null) {
                    hashMapStrings.put(
                            stringConcatenation(((Student) iterator).faculty, ((Student) iterator).yearEducation),
                            facultyYearStringBuilder(((Student) iterator).faculty, ((Student) iterator).yearEducation)
                    );
                    hashMap.put(
                            hashMapStrings.get(stringConcatenation(((Student) iterator).faculty, ((Student) iterator).yearEducation)),
                            new ArrayList<Student>()
                    );
                }
                hashMap.get(hashMapStrings.get(stringConcatenation(((Student) iterator).faculty,
                        ((Student) iterator).yearEducation))).add((Student) iterator);


            }
        }

        return hashMap;
    }

    public String[] facultyYearStringBuilder(String faculty, int year) {
        return new String[]{faculty, "" + year};
    }

    public String stringConcatenation(String str1, int str2) {
        return str1 + str2;
    }


}
