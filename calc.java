import java.util.Scanner;

class cal{
    public int a, b, c;

    void add(){
        System.out.println("Addition = " + (a+b));
    }
    void sub(){
        System.out.println("Subtraction = " + (a-b));
    }
    void mul(){
        System.out.println("Multiplication = " + (a*b));
    }
    void div(){
        System.out.println("Division = " + (a/b));
    }

    public cal(int x, int y){
        a = x;
        b = y;
    }
}

class c_main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Press 1 for Addition  \nPress 2 for Subtraction \nPress 3 for Multiplication \nPress 4 for Division \n");
        int opr = sc.nextInt();

        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();

        cal obj = new cal(a, b);

        switch (opr) {
            case 1:
                obj.add();
                break;

            case 2:
                obj.sub();
                break;
            
            case 3:
                obj.mul();
                break;

            case 4:
                obj.div();
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}