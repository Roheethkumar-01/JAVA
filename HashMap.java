//HashMap

import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); 
    System.out.println(capitalCities.size()); 
    System.out.println("KEYS ALONE:");
    for(String i:capitalCities.keySet()){
        System.out.println(i);
    }
    System.out.println("VALUES ALONE:");
    for(String i:capitalCities.values()){
        System.out.println(i);
    }
    System.out.println("KEYS AND VALUES:");
    for(String i:capitalCities.keySet()){
        System.out.println("Key= "+i+" Value= "+capitalCities.get(i));
    }
    System.out.println(capitalCities.get("England"));
    System.out.println(capitalCities.remove("Norway"));
    System.out.println(capitalCities); 
    capitalCities.clear();
    System.out.println(capitalCities); 
  }
}
