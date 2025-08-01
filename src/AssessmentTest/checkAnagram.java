package AssessmentTest;
import java.util.*;
public class checkAnagram {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();

        System.out.println(findAnagram(s,p));
    }
    public static List findAnagram(String s, String p){
        int n = s.length();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<=n-p.length(); i++){
            if(checkStr(s,i,p)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean checkStr(String s, int i, String p){
        char[] ch = new char[p.length()];
        for(int j=0; j<p.length(); j++){
            ch[j] = p.charAt(j);
        }
        String str = "";
        boolean check = true;
        for(int j=i; j<i+p.length(); j++){
            str += s.charAt(j);
        }
        for(int k=0; k<ch.length; k++){
            String str2 = ch[k]+" ";
            if(!str.contains(str2.trim())){
                return false;
            }
        }



        return true;
    }

}
