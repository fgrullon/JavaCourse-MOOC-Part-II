
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public int getRingingYear(){
        return this.ringingYear;
    }
    

    
    @Override
    public boolean equals(Object obj){
        if(this.hashCode() == obj.hashCode()){
            return true;
        }
        return false;

    }

    @Override
    public int hashCode(){
        int result = 17;
        result = 31 * result + this.latinName.hashCode();
        result = 31 * result + this.ringingYear;
        return result;
    }
    

}


