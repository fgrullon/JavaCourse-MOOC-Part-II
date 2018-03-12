package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        if(weight < 0){
            throw new IllegalArgumentException();
        }else{
            this.weight = weight;
        }
        
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this.hashCode() == obj.hashCode()){
            return true;
        }else{
            return false;
        }
    }

    
    @Override
    public int hashCode(){
        return this.name.hashCode();
    }

}
