import java.util.Map;
import org.jpl7.*;

public class Main {
    public static void main(String argv[]) {
        try {
            System.out.println("Choroby");
            Query query = new Query("consult('src/med.pl')");
            query.hasSolution();
            query = new Query("choroby(X)");

            Map < String, Term > [] res = query.allSolutions();
            for (int i = 0; i < res.length; i++) {
                System.out.println(String.valueOf(res[i]));
            }
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load.\n" + e);
            System.exit(1);
        }
        try {
            System.out.println("Obrajwy tej choroby");
            Query query = new Query("consult('src/med.pl')");
            query.hasSolution();
            query = new Query("diagnoza(_,A,B,C,D)");

            Map < String, Term > [] res = query.allSolutions();
            for (int i = 0; i < res.length; i++) {
                System.out.println(String.valueOf(res[i]));
            }
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Native code library failed to load.\n" + e);
            System.exit(1);
        }
    }
}
