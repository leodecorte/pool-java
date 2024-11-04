import java.util.ArrayList;

public class ex_03 {

    public static void main(String[] args) {

        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("toto");
        myArray.add("tata");
        myArray.add("titi");
        printArray(myArray);
        
    }

    public static void printArray(ArrayList<String> myArray) {
        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }
    }
}
