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
class Solution0102 {
//    fun levelOrder(root: TreeNode?): List<List<Int>> {
//
//        val ans = mutableListOf<MutableList<Int>>()
//        if (root == null){
//            return ans
//        }
//
//        var pr = mutableListOf<TreeNode>()
//
//        pr.add(root)
//
//        while (pr.size != 0){
//
//            var ls = mutableListOf<TreeNode>()
//            var dig = mutableListOf<Int>()
//
//            for (i in 0 until pr.size){
//                if (pr[i]?.left != null){
//                    ls.add(pr[i].left)
//                }
//                if (pr[i]?.right != null){
//                    ls.add(pr[i].right)
//                }
//                if (pr[i]!= null) dig.add(pr[i]!!.`val`)
//            }
//
//            ans.add(dig)
//            pr = ls
//        }
//        return ans
//    }
}