/* Polymorphism --- Overloading Example 
-- Notice: Method overloading happens within SAME class  while overriding needed to 'extends' from Parent to Child ...*/
// class is a blueprint of obj
public class Main {
    // std static main() method w/ no return type (void)
    public static void main(String[] args) {
        
        add(1, 3);
        add(1, 3, 5);
    }

    // side note: you don't need method to be 'static' (local) to be overloaded,
    // but if not will need to create an instance of a class in order to call .add() method
    public static void add(int termOne, int termTwo){
        System.out.println("Method to be overloaded: ");
        System.out.println(termOne + termTwo);
    }

    // 1 way to overload method --- change # of args
    public static void add(int termOne, int termTwo, int termThree){
        System.out.println("Method overloading via changing # of args: ");
        System.out.println(termOne + termTwo + termThree);
    }

    // 2nd to overload method --- change type of args
    public static void add(double termOne, double termTwo){
        System.out.println("Method overloading via changing types of args: ");
        System.out.println(termOne + termTwo);
    }
}