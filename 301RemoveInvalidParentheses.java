public class Solution {
        public List<String> removeInvalidParentheses(String s) {
        List<String> rst = new ArrayList<String>();
        if (s == null) {
            return rst;
        }
        Set<String> visited = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(s);
        visited.add(s);
        boolean found = false;
        while(!queue.isEmpty()) {
            s = queue.poll();
            if (isValid(s)) {
                rst.add(s);
                found = true;
            }
            if (found) {
                continue;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '(' && s.charAt(i) != ')') {
                    continue;
                }
                String t = s.substring(0, i) + s.substring(i+1);
                if (!visited.contains(t)) {
                    queue.add(t);
                    visited.add(t);
                }
            }
        
        }
        return rst;
        
    }
    
    public boolean isValid(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            }
            if (c == ')' && count-- == 0) {
                return false;
            }
            
        }
        return count == 0;
    }
}