package AssessmentTest;

import java.util.ArrayList;
import java.util.List;

public class justifyContent {
    public static void main(String[] args) {
        //String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        //String[] words = {"Listen","to","many,","speak","to","a","few."};
        String[] words = {"What","must","be","shall","be."};
        //String[] words = {"ask","not","what","your","country","can","do","for","you","ask","what","you","can","do","for","your","country"};
        //String[] words = {"Twenty","years","from","now","you","will","be","more","disappointed","by","the","things","you","didn't","do","than","by","the","ones","you","did.","So","throw","off","the","bowlines,","Sail","away","from","the","safe","harbor.","Catch","the","trade","winds","in","your","sails.","Explore.","Dream."};
        int maxWidth = 16;
        List<String> ans = concatinateWords(words,maxWidth);
        //System.out.println(ans);
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
            System.out.println(ans.get(i).length());
        }
    }
    public static List concatinateWords(String[] words, int maxWidth){
        int n = words.length;
        List<String> justifyString = new ArrayList<>();
        int i=0;
        String s = "";
        while(i<n){

            if(words[i].length()<=maxWidth){

                if(words[i].length()<=maxWidth-s.length()){
                    s += words[i]+" ";
                    //System.out.println(s);
                    i++;
                }else{
                    s = addSpaces(s,maxWidth);
                    if(s.length()!=maxWidth){
                        s = addSpaces(s,maxWidth);
                    }

                    justifyString.add(s);
                    //System.out.println(justifyString+"1");
                    s = "";
                }
            }

        }
        if(s!=""){
            int space = maxWidth - s.length();
            if(space>0){
                s += String.format("%" + space + "s", " ");
            }

            //s = addSpaces(s,maxWidth);
            if(s.length()>maxWidth){
                s = s.trim();
            }
            justifyString.add(s);
        }
        return justifyString;
    }

    public static String addSpaces(String s, int maxWidth){
        int space  = maxWidth-s.trim().length();
        String[] splitStr = s.split(" ");
        int n=splitStr.length;

        if (space <= 0) return s.trim();


        if(space< n && n>2){
            StringBuilder temp = new StringBuilder(s.trim());
            int index =0;
            for (int i=0; i<space; i++){
                temp.insert(index+splitStr[i].length()," ");
                index += splitStr[i].length()+2;
            }
            return temp.toString();
        }
        int addSpace = (space / (n - 1)) + 1;
        if (addSpace <= 0) addSpace = 1;
        String spaceAdd = String.format("%" + addSpace + "s", " ");
        String ans = "";
        for (int i=0; i<n-1; i++){

            ans += splitStr[i]+spaceAdd;
        }
        ans += splitStr[n-1];
        //System.out.println(ans);
        return ans;
    }
}
