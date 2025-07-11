class Solution {
    public int longestCycle(int[] edges) {
        int n = edges.length;
        int[] visitTime = new int[n]; // Time of first visit for each node
        Arrays.fill(visitTime, -1);
        int time = 1;
        int maxLen = -1;

        for (int i = 0; i < n; i++) {
            if (visitTime[i] != -1) continue;

            int curr = i;
            Map<Integer, Integer> seen = new HashMap<>();

            while (curr != -1 && visitTime[curr] == -1) {
                seen.put(curr, time);
                visitTime[curr] = time++;
                curr = edges[curr];
            }

            if (curr != -1 && seen.containsKey(curr)) {
                // A cycle is found
                maxLen = Math.max(maxLen, time - seen.get(curr));
            }
        }

        return maxLen;
    }
}
