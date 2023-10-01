import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        int ans = 0;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i = 0 ; i<num ; i++){
            int count = 0;

            for(int j = 0 ; j<3 ; j++){
                int input = in.nextInt();
                if (input == 1) {
                    count++;
                }
        
            }
            if (count >= 2) {
               ans++;
            }
        }
        System.out.println(ans);
       
        
       
    }
}
