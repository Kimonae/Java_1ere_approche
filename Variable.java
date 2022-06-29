public class Variable {
    public static void main(String[] args){
        int longueur=200;
        int largeur=50;
        int perimetre=2*(longueur+largeur);
        int surface=longueur*largeur;
        System.out.println(perimetre);
        System.out.println(surface);

        String prenom="Kimo";
        String nom="nae";
        char genre='M';
        int age=24;
        String pays="France";

        //sout ou souf en raccourci
        System.out.println("Je suis "+prenom +" " +nom+" j'ai "+age+" ans , je suis né en" +pays);
        System.out.printf("Moi, je suis %s %s, j'ai %d. Je suis né en %s.\n",prenom,nom,age,pays);

        float prixUht=15.5f;
        double prix=17.57;

        /*
        *long commentaire
         */


    }
}
