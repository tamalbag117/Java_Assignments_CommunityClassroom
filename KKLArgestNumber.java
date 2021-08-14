import java.util.*;
class KKLArgestNumber {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int max=0;
        while (true){
            int n= sc.nextInt();
            if(n!=0){
                if(n>max){
                    max=n;
                }
            }
            else{
                System.out.println(max);
                break;
            }
            
        }
        sc.close();
        
    }
    
}
