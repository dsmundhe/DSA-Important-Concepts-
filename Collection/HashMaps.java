package Collection;

import java.util.HashMap;
public class HashMaps {
    public static void main(String[] args) {

//        put -> map.put(key , value);
//        get -> map.get(key);
//        remove -> map.remove(key);
//        size -> map.size();
//        containsKey -> map.containsKey(key);
//        containsValue -> map.containsValue(value);
//        keySet -> map.keySet();
//        values -> map.values();

        HashMap<String,Integer>studentData=new HashMap<>();
        studentData.put("Dipak",99);
        studentData.put("Nitin",99);
        studentData.put("Shubham",98);
        studentData.put("Om",98);
        System.out.println("Data : "+ studentData);

        System.out.println("Size : "+ studentData.size());

        System.out.println("Is contains : "+ studentData.containsKey("Dipak"));
        System.out.println("IS contains : "+studentData.containsValue(99));

        //get value
        System.out.println("Get data : "+studentData.get("Dipak"));

        //remove value
        studentData.remove("Shubham",98);
        System.out.println("Updated Map : "+ studentData);

        //for loop on hashmap
        for(Integer vals : studentData.values()){
            System.out.println(vals);
        }

        //for loop for keys
        for(String name:studentData.keySet()){
            System.out.println(name + " -> "+studentData.get(name));
        }

        //found name by value
        System.out.println("Find name : "+ getNameByValue(studentData,99));

        System.out.println("Values : " +studentData.values());
        System.out.println("Key Set : "+studentData.keySet());
        System.out.println("Entry Set : "+studentData.entrySet());

        System.out.println("Get value : "+studentData.get("Dipak"));



    }
    public static String  getNameByValue(HashMap<String,Integer> map,int value){
        for (String key :map.keySet()){
            if(map.get(key)==value){
                return key;
            }
        }
        return "Not found";
    }
}
