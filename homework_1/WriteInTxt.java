package homework_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteInTxt implements WriteInFile {
    private Map<String, String> record;
    
    public WriteInTxt(Map<String, String> record) {
        this.record = record;
    }

    @Override
    public void writeFile() throws IOException {
        FileWriter writer = new FileWriter("homework_1/note0.txt", false);
        for (Map.Entry<String, String> entry : record.entrySet()) {
            writer.write(entry.getKey() + "=" + entry.getValue());
            writer.append("\n");
        }
        writer.close();
    }
    
}
