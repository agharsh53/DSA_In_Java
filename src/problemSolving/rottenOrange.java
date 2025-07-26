package problemSolving;

public class rottenOrange {
    private boolean isSafe(int i, int j, int n, int m){
        return 0<=i && i<n && 0<=j && j<m;
    }
    public int rottingOrange(int[][] mat){
        int n = mat.length;
        int m = mat[0].length;
        int elapsedTime = 0;
        boolean change;
        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
        while (true){
            change = false;
            for (int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(mat[i][j]==elapsedTime+2){
                        for(int[] dir : directions){
                            int x = i+dir[0];
                            int y = j+dir[1];
                            if(isSafe(x,y,n,m) && mat[x][y]==1){
                                mat[x][y] = mat[i][j]+1;
                                change = true;
                            }
                        }
                    }
                }
            }
            if(!change){
                break;
            }
            elapsedTime++;
        }
        return  elapsedTime;
    }
    public static void main(String[] args) {
        int[][] mat = {{2, 1, 0, 2, 1}, {1, 0, 1, 2, 1}, {1, 0, 0, 2, 1}};
        rottenOrange r1 = new rottenOrange();
        System.out.println(r1.rottingOrange(mat));
    }
}
