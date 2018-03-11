
import containers.ContainerHistory;
import containers.ProductContainerRecorder;
import containers.ProductContainer;


public class Main {

    public static void main(String[] args) {
        // write test code here
ProductContainerRecorder mtv = new ProductContainerRecorder("kahvi",10,5);

        System.out.println(mtv.takeFromTheContainer(7));
        

    }
    

}
