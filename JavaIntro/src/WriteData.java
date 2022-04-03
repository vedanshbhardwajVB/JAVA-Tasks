import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteData {
    public static void writer(List<Student> studs) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter("entriesB.json");
        gson.toJson(studs, writer);
        writer.close();
    }
}
