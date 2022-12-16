package homework_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteInXml implements WriteInFile {
    private Map<String, String> record;
    
    public WriteInXml(Map<String, String> record) {
        this.record = record;
    }

    @Override
    public void writeFile() throws IOException {
        FileWriter writer = new FileWriter("homework_1/note2.xml", false);
        writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n");
        writer.write("<students>\n");
        for (Map.Entry<String, String> entry : record.entrySet()) {
            writer.write("\t<student>\n");
            writer.write("\t\t<name>" + entry.getKey() + "</name>\n\t\t<grade>" + entry.getValue() + "</grade>\n");
            writer.write("\t</student>\n");
        }
        writer.write("</students>");
        writer.close();
        
    }
    
}
