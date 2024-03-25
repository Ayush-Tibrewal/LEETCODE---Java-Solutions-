class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character , Character> ayush = new HashMap<>();
         HashSet<Character> set = new HashSet<>();
       
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            char ch2 = t.charAt(i);

            if(!ayush.containsKey(ch)){
                if(!set.add(ch2)){
                    return false;
                }
                ayush.put(ch,ch2);
                set.add(ch2);
            }
            if(ayush.containsKey(ch)){
                if(ayush.get(ch)!=ch2)return false;  
                }
                }
                return true;

                }
}
        