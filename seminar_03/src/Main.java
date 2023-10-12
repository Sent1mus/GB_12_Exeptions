import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = Person.dataConsoleInput();
        System.out.println("Person = " + person);
        try (FileWriter fw = new FileWriter(person.getSurname() + ".txt", true)) {
            fw.write(person.toString() + "\n");
        }
        catch (IOException e){
            throw new IOException("Unable to write data to file");
        }
    }
}
