
public class ex_02 {

    public static void main(String[] args) {

        getAngryDog(3);

    }

    public static String getAngryDog(int nbr) {
        String bark = "";

        for (int i = 0; i < nbr; i++) {
            bark += "woof";
        }
        System.out.println(bark);
        return bark;
    }

}
