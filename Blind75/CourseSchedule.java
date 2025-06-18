package Blind75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CourseSchedule {

    public boolean dfs(HashMap<Integer, List<Integer>> preMap, Set<Integer> visited){
        
    } 

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> preMap = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for (int[] prerequisite : prerequisites) {
            preMap.computeIfAbsent(prerequisite[0], k -> new java.util.ArrayList<>()).add(prerequisite[1]);
        }
        return dfs();
    }
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = { {1, 0} };
        System.out.println(canFinish(numCourses, prerequisites));
    }
}
