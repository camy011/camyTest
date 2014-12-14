public class Euler30 {

    public static void run() {
        int solution=0;
        for(int i=10; i<999999; i++){
            String s=Integer.toString(i);
            int sum=0;
            for(int j=0; j<s.length(); j++){
                sum+=Math.pow((s.charAt(j)-48),5);
            }
            if(sum==i){
                solution+=i;
            }
        }
        System.out.println("Solution is: " + solution);
    }

}
