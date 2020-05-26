import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class Convertor {


    public Client convert(String filePath)  throws Exception {


        // conversion en string
        String jsonTxt = DiskFile.loadFileIntoString(filePath);

        // conversion en object colletion (attribut client du fichier .json)
        JSONObject root = (JSONObject) JSONSerializer.toJSON(jsonTxt);

        // Obtention des attribut de fumeur a partir du root
        JSONObject attributFumeur = (JSONObject) root.get("fumeur");

        Client client ;
        // Creation et initialisation d'un object client
        
        client = new Client(

                (String) root.get("nom"),
                (int) root.get("genre"),
                (int) root.get("age"),
                (boolean) attributFumeur.get("tabac"),
                (boolean) attributFumeur.get("cannabis"),
                (boolean) root.get("alcool")
        );


        return client;
        }

}
