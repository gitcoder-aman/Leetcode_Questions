class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer>st = new Stack<>();

        for(String token : tokens){

        
            if (!token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")) {

                st.push(Integer.parseInt(token));

            } else {

                int b = st.pop();
                int a = st.pop();

                int value = 0;

                if (token.equals("+")) {
                    value = a + b;
                } else if (token.equals("-")) {
                    value = a - b;
                } else if (token.equals("*")) {
                    value = a * b;
                } else {
                    value = a / b;
                }

                st.push(value);
            }
        }
        return st.pop();
    }
}