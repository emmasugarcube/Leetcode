public class p87 {
	public boolean isScramble(String s1, String s2) {
	       if(s1.length()!=s2.length()) return false;
	       if(s1.equals(s2)) return true;
	       return isScramble(s1,0,s1.length()-1,s2,0,s2.length()-1);
	}
	boolean isScramble(String s1,int start1,int end1,String s2,int start2,int end2)
	{
	    if((end1-start1)!=(end2-start2)) return false; 
		if(start1==end1)
		return s1.charAt(start1)==s2.charAt(start2);
		int[] counter=new int[256];
		for(int k=start1;k<=end1;k++)
		counter[s1.charAt(k)]++;
		for(int j=start2;j<=end2;j++)
		{
			counter[s2.charAt(j)]--;
			if(counter[s2.charAt(j)]<0)
			return false;
		}
		for(int i=start1;i<end1;i++)
		{
			if(isScramble(s1,start1,i,s2,start2,start2+i-start1)&&isScramble(s1,i+1,end1,s2,end2-(end1-i-1),end2))
			return true;
			if(isScramble(s1,start1,i,s2,end2-i+start1,end2)&&isScramble(s1,i+1,end1,s2,start2,start2+end1-i-1))
			return true;
		}
		return false;
	}
}