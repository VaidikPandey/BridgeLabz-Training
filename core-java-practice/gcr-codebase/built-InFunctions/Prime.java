import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int number =scanner.nextInt();
        if(check(number)){
            System.out.println(number +" is Prime Number.");
        }
        else{
            System.out.println(number+" is not Prime Number.");
        }
        scanner.close();
    }
    public static boolean check(int number){
        if(number <=1) return false;

        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i ==0) return false;
        }
        return true;

    }
}
