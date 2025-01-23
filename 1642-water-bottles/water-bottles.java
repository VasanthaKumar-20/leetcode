class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles>=numExchange)
        {
            int e = numBottles%numExchange;
            int z = (numBottles-e)/numExchange;
            e=e+z;
            ans=ans+z;
            numBottles=e;
        }
        return ans;
    }
}