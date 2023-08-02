class Solution(object):
    def mergeAlternately(self, word1, word2):
        min_ = min(len(word1), len(word2))
        ans = ""
        for i in range(min_):
            ans += word1[i]
            ans += word2[i]

        if len(word1) > len(word2):
            ans += word1[min_:len(word1)]
        elif len(word2) > len(word1):
                ans += word2[min_:len(word2)]

        return ans

        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
