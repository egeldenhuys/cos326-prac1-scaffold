import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "database.db4o");
        try {
            // do something with db4o
        } finally {
            db.close();
        }
    }
}
