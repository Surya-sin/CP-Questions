import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();        
        }

        for(int i = 0 ; i < n ; i++){
            if (arr[i] >= arr[k-1] && arr[i]>0){
                count++;
            }   
        }
        System.out.println(count);


       
        
    }
}
