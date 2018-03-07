
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        
        int i = 0;
        while(i < 100){
            Thing brick = new Thing("btick", i + 1);
            Suitcase s = new Suitcase(101);
            s.addThing(brick);
            container.addSuitcase(s);
            i++;
        }
    }

}
