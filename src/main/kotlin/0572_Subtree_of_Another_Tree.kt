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
class Solution0572 {
//    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
//
//        var pr = mutableListOf<TreeNode?>()
//        pr.add(root)
//        while (pr.size != 0){
//
//            var ls = mutableListOf<TreeNode?>()
//
//            for (i in 0 until pr.size){
//                if(subRoot?.`val` == pr[i]?.`val`){
//                    if (copy(pr[i], subRoot)) return true
//                }
//                if (pr[i]?.left?.`val` == subRoot?.`val`){
//                    ls.add(pr[i]!!.left)
//                }
//                if (pr[i]?.right?.`val` == subRoot?.`val`){
//                    ls.add(pr[i]!!.right)
//                }
//            }
//
//            pr = ls
//        }
//        return false
//    }
//
//
//    fun copy(p: TreeNode?, q: TreeNode?): Boolean {
//        if (p == null && q == null){
//            return true
//        }
//        if (p == null || q == null || p.`val` != q.`val`){
//            return false
//        }
//
//        return (copy(p.left, q.left) && copy(p.right, q.right))
//    }


}