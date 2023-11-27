import java.io.FileNotFoundException;
import java.io.FileReader;


public class L2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("1");

        }catch (FileNotFoundException e) {
            System.out.println("not ok");
        }
        System.out.println("ok");



    }
}
