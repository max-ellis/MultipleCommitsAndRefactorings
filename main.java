

public class main {

    public static void main(String args[]){
        foo();
    }


    private static int getIntX(){
        return 5;
    }


    private static int getIntY(){
        return 4;
    }

    private static void graph(int a, int b){
        System.out.println(a*b);
    }

    private static void foo(){
        int x = getIntX();
        int y = getIntY();
	x = x*x;
        graph(x, y);
    }
}
