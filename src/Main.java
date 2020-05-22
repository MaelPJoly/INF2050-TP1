public class Main {

    public static void main (String [] args) throws Exception {

        // Convertion du fichier en objet Json
        Convertor convertor = new Convertor();
        Client client = convertor.convert("/home/mael/Documents/Informatique/TP1 - INF2050 - Ete2020/src/FicherTest.json");

        // Verification de la validité du client
        Verification verification = new Verification();
        boolean response = verification.verificationClient(client);
        System.out.println(response);
    }

//    //
//        JSONObject jsonObject = new JSONObject();
//        Map<String, Boolean> answer = new HashMap<String, Boolean>();
//
//        answer.put(1, new Employee("Adithya", "Jai", 30));    }
}
