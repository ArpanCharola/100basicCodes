package DSA;
import java.util.*;
// 2965. Find Missing and Repeated Values
public class findMissingAndRepeatingVal{
    public int[] findMissAndRepVal (int[][] grid){
        Set<Integer> seen = new HashSet<>();
        int n = grid.length;
        int repeat = -1;
        int missing = -1;
        int maxNum = n * n;
        
        //finding repeated value
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int val = grid[i][j];
                if(seen.contains(val)){
                    repeat = val;
                }
                else{
                    seen.add(val);
                }
            }
        }

        //finding missing value
        for(int num = 1; num <= maxNum; num++){
            if(!seen.contains(num)){
                missing = num;
                break;
            }
        }

        return new int[]{repeat,missing};
    }
    public static void main(String args[]){
        findMissingAndRepeatingVal solver = new findMissingAndRepeatingVal();
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 7, 9}  // 8 is missing, 7 repeated
        };

        int[] result = solver.findMissAndRepVal(grid);
        System.out.println("Repeating: " + result[0] + ", Missing: " + result[1]);
    }
}