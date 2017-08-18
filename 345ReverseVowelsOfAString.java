class Solution {
    public String reverseVowels(String s) {
        int[] pos = new int[s.length()];
        int count = 0;
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        
        for(int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                pos[count] = i;
                count++;
            }
        }
        
        char[] rst = new char[s.length()];
        rst = s.toCharArray();
        for (int i = 0; i < count; i++) {
            rst[pos[i]] = s.charAt(pos[count - i - 1]);
        }
        return String.valueOf(rst);
    }
}