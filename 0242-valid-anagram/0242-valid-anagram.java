class Solution {
    public boolean isAnagram(String s, String t) {
       Map<Character, Integer> mp1 = new  HashMap<>();
       Map<Character, Integer> mp2 = new  HashMap<>();
       if(s.length()==t.length()){
       mapping(mp1,s);
       mapping(mp2,t);
        
       }else{
        return false;
       }
       return mp1.equals(mp2);
      
    }
     public void mapping(Map<Character, Integer> mp, String s ){
       for(int i = 0 ; i<s.length();i++){
        char ch = s.charAt(i);
        if(!mp.containsKey(ch)){
            mp.put(ch,1);
        }else{
            mp.put(ch,mp.get(ch)+1);
        }
       }
}
}