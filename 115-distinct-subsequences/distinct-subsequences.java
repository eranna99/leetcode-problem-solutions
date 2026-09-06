class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();

        long[] er = new long[n + 1];
        er[0] = 1;

        for (int i = 1; i <= m; i++) {
            for (int j = Math.min(i, n); j >= 1; j--) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    er[j] += er[j - 1];
                }
            }
        }

        return (int)er[n];
        
    }
}