import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballColorMap = new HashMap<>();
        Map<Integer, Integer> colorCountMap = new HashMap<>();
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            // If the ball is already colored
            if (ballColorMap.containsKey(ball)) {
                int currentColor = ballColorMap.get(ball);
                // Decrement the count of the current color
                colorCountMap.put(currentColor, colorCountMap.get(currentColor) - 1);
                // If no balls are left with this color, remove it from the map
                if (colorCountMap.get(currentColor) == 0) {
                    colorCountMap.remove(currentColor);
                }
            }

            // Assign the new color to the ball
            ballColorMap.put(ball, color);
            // Increment the count of the new color
            colorCountMap.put(color, colorCountMap.getOrDefault(color, 0) + 1);

            // The number of distinct colors is the size of colorCountMap
            result[i] = colorCountMap.size();
        }

        return result;
    }
}
