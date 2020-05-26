import net.sf.json.JSON;
import net.sf.json.JSONObject;

public class Main {

    public static void main(String[] args) throws Exception {

        try {
            // Convertion du fichier en objet Json
            Convertor convertor = new Convertor();
            Client client = convertor.convert(args[0]);

            // Verification de la validité du client
            Verification verification = new Verification();
            boolean response = verification.verificationClient(client);
            System.out.println(response);

            // Création de l'objet JSON de réponse
            JSONObject json = new JSONObject();
            json.put("eligible", response);
            System.out.println(json);

            // Creation du fichier json de réponse
            String answer = "";

            if (args.length != 2) {
                answer = "Mauvais usage des paramètres: " + "\n" +
                        "Usage: programme <Chemin vers le fichier d'entrée> <Chemin vers fichier sortie>";
            } else {
                answer = "{" + "\n" + "         \"eligible\":" + response + "\n" + "}";
            }
            DiskFile.saveStringIntoFile(args[1], answer);

        } catch (Exception e) {
        System.out.println("Fichier ou données invalide(s)");
        }


    }
}

