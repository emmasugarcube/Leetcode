class ReverseInteger {
    public int reverse(int x) {
        int reversedNum = 0;
        
        while(x != 0) {
            int t = reversedNum * 10 + x % 10;
            x = x / 10;
            if (t / 10 != reversedNum) {
                reversedNum = 0;
                break;
            }
            reversedNum = t;
        }
        
        return reversedNum;
    }
}