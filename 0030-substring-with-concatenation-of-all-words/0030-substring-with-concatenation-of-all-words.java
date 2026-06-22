class Solution {
  public static List<Integer> findSubstring(String s, String[] words) {
    List<Integer> res = new ArrayList<>();
    if (words.length == 0) return res;

    int wordLen = words[0].length();
    int wordCount = words.length;
    int totalLen = wordLen * wordCount;

    Map<String, Integer> freq = new HashMap<>();
    for (String w : words)
        freq.put(w, freq.getOrDefault(w, 0) + 1);

    for (int start = 0; start < wordLen; start++) {
        Map<String, Integer> window = new HashMap<>();
        int left = start, count = 0;

        for (int right = start; right + wordLen <= s.length(); right += wordLen) {
            String word = s.substring(right, right + wordLen);

            if (!freq.containsKey(word)) {
                window.clear();
                count = 0;
                left = right + wordLen;
                continue;
            }

            window.put(word, window.getOrDefault(word, 0) + 1);
            count++;

            while (window.get(word) > freq.get(word)) {
                String leftWord = s.substring(left, left + wordLen);
                window.put(leftWord, window.get(leftWord) - 1);
                left += wordLen;
                count--;
            }

            if (count == wordCount) {
                res.add(left);
            }
        }
    }
    return res;
}

}