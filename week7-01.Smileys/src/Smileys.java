
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("87.");
        printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String word) {
        if(word.length() % 2 != 0){
            word += " ";
        }
        word = ":) "+word+" :)";
        
        int length = word.length() / 2;
        
        printSmiles(length);
        System.out.println(word);
        printSmiles(length);
        
    }
    
    public static void printSmiles(int length){
        for (int i = 0; i < length; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }
    
}
