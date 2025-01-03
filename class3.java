import java.util.Scanner;
class myclass3 {
    private int a;
    void p_series(){
        
        int s = 0;
        for(int i = 2; i<=a; i++){
            s = 0;
            for(int j = 2; j<i/2; j++){
                if(i%j==0){
                    s++;
                    break;
                } 
            }
            if(s==0)
            {
                System.out.println(i);
            }
        }

    }

    public myclass3(int x){
        a = x;
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        myclass3 obj = new myclass3(num);
        obj.p_series();
    } 
}
