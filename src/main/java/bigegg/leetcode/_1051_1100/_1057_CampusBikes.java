//-----------------------------------------------------------------------------
// Runtime: 49ms
// Memory Usage: 
// Link: 
//-----------------------------------------------------------------------------

package bigegg.leetcode._1051_1100;

import java.util.*;

public class _1057_CampusBikes {
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        List<int[]>[] distances = new ArrayList[2001];
        for (int i = 0; i < workers.length; i++) {
            for (int j = 0; j <bikes.length; j++) {
                int dist = Math.abs(workers[i][0] - bikes[j][0]) + Math.abs(workers[i][1] - bikes[j][1]);
                if(distances[dist] == null){
                    distances[dist] = new ArrayList<>();
                }
                distances[dist].add(new int[]{i, j});
            }
        }

        int[] result = new int[workers.length];
        Arrays.fill(result, -1);
        boolean[] usedBike = new boolean[bikes.length];
        int count = 0;
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == null) continue;
            for (int[] arr : distances[i]) {
                if (usedBike[arr[1]] || result[arr[0]] != -1) continue;

                result[arr[0]] = arr[1];
                usedBike[arr[1]] = true;
                count++;
                if (count == workers.length) return result;
            }
        }
        return result;
    }
}
