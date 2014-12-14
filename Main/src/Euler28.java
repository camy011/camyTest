public class Euler28 {
    private static final int DIAGONAL =1001; //Must be odd
    public static void run() {

        int[][] spiral = new int [DIAGONAL][DIAGONAL];

        //Initial conditions
        int x= DIAGONAL /2;
        int y= DIAGONAL /2;
        int cnt=1;
        int moveCnt=0;
        spiral[x][y]=cnt;

        //Populate 2dArray
        while(true){
            //move right
            if(y != 0) {
                moveCnt++; //Increment movement number when traveling right
            }
            for(int i=0; i<moveCnt; i++){
                x++;
                cnt++;
                spiral[x][y]=cnt;
            }
            if(y==0 && x == DIAGONAL -1){
                break;
            }

            //move down
            for(int i=0; i<moveCnt; i++){
                y++;
                cnt++;
                spiral[x][y]=cnt;
            }

            //move left
            moveCnt++; //Increment movement number when traveling left
            for(int i=0; i<moveCnt; i++){
                x--;
                cnt++;
                spiral[x][y]=cnt;
            }

            //move up
            for(int i=0; i<moveCnt; i++){
                y--;
                cnt++;
                spiral[x][y]=cnt;
            }
        }

        //Calculate solution
        int solution=-1; //Negate center(1) being counted twice
        for(int i=0; i< DIAGONAL; i++){
            solution=solution+spiral[i][i];
            solution=solution+spiral[i][DIAGONAL -1-i];
        }

        System.out.println("Solution is: " + solution);
    }

}
