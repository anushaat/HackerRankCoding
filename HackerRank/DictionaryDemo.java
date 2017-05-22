
import java.util.HashMap;
import java.util.Map;

public class DictionaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> engSpanDictionary = new HashMap<String, String>();
		engSpanDictionary.put("Monday", "Lunes");
		engSpanDictionary.put("Tuesday", "Martes");
		engSpanDictionary.put("Wednesday", "Miercoles");
		engSpanDictionary.put("Thursday", "Jueves");
		engSpanDictionary.put("Friday", "Viernes");
		
		System.out.println(engSpanDictionary.get("Monday"));
		System.out.println(engSpanDictionary.get("Tuesday"));
		System.out.println(engSpanDictionary.get("Wednesday"));
		System.out.println(engSpanDictionary.get("Thursday"));
		System.out.println(engSpanDictionary.get("Friday"));
		System.out.println(engSpanDictionary.keySet());
		System.out.println(engSpanDictionary.values());
		System.out.println("The size of our dictionary is: " +engSpanDictionary.size());
		
		//Shopping List
		
		Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oreos", Boolean.FALSE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.toString());
		
		
		shoppingList.remove("Oreos");
		shoppingList.replace("Bread", Boolean.FALSE);
		
		System.out.println(shoppingList.toString());
		
		shoppingList.clear();
		
		
		
		

	}

}
