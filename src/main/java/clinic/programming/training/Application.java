package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils; // Fixed the incorrect package name

public class Application { // Corrected class declaration, removed extra parentheses
    public void greet() { // Moved the greet method inside the Application class
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");

        for (String greeting : greetings) {
            System.out.println("greeting: " + greeting);
        }
    }

    public int countWords(String words) { // Fixed method declaration
        String[] separateWords = StringUtils.split(words, ' '); // Fixed the split method call and spelling
        return (separateWords == null) ? 0 : separateWords.length; // Fixed the spelling of "length"
    }

    public static void main(String[] args) { // Moved main method inside the Application class
        System.out.println("Starting Application");
        Application app = new Application();
        app.greet(); // Call the greet method to see the greetings

        System.out.println("Word count: " + app.countWords("Hello world")); // Added call to countWords method
    }
}

