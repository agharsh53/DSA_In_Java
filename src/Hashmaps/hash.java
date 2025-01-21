package Hashmaps;

import java.util.Scanner;

public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        //int[] arr = new int[n];
//        for (int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }

        int[] hash = new int[25];
        for (int i=0; i<s.length(); i++){
            hash[s.charAt(i) - 'a']++;
        }

        int q = sc.nextInt();
//        while (q--!=0){
//            int number = sc.nextInt();
//            System.out.println(hash[number]);
//        }
        while (q--!=0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
    }
}
