import java.io.*;
import java.util.ArrayList;

public class SaveArrayListDoubles {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(3.4);
        doubles.add(2.56);
        doubles.add(1.234);
        doubles.add(102.9);
        ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(
                                "resources/doubles.list")));
        oos.writeObject(doubles);
        oos.flush();
        ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(
                                "resources/doubles.list")));
        System.out.println("Numbers: "  + ois.readObject());
    }
}