package JavaBootcamp_Day01.ex_02;

public class Ex02 {
    public static String getAngryDog(int nbr){
        StringBuilder angryDog = new StringBuilder();
        for (int i = 0; i < nbr; i++) {
            angryDog.append("woof");
        }
        return angryDog.toString();
    }
}
