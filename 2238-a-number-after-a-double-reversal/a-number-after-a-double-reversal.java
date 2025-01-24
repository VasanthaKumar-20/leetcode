class Solution {
    public boolean isSameAfterReversals(int num) {
        int d = num%10;
        if(num<10)
        {
            return true; 
        }
        if(d==0)
        {
            return false;
        }
        return true;
    }
}