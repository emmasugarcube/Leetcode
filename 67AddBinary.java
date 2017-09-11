class Solution {
    public String addBinary(String a, String b) {
        String ans = "";
        
        int carries = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = carries;
            sum += (i >= 0) ? a.charAt(i) - '0' : 0;
            sum += (j >= 0) ? b.charAt(j) - '0' : 0;
            ans = (sum % 2) + ans;
            carries = sum / 2;
            
        }
        if (carries != 0) {
            ans = carries + ans;
        }
        return ans;
    }
}