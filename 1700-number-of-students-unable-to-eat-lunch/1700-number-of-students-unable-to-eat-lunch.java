class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count=0;
        Queue<Integer> st = new LinkedList<>();
        Queue<Integer> qt = new LinkedList<>();
        for(int i = 0;i<students.length;i++){
            st.offer(students[i]);
            qt.offer(sandwiches[i]);
        }
        int n = st.size();
        int unsatisfied=0;
        while(!st.isEmpty()&& unsatisfied<n){

        if(st.peek()==qt.peek()) {
        st.poll();
        qt.poll();
        unsatisfied=0;
        }
        else {
            st.offer(st.poll());
            unsatisfied ++;
        }
        }
        if(st.isEmpty()) return 0;
        else return st.size();
    }
}