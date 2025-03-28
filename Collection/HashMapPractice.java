package Collection;
import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        //Student wise marks store
        //here we are having key and value that's why we will use HashMap data Structure!

        HashMap<String,Integer> map=new HashMap<>();

        //put students mark wise
        map.put("Dipak",99);
        map.put("Sahil",98);
        map.put("Aashvi",97);
        map.put("Maithili",96);
        map.put("Nitin",99);

        System.out.println(map);

        System.out.println(map.get("Dipak"));
        System.out.println(map.get("Nitin"));

        System.out.println(map.containsKey("Dipak"));
        System.out.println(map.containsValue(99));
        System.out.println(map.keySet());

         //print key and value pairs
        for(String key :map.keySet()){
            System.out.println("Name : "+key  + " , Marks : "+ map.get(key));
        }
    }
}
