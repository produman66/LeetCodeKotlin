class Trie {
    private val root: TrieNode = TrieNode()
    class TrieNode{
        val children: MutableMap<Char, TrieNode> = mutableMapOf()
        var isEndOfWord = false
    }

    fun insert(word: String) {
        var currentNode = root
        for (char in word) {
            val node = currentNode.children.getOrPut(char) { TrieNode() }
            currentNode = node
        }
        currentNode.isEndOfWord = true
    }

    fun search(word: String): Boolean {
        var currentNode = root
        for (char in word) {
            val node = currentNode.children[char] ?: return false
            currentNode = node
        }
        return currentNode.isEndOfWord
    }

    fun startsWith(prefix: String): Boolean {
        var currentNode = root
        for (char in prefix) {
            val node = currentNode.children[char] ?: return false
            currentNode = node
        }
        return true
    }

}
/**
 * Your Trie object will be instantiated and called as such:
 * var obj = Trie()
 * obj.insert(word)
 * var param_2 = obj.search(word)
 * var param_3 = obj.startsWith(prefix)
 */