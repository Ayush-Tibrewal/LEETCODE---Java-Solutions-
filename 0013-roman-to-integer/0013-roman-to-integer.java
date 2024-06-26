class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer > mp = new HashMap<>();
        int ans = 0 ; 
        mp.put('I',1);
        mp.put('V',5);
         mp.put('X',10);
         mp.put('L',50);
         mp.put('C',100);
         mp.put('D',500);
         mp.put('M',1000);
         for(int i = 0 ; i<s.length();i++){
         char ch = s.charAt(i);
         if(i<s.length()-1 && mp.get(ch)<mp.get(s.charAt(i+1))){
            ans = ans - mp.get(ch);
        }else{
            ans = ans + mp.get(ch);
        }
    }
    return ans ;
    }
}
        