import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print(func(a,b));
    }
    public static int func(int a,int b){
        if(b==0){
            return a;
        }
        return func(b,a%b);
    }
}
