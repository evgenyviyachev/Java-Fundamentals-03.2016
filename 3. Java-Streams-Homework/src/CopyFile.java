import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("resources/Capture.PNG");
        OutputStream os = new FileOutputStream("resources/my-copied-picture.PNG");
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
        is.close();
        os.close();
    }
}