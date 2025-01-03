import java.util.Scanner;
class myclass2{
    private int n,a;
    void cal(){
        System.out.println("a = "+ a);
        System.out.println("n = "+ n);
        switch(n) {
            case 1:
                int i = 1, fact = 1;
                while(i <= a){
                    fact = fact * i;
                    i++;
                }
                System.out.println("Factorial = " + fact);
                break;

            case 2:
                for(int k = 0; k < a; k++ ){
                    for(int j = 0; j <= k; j++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 3: 
                if(a > 0){
                    System.out.println(a + " is a Positive Number");
                }
                else if(a < 0){
                    System.out.println(a + " is a Negative Number");
                }
                else{
                    System.out.println("Number is Zero");
                }
                break;   
                
            case 4:
            int s = 0, t = 2;
                while(t < a){
                    if(a%t == 0){
                        s++;
                        break;
                    }
                    t++;
                }
                if(s==0){
                    System.out.println(a + " is a Prime Number");
                }
                else{
                    System.out.println(a + " is not a Prime Number");
                }
                break;

            default:
                System.out.println("Invalid input");
                break;
        }

    }
    public myclass2(int x, int y){
        n = x;
        a = y;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1 for factorial, 2 for star pattern, 3 for negative-positive, 4 for Prime Number");
        int num = sc.nextInt();

        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        
        myclass2 obj = new myclass2(num, a);
        obj.cal();

    }
} 
