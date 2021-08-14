import java.util.*;
class KKFactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int fact=1;
        //using for loop
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
        //using recursion
        fact= factorial(n);
        System.out.println(fact);

        
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return (n*factorial(n-1));
        }
    }
    
}
