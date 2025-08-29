package String;

public class sortCharacterByFrequency {
    //leetcode problem: 451 Sort Character By Frequency
    public static void main(String[] args) {
        System.out.println(frequencySort("1ATREE"));
    }
    public static String frequencySort(String s) {
        int[] f = new int[128];
        int n = s.length();
        for(char ch : s.toCharArray()){
            System.out.println(ch-'0');
            f[ch] += 1;
        }
        char[] freq = new char[n];
        int i=0;
        while(i<n){
            int maxi = frequencyMaxI(f);
            int max = f[maxi];
            while(max>0){
                freq[i++] = (char)(maxi);
                max--;
            }
            f[maxi]=0;
        }
        return new String(freq);
    }

    public static int frequencyMaxI(int[] f){
        int max=0, maxi=0;
        for(int i=0; i<f.length; i++){
            if(f[i]>max){
                maxi=i;
                max = f[i];
            }
        }
        System.out.println(maxi+" hello");
        return maxi;
    }
}

// its takes 26ms time and runs 28 min
//    public String frequencySort(String s) {
//        Map<Character,Integer> map = new HashMap<>();
//        map.put(s.charAt(0),1);
//        for(int i=1; i<s.length(); i++){
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)){
//                int value = map.get(ch)+1;
//                map.put(ch,value);
//            }else{
//                map.put(ch,1);
//            }
//        }
//
//        Map<Character, Integer> sortedMap = map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (oldValue, newValue) -> oldValue, // Merge function for duplicate keys (not applicable here)
//                        LinkedHashMap::new // Use LinkedHashMap to maintain order
//                ));
//        String ans = "";
//        for(Map.Entry<Character,Integer> entry : sortedMap.entrySet()){
//
//            String temp = (entry.getKey().toString()).repeat(entry.getValue());
//            ans += temp;
//        }
//
//        return ans;
//    }
