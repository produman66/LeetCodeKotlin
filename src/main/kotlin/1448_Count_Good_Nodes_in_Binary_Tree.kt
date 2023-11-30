/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution1448 {
//    fun goodNodes(root: TreeNode?): Int {
//        var deck = mutableListOf<TreeNode>()
//        var pr = mutableListOf<TreeNode>()
//        deck.add(root!!)
//        pr.add(root)
//        var ans = 0
//        while (deck.size != 0){
//
//            var level = mutableListOf<TreeNode>()
//            var count = deck.size
//            for (i in 0 until count){
//                var node = deck[0]
//                deck.removeAt(0)
//                if (pr[i].left != null && pr[i].left?.`val`!! >= node.`val`!!){
//                    deck.add(pr[i].left!!)
//                    level.add(pr[i].left!!)
//                    ans += 1
//                }
//                if (pr[i].right != null && pr[i].right?.`val`!! >= node.`val`!!){
//                    deck.add(pr[i].right!!)
//                    level.add(pr[i].right!!)
//                    ans += 1
//                }
//                if (pr[i].left != null && pr[i].left?.`val`!! < node.`val`!!){
//                    level.add(pr[i].left!!)
//                    deck.add(node)
//                }
//                if (pr[i].right != null && pr[i].right?.`val`!! < node.`val`!!){
//                    level.add(pr[i].right!!)
//                    deck.add(node)
//                }
//            }
//            pr = level
//        }
//        return ans+1
//    }
}