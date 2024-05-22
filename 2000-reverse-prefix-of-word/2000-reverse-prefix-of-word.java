class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();
        for(int i = 0 ; i <n;i++){
            char ch1 = word.charAt(i);
            if(ch1==ch) {
             String a = reversee(word.substring(0,i+1));
             return  a+ word.substring(i+1,n);
            }
        }
        return word;
    }
public String reversee(String word1){
    String a ="";
    for(int i = word1.length()-1; i>=0;i--){
        char ch = word1.charAt(i);
         a = a+ch;
    }
    return a;
  }
}