import java.util.HashMap;
import java.util.Map;

/**
 * DictionaryPractice
 */
public class DictionaryPractice {

    public static void main(String[] args) {
        //English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<String, String>();
        
        // Putting/Inserting Things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");

        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));
        //print out keys in array
        System.out.println(englSpanDictionary.keySet());
        //print out values in array
        //no ordering!
        System.out.println(englSpanDictionary.values());
        // Print out size of map
        System.out.println(englSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping List
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        //Put some stuff in dictionary

        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        
        //Retreive Items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));

        // Key Value Pairs Print Out

        System.out.println(shoppingList.toString());
        //Is the dictionary empty?
        System.out.println(shoppingList.isEmpty());
        
        //Remove a key value pair
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());

        //changing a value
        shoppingList.replace("Bread", false);
        System.out.println(shoppingList.toString());

        //Clear our dictionary

        shoppingList.clear();
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.isEmpty());

    }
}