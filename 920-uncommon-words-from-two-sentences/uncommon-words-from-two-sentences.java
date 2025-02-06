class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str = s1+" "+s2;
        String[] arr =str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j && arr[i].equals(arr[j]))
                {
                    break;
                }
                if(j==arr.length-1)
                {
                    list.add(arr[i]);
                }
            }
        }
        String[] arr1= list.toArray(new String[list.size()]); 
        return arr1;
    }
}