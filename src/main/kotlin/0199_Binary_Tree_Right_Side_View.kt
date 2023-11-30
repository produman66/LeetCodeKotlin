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
class Solution0199{
//    fun rightSideView(root: TreeNode?): List<Int> {
//
//
//        var ans = mutableListOf<Int>()
//        var pr = mutableListOf<TreeNode>()
//        if (root == null) {
//            return ans
//        }
//
//        pr.add(root)
//
//        while (pr.size != 0){
//
//            var ls = mutableListOf<TreeNode>()
//
//            for (i in 0 until pr.size){
//                if (pr[i]?.left!= null && pr[i]?.left?.`val`!= null){
//                    ls.add(pr[i]?.left!!)
//                }
//                if (pr[i].right!= null && pr[i]?.right?.`val`!= null){
//                    ls.add(pr[i]?.right!!)
//                }
//            }
//            ans.add(pr[pr.size-1].`val`!!)
//
//            pr = ls
//        }
//
//        return ans
//
//    }
}