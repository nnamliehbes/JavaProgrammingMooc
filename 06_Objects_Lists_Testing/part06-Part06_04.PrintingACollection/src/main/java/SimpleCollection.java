
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String empty = "The collection " + this.name + " is empty.";
        String mainText = "The collection " + this.name + " has " + elements.size();
        String singular = " element:\n";
        String plural = " elements:\n";
        String collectedStrings = "";

        if (this.elements.isEmpty()) {
            return empty;
        } 
        
        if (this.elements.size() == 1) {
            for (String element : elements) {
                collectedStrings = collectedStrings + element;
            }
            return mainText + singular + collectedStrings;
        }

        for (String element : elements) {
            collectedStrings = collectedStrings + element + "\n";
        }

        return mainText + plural + collectedStrings;

    }
    
}
