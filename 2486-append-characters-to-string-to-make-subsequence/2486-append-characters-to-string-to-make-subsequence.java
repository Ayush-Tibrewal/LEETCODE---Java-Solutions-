// hume ruka hai jaise hi match hona band ho jaye phir wo sequence ajayegi 
// jo match krwani hai 
class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)) return 0;
        int t1=0;
        int s1=0;
       while(s1<s.length()){
            char ch = s.charAt(s1);
            char ch2 = t.charAt(t1);
            if(ch==ch2) {
                s1++;
                t1++;
            }else{
                s1++;
            }
        }
            return t.length() -t1;
    }
}