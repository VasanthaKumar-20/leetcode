public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int n = longUrl.length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            char ch = longUrl.charAt(i);
            int d = ch+1;
            char ch1 =(char) d;
            ans+=ch1; 
        }
        System.out.println(ans);
        return ans;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int n = shortUrl.length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            char ch = shortUrl.charAt(i);
            int d = ch-1;
            char ch1 =(char) d;
            ans+=ch1; 
        }
        System.out.println(ans);
        return ans;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));