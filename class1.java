class myclass{
    private int a, b;
    void greater(){
        if(a>b){
            System.out.println("First number is greater");
        }
        else{
            System.out.println("Second number is greater");
        }
    }

    public myclass(int a, int b){
        a = a;
        b = b;
    }

    public static void main(String arg[]){
        int s = 10, t = 15;
        myclass obj = new myclass(s,t);
        obj.greater();
    }
}