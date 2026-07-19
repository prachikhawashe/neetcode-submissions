class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top = st.pop();
                int newtop = top + st.peek();
                st.push(top);
                st.push(newtop);
                res += newtop;
            }
            else if(operations[i].equals("D")){
                st.push(st.peek() * 2);
                res += st.peek();
            }
            else if(operations[i].equals("C")){
                res -= st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
                res += st.peek();
            }
        }
        return res;
    }
}