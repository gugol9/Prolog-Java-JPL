import java.util.Map;
import java.util.Scanner;

import org.jpl7.*;

public class Main {
    public static void main(String argv[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz '1' jeśli chcesz zobaczyć jakie są choroby.");
        System.out.println("Wpisz '2' jeśli chcesz zobaczyć jakie są nowotwory.");
        System.out.println("Wpisz '3' jeśli chcesz zobaczyć diagnozę danej choroby.");
        System.out.println("Wpisz '4' jeśli chcesz zobaczyć diagnozę danego nowotworu.");
        String number = scanner.nextLine();


        switch (number) {
            case "1" -> {

                try {
                    System.out.println("Choroby");
                    Query query = new Query("consult('src/med.pl')");
                    query.hasSolution();
                    query = new Query("choroby(X)");

                    Map<String, Term>[] res = query.allSolutions();
                    for (int i = 0; i < res.length; i++) {
                        System.out.println(String.valueOf(res[i]));
                    }
                } catch (UnsatisfiedLinkError e) {
                    System.err.println("Native code library failed to load.\n" + e);
                    System.exit(1);
                }
            }
            case "2" -> {

                try {
                    System.out.println("Nowotwory");
                    Query query = new Query("consult('src/med.pl')");
                    query.hasSolution();
                    query = new Query("nowotwor(X)");

                    Map<String, Term>[] res = query.allSolutions();
                    for (int i = 0; i < res.length; i++) {
                        System.out.println(String.valueOf(res[i]));
                    }
                } catch (UnsatisfiedLinkError e) {
                    System.err.println("Native code library failed to load.\n" + e);
                    System.exit(1);
                }

            }
            case "3" -> {
                System.out.println("DIAGNOZA");
                System.out.println("Pamiętaj o kropce po chorobie.");

                try {
                    System.out.println("Wprowadz nazwę choroby a zobaczysz objawy.");
                    Query query = new Query("consult('src/med.pl')");
                    query.hasSolution();
                    query = new Query("diagnoza(_,A,B,C,D)");
// po nazwie choroby dawać kropkę.
                    Map<String, Term>[] res = query.allSolutions();
                    for (int i = 0; i < res.length; i++) {
                        System.out.println(String.valueOf(res[i]));
                    }
                } catch (UnsatisfiedLinkError e) {
                    System.err.println("Native code library failed to load.\n" + e);
                    System.exit(1);
                }
            }

            case "4" -> {
                System.out.println("Nowotwory");
                System.out.println("Pamiętaj o kropce po nowotworze.");

                try {
                    System.out.println("Wprowadz nazwę nowotworu a zobaczysz objawy.");
                    Query query = new Query("consult('src/med.pl')");
                    query.hasSolution();
                    query = new Query("diagnoza_nowotwor(_,A,B,C,D)");
// po nazwie choroby dawać kropkę.
                    Map<String, Term>[] res = query.allSolutions();
                    for (int i = 0; i < res.length; i++) {
                        System.out.println(String.valueOf(res[i]));
                    }
                } catch (UnsatisfiedLinkError e) {
                    System.err.println("Native code library failed to load.\n" + e);
                    System.exit(1);
                }
            }
        }




    }
}