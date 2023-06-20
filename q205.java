class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> letterMap = new HashMap<Character, Character>();

        if (s.length() == 1 && (s.charAt(0) == t.charAt(0))) {
            return true;
        }

        int i;
        for (i = 0; i < s.length(); i++) {
            if ((letterMap.containsKey(s.charAt(i)) && letterMap.get(s.charAt(i)) != t.charAt(i))) {
                return false;
            }

            if (!letterMap.containsKey(s.charAt(i)) && letterMap.containsValue(t.charAt(i))) {
                return false;
            } else {
                letterMap.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}
