import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a 3 digit number:");
        int num = in.nextInt();
        if(armNum(num)){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }
    static boolean armNum(int n){
        int sum = 0;
        int original = n;
        while(n>0){
            int rem = n % 10;
            n = n /10;
            sum = sum + rem*rem*rem;
        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
