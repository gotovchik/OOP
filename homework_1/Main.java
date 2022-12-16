package homework_1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
    
        Map<String, String> students = new HashMap<>();
        students.put("Степан Кузьмин", "3.6");
        students.put("Мария Кузнецова", "5.0");
        students.put("Иван Иванов", "4.8"); 

        WriteInTxt txt = new WriteInTxt(students);
        txt.writeFile();
        WriteInJson json = new WriteInJson(students);
        json.writeFile();
        WriteInXml xml = new WriteInXml(students);
        xml.writeFile();
    }
}