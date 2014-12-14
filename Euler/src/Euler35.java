import java.util.HashSet;
import java.util.Set;

public class Euler35 {

    private static Set<Integer> knownPrimes = new HashSet<Integer>();

    public static void run() {
        int solution=1; //Only even prime accounted for here

        for(int i=3; i<1000000; i+=2){
            if(!isPrime(i)){
                continue;
            }

            boolean prime=true;
            String num=Integer.toString(i);
            for(int j=0; j<num.length()-1; j++){
                num=rotate(num);
                if(!isPrime(Integer.parseInt(num))){
                    prime=false;
                    break;
                }
            }

            if(prime){
                solution++;
            }
        }

        System.out.println("Solution is: " + solution);
    }

    private static String rotate(String s){
        return s.substring(1)+s.charAt(0);
    }

    private static boolean isPrime(int value){ //Other then 2
        if(value%2==0) {
            return false;
        }

        if(knownPrimes.contains(value)){
            return true;
        }

        for(int i=3; i<=Math.sqrt(value); i+=2){
            if(value%i==0){
                return false;
            }
        }

        knownPrimes.add(value);
        return true;
    }

}