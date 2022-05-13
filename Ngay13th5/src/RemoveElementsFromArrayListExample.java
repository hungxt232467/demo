import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programingLanguages = new ArrayList<>();
        programingLanguages.add("C");
        programingLanguages.add("C++");
        programingLanguages.add("Java");
        programingLanguages.add("Kotlin");
        programingLanguages.add("Python");
        programingLanguages.add("Perl");
        programingLanguages.add("Ruby");
        System.out.println("Initial List: " + programingLanguages);
        programingLanguages.remove(5);
        System.out.println("After remove(\"Kotlin\"): " + programingLanguages);
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");
        programingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programingLanguages);
        programingLanguages.removeIf(n -> (n.charAt(0) == 'T'));
        System.out.println("After Removing all elements that start with\"c\": " + programingLanguages);
        programingLanguages.clear();
        System.out.println("After clear(): " + programingLanguages);
    }
}
