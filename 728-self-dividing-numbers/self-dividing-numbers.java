class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int num = i;
            int org=num;
            boolean istrue = true;
            while(num>0)
            {
                int d = num%10;
                if(d==0 || org%d!=0)
                {
                    istrue = false;
                    break;
                } 
                num/=10;
            }
            if(istrue)
            {
                list.add(i);
            }
        }
        return list;
    }
}