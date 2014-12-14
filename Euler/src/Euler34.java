public class Euler34 {

    public static void run() {
        int solution=0;

        for(int i=3; i< 100000; i++) {
            int sum=0;
            String s=Integer.toString(i);
            for(int c=0; c<s.length(); c++){
                sum+=calculateFactorial(s.charAt(c)-48);
            }

            if(sum==i){
                solution+=i;
            }
        }

        System.out.println("Solution is: " + solution);
    }

    private static int calculateFactorial(int number){
        int result=1;
        for(int i=2; i<=number; i++){
            result*=i;
        }
        return result;
    }

}
