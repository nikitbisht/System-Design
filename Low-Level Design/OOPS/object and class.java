//Class and Object
	Class:- it is a BluePrint(Structure)
	Object:- real instance of BluePrint

// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        Pair p1 = new Pair(); //object
        p1.x = 10;
        p1.y = 20;
        p1.st = "Nikit";
        
        Pair p2 = new Pair();
        p2.x = 100;
        p2.y = 200;
        p2.st = "eZsnippet";
        
        System.out.println(p1.x + " "+p1.y+" "+ p1.st);
        System.out.println(p2.x + " "+p2.y+" "+ p2.st);
    }
    public static class Pair{
        int x;
        int y;
        String st;
    }
}
