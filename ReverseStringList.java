import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseStringList {
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Elderberry");

        
        System.out.println("Original List: " + stringList);

        
        Collections.reverse(stringList);

        
        System.out.println("Reversed List: " + stringList);
    }
}