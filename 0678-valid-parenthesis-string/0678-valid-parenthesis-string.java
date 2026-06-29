class Solution {
    public boolean checkValidString(String s) {
     /*   int cmin = 0, cmax = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                cmax++;
                cmin++;
            }else if(c == ')'){
                cmax--;
                cmin--;
            }else if(c == '*'){
                cmax++;
                cmin--;
            }
            if(cmax < 0) return false;

            cmin = Math.max(cmin,0);
        }
        return cmin == 0;*/

        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open.push(i);
            } 
            else if (ch == '*') {
                star.push(i);
            } 
            else { // ch == ')'

                // First try to match with '('
                if (!open.isEmpty()) {
                    open.pop();
                }
                // Otherwise use '*'
                else if (!star.isEmpty()) {
                    star.pop();
                }
                // Neither '(' nor '*' available
                else {
                    return false;
                }
            }
        }

        // Match remaining '(' with '*' that come after them
        while (!open.isEmpty() && !star.isEmpty()) {

            if (open.peek() < star.peek()) {
                open.pop();
                star.pop();
            } else {
                // '*' is before '(', so it can't act as ')'
                return false;
            }
        }

        return open.isEmpty();
    }
}