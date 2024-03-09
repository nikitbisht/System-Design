public class objectInMemeory{
    public static void main(String []args){
        int x = 10;
        int y = 20;
        System.out.println("Before Swap");
        System.out.println("x:- "+x+" y:- "+y);
        //pass by reference
        swap(x,y);
        System.out.println("After Swap");
        System.out.println("x:- "+x+" y:- "+y);
        //heap
        pair p = new pair();
        p.x =10;
        p.y = 20;
        System.out.println("\nBefore Swap");
        System.out.println("x:- "+p.x+"y:- "+p.y);;
        swpa(p);
        System.out.println("After Swap");
        System.out.println("x:- "+p.x+"y:- "+p.y);;
    }
    public static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }
    public static void swpa(pair p){
        int t = p.x;
        p.x = p.y;
        p.y = t;
    }
}
class pair{
    int x;
    int y;
}
