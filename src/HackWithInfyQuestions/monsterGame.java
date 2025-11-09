package HackWithInfyQuestions;
import java.util.*;
public class monsterGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int man = sc.nextInt();
        int[] monster = new int[n];
        int[] bonus = new int[n];
        for(int i=0; i<n; i++){
            monster[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            bonus[i] = sc.nextInt();
        }
        class Monster{
            int power, bonus;
            Monster(int p, int b){
                this.power = p;
                this.bonus = b;
            }
        }
        Monster[] monsters = new Monster[n];
        for( int i=0; i<n; i++){
            monsters[i] = new Monster(monster[i],bonus[i]);
        }
        int count=0;
        Arrays.sort(monsters,Comparator.comparingInt(m->m.power));
        for(Monster m:monsters){
            if(m.power<=man){
                man += m.bonus;
                count++;
            }else{
                break;
            }
        }
        System.out.println("Man can fight "+count+" monster");
    }

}
