package HackWithInfyQuestions;
import java.util.Arrays;

//Today you decided to go to the gym. You currently have E energy. There are N exercises in the gym. Each of these exercises drains Ai amount of energy from your body.
//You feel tired if your energy reaches 0 or below. Calculate the minimum number of exercises you have to perform such that you become tired. Every unique exercise can only be performed at most 2 times as others also have to use the machines.
//If performing all the exercises does not make you feel tired, return -1.
public class minNumOfExercise {
    public static void main(String[] args) {
        int energy = 6;
        int n =2;
        int[] exercise = {1,2};
        Arrays.sort(exercise);
        System.out.println(minNumOfExercise(energy,n,exercise));
    }

    public static int minNumOfExercise(int e , int n, int[] exercise){
        int count =0;

        for(int j=0; j<2; j++){
            for(int i=0; i<exercise.length; i++){
                if(e>=exercise[i]){
                    e = e-exercise[i];
                    count += 1;
                }
                if(e==0){
                    break;
                }
            }
        }
        if(e>0){
            return -1;
        }
        return count;
    }
}
