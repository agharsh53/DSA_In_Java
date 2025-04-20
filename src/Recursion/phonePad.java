package Recursion;

import java.util.ArrayList;

public class
phonePad {
    public static void main(String[] args) {
        //pad("","23");
        ArrayList<String> ans = padret("","23");
        System.out.println(ans);
        System.out.println(padCount("","12"));
        //https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/1333761403/
        System.out.println(combinationPhonePad("","8"));
        System.out.println(combinationPhonePad("","789").size());

    }

    public static ArrayList<String> padret(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) -'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i=(digit-2)*3; i<(digit-1)*3; i++){
            char ch = (char) ('a'+i);
            list.addAll(padret(p+ch,up.substring(1)));
        }
        return list;
    }

    public static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) -'0';
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            pad(p+ch,up.substring(1));
        }
    }

    public static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        int digit = up.charAt(0) -'0';
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char) ('a'+i);
            count = count+padCount(p+ch,up.substring(1));
        }
        return count;
    }

    public static ArrayList<String> combinationPhonePad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) -'0';
        ArrayList<String> list = new ArrayList<>();
        if(digit==7){
            for(int i=(digit-2)*3; i<((digit-1)*3)+1; i++){
                char ch = (char) ('a'+i);
                list.addAll(combinationPhonePad(p+ch,up.substring(1)));
            }
        }else if(digit==9){
            for(int i=(digit-2)*3+1; i<((digit-1)*3)+2; i++){
                char ch = (char) ('a'+i);
                list.addAll(combinationPhonePad(p+ch,up.substring(1)));
            }
        }else if(digit==8){
            for(int i=(digit-2)*3+1; i<((digit-1)*3)+1; i++){
                char ch = (char) ('a'+i);
                list.addAll(combinationPhonePad(p+ch,up.substring(1)));
            }
        }else{
            for(int i=(digit-2)*3; i<(digit-1)*3; i++){
                char ch = (char) ('a'+i);
                list.addAll(combinationPhonePad(p+ch,up.substring(1)));
            }
        }

        return list;
    }
}
