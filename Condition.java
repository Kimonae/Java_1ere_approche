public class Condition {
    public static void main(String[] args) {
        int age=19;

        //si age >= 18 alors

        boolean estMajeur= age >=18;
        if(age >= 18){
            System.out.println("Vous pouvez vous inscrire à la compétition.");
        }else
        System.out.println("Vous n'avez pas l'âge minimum, demandez à vos parents ou soyez patient.");
    }

}
