package lc12242020;

public class DIStringMatch{
	
	public int[] diStringMatch(String S) {
        if(S == null || S.length() == 0){
        	return new int[]{};
        }
        
        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I')
                ans[i] = lo++;
            else
                ans[i] = hi--;
        }

		// if last index is D, then use low
		// if last index id I, then use low.
        ans[N] = lo;
        return ans;
    }
}