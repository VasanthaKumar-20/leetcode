class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return func(firstWord) + func(secondWord) == func(targetWord);
    }
    public static int func(String word)
    {
        int num=0;
        for(char ch : word.toCharArray())
        {
            num = num*10+(ch-'a');
        }
        return num;
    } 
}