import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeveloperMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you need programmer?(yes/no) ");
        String answer = scanner.next();
        if (answer.equals("yes")){
            System.out.println("JavaDeveloper is created");
            action(new JavaDeveloper("Julia Decaprio",
                    Level.JUNIOR,
                    new ArrayList<String>(List.of("blind programming", "no hand programming", "AndroidStudio", "JavaScript")),
                    6));
        }
        if (answer.equals("no")){
            System.out.println("PythonDeveloper is created");
            action(new PythonDeveloper("Pavel Deletant",
                    Level.SENIOR,
                    new ArrayList<String>(List.of("knows how to tie his own shoelaces", "ability to hate any language(without Python and GOlang)", "can tell about python libs for 10 hours")),
                    2));
        }

    }
    public static void action(Developer developer){
        developer.write_code();
    }
}
