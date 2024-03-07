public class constructor{
    public static void main(String []args){
        //default constuctor call
        pair obj = new pair();
        //to avoid this line by line initilization Use Constructor
        obj.x = 10;
        obj.y = 20;
        System.out.println("x:- "+obj.x+" y:-"+obj.y);
        //parametise constructor call
        pair obj1 = new pair(20,30);
        System.out.println("x1:- "+obj1.x+" y1:-"+obj1.y);
        //another parametise constructor call
        pair obj2 = new pair(50);
        System.out.println("x2:- "+obj2.x+" y2:-"+obj2.y);
        
        //Copy Constructor call
        pair obj3 = new pair(obj);
        System.out.println("x3:- "+obj3.x+" y3:-"+obj3.y);
    }
}
class pair{
    int x;
    int y;
    //Default Constructor
    pair(){
        System.out.println("Default Constructor");
    }
    //Parametrise Constructor
    pair(int x1,int y1){
        x = x1;
        y = y1;
        System.out.println("Parameterize Constructor");
    }
    //another parametise constructor
    pair(int x1){
        x = x1;
        System.out.println("Another Parameterize Constructor");
    }
    
    //Copy Constructor 
    pair(pair p1){
        System.out.println("Copy Constructor");
        x = p1.x;
        y = p1.y;
    }
}
