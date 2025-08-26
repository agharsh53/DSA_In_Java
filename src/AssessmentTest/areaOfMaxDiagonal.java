package AssessmentTest;

public class areaOfMaxDiagonal {

    //leetcode problem: 3000 Maximum Area Of Longest Diagonal Rectangle

    public static void main(String[] args) {
        int[][] dimensions = {{9,3},{8,6}};
        System.out.println(areaOfMaxDiagonal(dimensions));
    }
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        if(dimensions.length==1){
            return dimensions[0][0]*dimensions[0][1];
        }
        int maxIndex=0;
        double maxLength=0;
        for(int i=0; i<dimensions.length; i++){
            double max = Math.sqrt(Math.pow(dimensions[i][0],2) + Math.pow(dimensions[i][1],2));
            if(maxLength<max){
                maxLength=max;
                maxIndex=i;
            }
            if(maxLength==max && dimensions[i][0]*dimensions[i][1]>dimensions[maxIndex][0]*dimensions[maxIndex][1]){
                maxIndex=i;
            }
        }
        System.out.println(maxIndex);
        return dimensions[maxIndex][0]*dimensions[maxIndex][1];
    }
}
