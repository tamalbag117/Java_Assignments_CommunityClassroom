import java.util.*;
class FlowOfProgram 
{
    

    public static void main(String[] args)
    {
        System.out.println("FLOW OF PROGRAM BASIC PROBLEMS");
        System.out.println("_______________________________________________________________________________");
        System.out.println("PRINT A CHARACTER BETWEEN A TO E.(PRESS 0 TO EXIT.");
        System.out.println("A.INPUT A YEAR AND FINE ITS LEAP YEAR OR NOT.");
        System.out.println("B.TAKE TWO NUMBERS AND PRINT THE SUM OF BOTH.");
        System.out.println("C.TAKE A NUMBER AS INPUT AND PRINT THE MULTIPLICATION TABLE FOR IT.");
        System.out.println("D.TAKE 2 NUMBERS AS INPUT AND FIND THEIR HCF AND LCM.");
        System.out.println("E.KEEP TAKING INPUTS FROM USER TILL THE USER ENTERS 'X' AFTER THAT PRINT SUM OF IT.");
        Scanner sc= new Scanner(System.in);
        char n=sc.next().charAt(0);
        if(n=='0')
        {
            System.out.println("EXIT. THANKS FOR USING.");
        }
        switch (n) 
        {
            case 'A':
                System.out.println("input year");
                int year=sc.nextInt();
                boolean leap= false;
                if(year%4==0)
                {
                    if(year%100==0)
                    {
                        if(year%400==0)
                        {
                            leap=true;
                        }
                        else
                        {//year not divisible by 400
                            leap= false;
                        }
                    }
                    else
                    {//year not divisible by 100
                            leap=false;
                        }
                    }
                 else
                 {//year not divisible by 4
                        leap= false;
                 }
                if(leap)
                {
                    System.out.println("leap year");

                } 
                else
                {
                    System.out.println("not a leap year");
                }
                break;
            case 'B':
                System.out.println("sum of 2 numbers");
                int x= sc.nextInt();
                int y= sc.nextInt();
                System.out.println("sum is"+(x+y)); 
                break;   
            case 'C':
                System.out.println("multiplication table");
                int m= sc.nextInt();
                for(int i=1;i<10;i++)
                {
                    int result= m*i;
                    System.out.println(m+" X "+i+" = "+result);
                }   
                break;
            case 'D':
                System.out.println("hcf anf lcm");
                int r= sc.nextInt();
                int f= sc.nextInt();
                int a=r;
                int b=f;
                while(b!=0)
                {
                    int temp=b;
                    b=a%b;
                    a=temp;
                }   
                int hcf= a;
                int lcm= (r*f)/hcf;
                System.out.println("hcf is: "+hcf);
                System.out.println("lcm is: "+lcm);
                break;
            case 'E':
                System.out.println("sum until input X");
                int sum=0;
            
                while (true) {
               String number = sc.next();
                   if((number.trim().charAt(0)>='0'&&number.trim().charAt(0)<='9')||((number.trim().charAt(0)=='-')&&(number.trim().charAt(1)>='0'&&number.trim().charAt(1)<='9'))){
                    sum = sum + Integer.parseInt(number);
                   }
             if (number.trim().charAt(0) == 'x' || number.trim().charAt(0)== 'X') {
                    System.out.println(sum);
                    break;
                }
            }
                break;
            case '0':
                break;

            default:
                System.out.println("enter correct number");
                break;
        }
        sc.close();

    }
        
    }
        
    
    
    

