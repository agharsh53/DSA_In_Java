package Hashmaps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<n; i++){
            int key = arr[i];
            int freq = 0;
            if(mp.containsKey(key)){
                freq = mp.get(key);

            }
            freq++;
            mp.put(key,freq);
        }

        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            // fetch:
            if (mp.containsKey(number)) System.out.println(mp.get(number));
            else System.out.println(0);
        }
    }

}
