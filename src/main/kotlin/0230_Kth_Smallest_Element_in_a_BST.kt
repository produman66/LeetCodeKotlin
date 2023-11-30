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
class Solution0230 {
//
//    fun kthSmallest(root: TreeNode?, k: Int): Int {
//        var n = 0
//        var stack = mutableListOf<TreeNode>()
//        var cur = root
//
//        while (true){
//            while (cur!=null){
//                stack.add(cur)
//                cur = cur.left
//            }
//            cur = stack.removeAt(stack.size-1)
//            n += 1
//            if (n == k){
//                return cur.`val`!!
//            }
//            cur = cur.right
//        }
//    }
}