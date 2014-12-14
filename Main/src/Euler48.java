import java.math.BigInteger;

public class Euler48 {

    public static void run() {
        BigInteger value=new BigInteger("1");

        for(int i=2; i<=1000; i++){
            value=value.add(new BigInteger(Integer.toString(i)).pow(i));
        }

        String solution=value.toString();
        solution=solution.substring(solution.length()-10,solution.length());

        System.out.println("Solution is: " + solution);
    }

}
