import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
            
        int halfLength = costs.length / 2;
        int last = costs.length - 1;
        int totalMininumCost = 0;
        
        Arrays.sort(costs, (a, b) -> {
            return (a[1] - a[0]) - (b[1] - b[0]);
        });
        
        for(int i = 0; i < halfLength; i++){
            totalMininumCost += costs[i][1] + costs[last - i][0];
        }
        
        return totalMininumCost;
    }
}
