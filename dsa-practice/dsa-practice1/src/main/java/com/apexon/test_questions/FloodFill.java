package com.apexon.test_questions;

import java.util.LinkedList;
import java.util.Queue;

public class    FloodFill {
    private static int[][] dfs(int row, int col,int[][] ans, int[][] image, int newColor, int[]delRow, int[] delCol,int iniColor){

        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;

        for(int i=0;i<4;i++){
            int nRow = row + delRow[i];
            int nCol = col + delCol[i];

            if(nRow >= 0 && nCol >= 0 && nRow < n && nCol < m &&
                    image[nRow][nCol] == iniColor && ans[nRow][nCol] != newColor
            ){
                dfs(nRow,nCol,ans,image,newColor,delRow,delCol,iniColor);
            }
        }
        return ans;

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int iniColor = image[sr][sc];

        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,-1,0,1};
        return dfs(sr,sc,ans,image,color,delRow,delCol,iniColor);

    }
}
