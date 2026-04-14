
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (n < m) return result;

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        // Step 1: build p frequency
        for (int i = 0; i < m; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        int match = 0;

        // Step 2: first window
        for (int i = 0; i < m; i++) {
            sFreq[s.charAt(i) - 'a']++;
        }

        // Step 3: count initial matches
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] == sFreq[i]) {
                match++;
            }
        }

        // Step 4: sliding window
        for (int i = m; i < n; i++) {

            if (match == 26) {
                result.add(i - m);
            }

            int newChar = s.charAt(i) - 'a';
            int oldChar = s.charAt(i - m) - 'a';

            // add new char
            sFreq[newChar]++;
            if (sFreq[newChar] == pFreq[newChar]) {
                match++;
            } else if (sFreq[newChar] == pFreq[newChar] + 1) {
                match--;
            }

            // remove old char
            sFreq[oldChar]--;
            if (sFreq[oldChar] == pFreq[oldChar]) {
                match++;
            } else if (sFreq[oldChar] == pFreq[oldChar] - 1) {
                match--;
            }
        }

        // check last window
        if (match == 26) {
            result.add(n - m);
        }

        return result;
    }
}