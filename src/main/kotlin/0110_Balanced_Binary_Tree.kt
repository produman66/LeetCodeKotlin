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
class Solution0110 {
//    fun isBalanced(root: TreeNode?): Boolean {
//        if (root == null){
//            return true
//        }
//        var pr = mutableListOf<TreeNode>()
//        pr.add(root)
//
//        while (pr.size != 0){
//
//            val ls = mutableListOf<TreeNode>()
//
//            for (i in 0 until pr.size){
//                if (abs(dfs(pr[i].left) - dfs(pr[i].right)) > 1){
//                    return false
//                }
//                if (pr[i].left!= null){
//                    ls.add(pr[i].left!!)
//                }
//                if (pr[i].right!= null){
//                    ls.add(pr[i].right!!)
//                }
//            }
//            pr = ls
//        }
//
//        return true
//    }
//    fun dfs(root:TreeNode?):Int{
//        if (root == null){
//            return 0
//        }
//        var left = root.left
//        var right = root.right
//        return 1 + max(dfs(right), dfs(left))
//    }
}