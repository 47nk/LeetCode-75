
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int min = Math.min(word1.length(), word2.length());
        for(int i = 0; i<=min; i++)
        {
            if(i == min)
            {
                if(word1.length() == word2.length()) break;

                if(word1.length() == min)
                    sb.append(word2.substring(min, word2.length()));
                else sb.append(word1.substring(min, word1.length()));
                
                break;
            }
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}
