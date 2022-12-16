package homework_1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.json.JSONObject;

public class WriteInJson implements WriteInFile {
    private Map<String, String> record;
    
    public WriteInJson(Map<String, String> record) {
        this.record = record;
    }
    
    @Override
    public void writeFile() throws IOException {
        FileWriter writer = new FileWriter("homework_1/note1.json", false);
        JSONObject json = new JSONObject(record);
        writer.write(json.toString());
        writer.close();
    }
    
}
