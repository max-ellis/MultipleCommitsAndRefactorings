

public class main {

    public static void main(String args[]){
        mult();
    }

    private static void print(int a, int b){
        System.out.println(a*b);
    }

    private static int getX(){
        return 5;
    }


    private static int getY(){
        return 4;
    }

    private static void mult(){
        int x = getX();
        int y = getY();
	x = x*x;
        print(x, y);
    }
}
