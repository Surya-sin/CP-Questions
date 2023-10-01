import java.util.Scanner;

public class waytoolong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); //number of words 
        for(int i = 0 ; i <num ; i++){
            String word = in.next();
            if(word.length()>10){
                System.out.print(word.charAt(0));
                System.out.print(word.length()-2);
                System.out.println(word.charAt(word.length()-1));
                
            }
            else{
                System.out.println(word);
            }
        }

      

    }
}
