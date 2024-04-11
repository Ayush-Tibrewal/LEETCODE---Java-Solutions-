class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k==n) return "0";
       Stack<Character> st = new Stack<>();
       for(int i=0;i<num.length();i++){
        char ch = num.charAt(i);
        while(!st.isEmpty() && k>0 && st.peek()>ch){
            st.pop();
            k--;
        }
        st.add(ch);
       }
       while(k>0){
        st.pop();
        k--;
        // 3 4 5 6 and so correct is 34 by removing 56 
       }

       StringBuilder ayush = new StringBuilder();
       while(!st.isEmpty()){
       ayush.append(st.pop());
       }
       ayush.reverse();
       while(ayush.length()>1 && ayush.charAt(0)=='0'){
        ayush.deleteCharAt(0);
       }
       return ayush.toString();
    }
}

       
     