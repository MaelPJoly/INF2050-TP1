import netscape.javascript.JSObject;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DiskFile {

    public static String loadFileIntoString(String filePath) throws FileNotFoundException, IOException {
        return IOUtils.toString(new FileInputStream(filePath), "UTF-8");
    }

    public static void saveStringIntoFile(String filePath, String content) throws IOException {
        File f = new File(filePath);
        FileUtils.writeStringToFile(f, content, "UTF-8");
    }
    // Fonction pour générer un JSON agréable à lire.
    // private static void saveAsIndentedJsonFile(JSObject outputList) throws IOException {
     //   DiskFile.saveStringIntoFile((args[1]), outputList.toString());
    }
