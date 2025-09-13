package AssessmentTest;

public class earliestTime {
    public static void main(String[] args) {
        int[][] tasks = {{1,6},{2,3}};
        System.out.println(earliestTime(tasks));
    }
    public static int earliestTime(int[][] tasks) {
        int earliest =tasks[0][0]+tasks[0][1];
        for(int i=1; i<tasks.length; i++){
            int sum = tasks[i][0]+tasks[i][1];
            if(earliest>sum){
                earliest = sum;
            }
        }
        return earliest;
    }
}
