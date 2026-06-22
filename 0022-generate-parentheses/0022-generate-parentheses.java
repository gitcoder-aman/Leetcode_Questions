class Solution {

    void dfs(int open,int close,List<String>result,String str){
        if(open == 0 && close == 0){
            result.add(str);
            return;
        }
        if(open != 0){
            dfs(open-1,close,result,str+"(");
        }
        if(open < close){
            dfs(open,close-1,result,str+")");
        }
        
    }
    public List<String> generateParenthesis(int n) {
        
        List<String>result = new ArrayList<>();
        String str = "";
        dfs(n,n,result,str);
        return result;
    }
}