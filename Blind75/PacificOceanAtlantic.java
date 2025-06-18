package Blind75;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PacificOceanAtlantic {
    
     public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        Set<String> setPac = new HashSet<>();
        Set<String> setAtl = new HashSet<>();

        for (int c = 0; c < cols; c++) {
            dfs(0, c, setPac, heights[0][c]);
            dfs(rows - 1, c, setAtl, heights[rows - 1][c]);
        }

        for (int r = 0; r < rows; r++) {
            dfs(r, 0, setPac, heights[r][0]);
            dfs(r, cols - 1, setAtl, heights[r][cols - 1]);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int r = 0; r < heights.length; r++) {
            for (int c = 0; c < heights.length; c++) {
                if () {
                    res.add(Arrays.asList(r,c));
                }
            }
        }
        return res;
    }

    public static void dfs(int r, int c, Set<String> visit, int heights){
        if (visit.contains(r+","+c) && ) {
            
        }
    }


    public static void main(String[] args) {
       int[][] heights = new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
       System.out.println(pacificAtlantic(heights));
    }
}
