package arrays;
/*
Tc : O(m+n)
SC : O(m+n)
*/
public class GDCString {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            int ans=gcd(str1.length(),str2.length());
            return str2.substring(0,ans);
        }
        return "";
    }

    public int gcd(int a, int b){
        while(a%b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b;
    }
}
