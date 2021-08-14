import java.util.*;
class KKCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double result;
        char ch = sc.next().charAt(0);
        if(ch=='+'){
             result = a+b;
             System.out.println(result);
        }
        if(ch=='-'){
             result = a-b;
             System.out.println(result);
        }
        if(ch=='*'){
             result = a*b;
             System.out.println(result);
        }
        if(ch=='/'){
             result= a/b;
             System.out.println(result);
        }
        
        
    }
    
}
