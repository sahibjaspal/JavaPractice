package hashmaps;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sahibj on 3/16/17.
 */
public class SimpleHashmap {

    public static void main(String[] args) {

        Map<String, String> studentIdToStudentName = new HashMap<>();

        studentIdToStudentName.put("1", "Sahib");
        studentIdToStudentName.put("2", "Manbir");
        studentIdToStudentName.put("3", "Neha");

        System.out.println(studentIdToStudentName);
    }
}
