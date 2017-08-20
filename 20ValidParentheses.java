class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.toCharArray()) {
            if("({[".contains(String.valueOf(c)) ){
                stack.push(c);
            } else if(!stack.isEmpty() && is_valid(stack.peek(), c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    private boolean is_valid(Character c1, Character c2) {
        return (c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']');
    }
}