package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class maze {
    public static void main(String[] args) {
        System.out.println(count(2,2));
        path("",2,2);
        System.out.println(pathRet("",2,2));
        System.out.println(pathRetDiagonal("",2,2));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        boolean[][] board2 = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        pathRestriction("",board,0,0);
        addAllPath("",board2,0,0);
        int[][] path = new int[board2.length][board2[0].length];
        addAllPathPrint("",board2,0,0,path,1);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return left+right;
    }

    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+"D",r-1,c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRet(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+"R",r,c-1));
        }
        return list;
    }
    static ArrayList<String> pathRetDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathRet(p+"D",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathRet(p+"V",r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+"H",r,c-1));
        }
        return list;
    }

    static void pathRestriction(String p,boolean[][] maze, int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathRestriction(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestriction(p+"R",maze,r,c+1);
        }
    }

    static void addAllPath(String p,boolean[][] maze, int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // I am considering this black in my path
        maze[r][c]=false;
        if(r<maze.length-1){
            addAllPath(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            addAllPath(p+"R",maze,r,c+1);
        }
        if(r>0){
            addAllPath(p+"U",maze,r-1,c);
        }
        if(c>0){
            addAllPath(p+"L",maze,r,c-1);
        }
        //this line is where the function will be over
        //so before the function gets  removed, also remove the changes that were made by that function
        maze[r][c]=true;
    }

    static void addAllPathPrint(String p,boolean[][] maze, int r, int c, int[][] path, int step){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            for(int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // I am considering this black in my path
        maze[r][c]=false;
        path[r][c] =step;
        if(r<maze.length-1){
            addAllPathPrint(p+"D",maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            addAllPathPrint(p+"R",maze,r,c+1,path,step+1);
        }
        if(r>0){
            addAllPathPrint(p+"U",maze,r-1,c,path,step+1);
        }
        if(c>0){
            addAllPathPrint(p+"L",maze,r,c-1,path,step+1);
        }
        //this line is where the function will be over
        //so before the function gets  removed, also remove the changes that were made by that function
        maze[r][c]=true;
        path[r][c]=0;
    }

}
