package Hashmaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hasing {
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US",30);
        map.put("China",320);
        System.out.println(map);

        map.put("China",150);
        System.out.println(map);

        //Deletion
        map.remove("China");
        System.out.println();

        //Search
//        if(map.containsKey("China")){
//            System.out.println("Key is present in the map");
//        }else{
//            System.out.println("Key is not present in the map");
//        }

//        System.out.println(map.get("India")); //Key exist
//        System.out.println(map.get("Indonasia")); //key doesn't exits

        //for(int val: arr)
        for(Map.Entry<String ,Integer> e: map.entrySet()){
            System.out.print(e.getKey()+" : ");
            System.out.print(e.getValue());
            System.out.println();
        }

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+" "+map.get(key));
        }


    }

}
