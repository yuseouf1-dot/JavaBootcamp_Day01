import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var){
        ArrayList<String> myArray = new ArrayList<>();
        for (String str : var) {
            myArray.add(str);
        }
        return myArray;
    }
}
