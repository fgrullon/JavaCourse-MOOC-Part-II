package dictionary;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
MindfulDictionary s = new MindfulDictionary("src/words.txt");
s.load();


        System.out.println(s.translate("monkey"));
 

//expected:<apina> but was:<null>
 



 
    }
}
