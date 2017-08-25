class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
	    m.put('V', 5);
	    m.put('X', 10);
	    m.put('L', 50);
	    m.put('C', 100);
	    m.put('D', 500);
	    m.put('M', 1000);
        
        int sum = m.get(s.charAt(s.length() - 1));
        for(int i = s.length() - 2; i >= 0; i--) {
            if(m.get(s.charAt(i)) >= m.get(s.charAt(i + 1))) {
                sum = sum + m.get(s.charAt(i));
            } else {
                sum = sum - m.get(s.charAt(i));
            }
        }
        
    return sum;
    }
}