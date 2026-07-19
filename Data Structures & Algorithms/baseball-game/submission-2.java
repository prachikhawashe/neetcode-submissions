class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int temp = st.pop();
                int newtemp = temp + st.peek();
                st.push(temp);
                st.push(newtemp);
                res += newtemp;
            }
            else if(operations[i].equals("D")){
                int temp = 2 * st.peek();
                st.push(temp);
                res += temp;
            }
            else if(operations[i].equals("C")){
                int temp = st.pop();
                res -= temp;
            }
            else{
                st.push(Integer.parseInt(operations[i]));
                res += st.peek();
            }
        }
        return res;
    }
}