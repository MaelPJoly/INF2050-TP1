public class Verification {

    public static final int HOMME = 1;
    public static final int FEMME = 2;

    public boolean verificationClient(Client client) {
        boolean response = false;


        // Verification si une personne a moins de 18 ans, elle n'est pas éligible à l'assurance
        if (client.getAge() >= 18) {

            // Verification si une femme a plus de 85 ans, elle n'est pas éligible à l'assurance
            if ((client.getGenre() == FEMME && client.getAge() <= 85) ||

                    // Verification si un homme a plus de 80 ans, il n'est pas éligible à l'assurance
                    (client.getGenre() == HOMME && client.getAge() <= 80)) {

                // Verification si une personne fume du tabac et du cannabis, elle n'est pas éligible à l'assurance;
                // si il n'y a pas de contre-indication si le fumeur ne fume qu'une seule substance.
                if ((client.isTabac() == false || client.isCannabis() == false)) {
                    response = true;
                }
            }

        }
        return response;
    }
}
