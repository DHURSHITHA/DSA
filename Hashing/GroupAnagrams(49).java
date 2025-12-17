class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Map to store grouped anagrams
        // Key   -> sorted string
        // Value -> list of original strings
        Map<String, List<String>> map = new HashMap<>();

        // Traverse each word in the array
        for (String s : strs) {

            // Convert string to char array
            char[] chars = s.toCharArray();

            // Sort the characters
            Arrays.sort(chars);

            // Convert back to string (this is the key)
            String key = new String(chars);

            // If key not present, create new list
            map.putIfAbsent(key, new ArrayList<>());

            // Add original string to its group
            map.get(key).add(s);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}
