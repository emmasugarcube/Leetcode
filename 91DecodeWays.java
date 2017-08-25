class 91DecodeWays {
	public int numDecodings(String s) {
		int l = s.length();
		if(l == 0) {
			return 0;
		}

		char[] sc = s.toCharArray();
		int[] f = new int[l + 1];
		f[0] = 1;

		for (int i = 1; i <= l; i++) {
			if (sc[i - 1] != '0') {
				f[i] += f[i - 1];
			}

			if (i >= 2) {
				int val2 = (sc[i - 2] - '0') * 10 + sc[i - 1] - '0';
				if (val2 >= 10 && val2 <= 26) {
					f[i] += f[i - 2];
				}
			}
		}
	return f[l];
	}
}