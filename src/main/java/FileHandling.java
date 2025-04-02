import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        var myFileWriter = new FileWriter("log.txt");

        myFileWriter.write("El usuario se conecta a las 14:00 \n");
        myFileWriter.write("A las 14:50 aparece un error del servidor \n");
        myFileWriter.close();
    }
}
