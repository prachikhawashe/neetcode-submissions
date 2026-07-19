class Solution {
    public int minOperations(String[] logs) {
        int res = 0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                res = Math.max(res-1,0);
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else{
                res++;
            }
        }
        return res;
    }
}