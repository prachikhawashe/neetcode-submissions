class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top = st.pop();
                int newtop = top + st.peek();
                st.push(top);
                st.push(newtop);
            }
            else if(operations[i].equals("D")){
                st.push(st.peek() * 2);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int c=0;
        for(int s : st){
            c += s;
        }
        return c;
    }
}