

public class main {

    public static void main(String args[]){
        foo();
    }


    private static int getX(){
        return 5;
    }


    private static int getY(){
        return 4;
    }

    private static void graph(int a, int b){
        System.out.println(a*b);
    }

    private static void foo(){
        int x = getX();
        int y = getY();
	x = x*x;
        graph(x, y);
    }
}
