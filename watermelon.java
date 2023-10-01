import java.util.Scanner;

public class watermelon{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number==2 || number%2!=0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

        
    }
}