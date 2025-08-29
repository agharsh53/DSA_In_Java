package String;

public class romanToInt {
    //leetcode problem : 13 Romaan to Int
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        if(s == null){
            return 0;
        }
        int length = s.length();
        int sum = 0;
        int pre = 0;
        for(int i=length-1; i>=0; i--){
            int num = RomanNum(s.charAt(i));
            if(i == length-1){
                sum = sum + num;
            }
            else
            {
                if(num<pre){
                    sum = sum -num;
                }
                else{
                    sum = sum + num;
                }
            }
            pre = num;

        }
        return sum;
    }

    public static int RomanNum(char choice){
        int num = 0;
        switch(choice){
            case 'I':
                num = 1;
                break;
            case 'V':
                num = 5;
                break;
            case'X':
                num = 10;
                break;
            case 'L':
                num =50;
                break;
            case 'C':
                num =100;
                break;
            case'D':
                num =500;
                break;
            case 'M':
                num =1000;
                break;
            default:
                num =0;
                break;
        }
        return num;
    }
}
