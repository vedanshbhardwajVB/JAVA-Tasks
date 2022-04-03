import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LoadData {
    public static List<Student> loader(){
        List<Student> studs;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (Reader reader = new FileReader("entriesB.json")) {

            // Convert JSON File to Java Object
            Type userListType = new TypeToken<ArrayList<Student>>(){}.getType();
            studs =  gson.fromJson(reader, userListType);

            // print staff
            System.out.println(studs);

        } catch (IOException e) {
            //e.printStackTrace();
            return null;
        }

        return studs;
    }
}
