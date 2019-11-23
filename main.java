

public class main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
        int x = getIntX();
        int y = getIntY();
        print(x, y);
    }

    private static int getIntX(){
        return 5;
    }


    private static int getIntY(){
        return 4;
    }

    private static void print(int a, int b){
        System.out.println(a*b);
    }
}
