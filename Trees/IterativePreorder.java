
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> a1=new ArrayList();
    public List<Integer> preorderTraversal(TreeNode root) {


            // iterative version using stack
            List<Integer> arr = new ArrayList<Integer>();
            if (root == null)
                return arr;

            Stack<TreeNode> stack = new Stack<TreeNode>();


            stack.push(root);
            while (stack.empty() == false) {
                TreeNode node = stack.pop();
                arr.add(node.val);
                if (node.right != null)
                    stack.push(node.right);
                if (node.left != null)
                    stack.push(node.left);
            }

            return arr;

        }
    // public List<Integer> preorderTraversal(TreeNode root) {

    //   if(root==null)
    //     return a1;
    //   TreeNode cur;

    //   cur=root;

    //   Stack<TreeNode> st=new Stack<TreeNode>();

    //   while(cur!=null || !st.empty())
    //   {
    //       if(cur!=null)
    //       a1.add(cur.val);

    //       if(cur!=null)
    //       {
    //           st.push(cur);
    //           cur=cur.left;
    //             continue;
    //       }

    //       if(st.empty())
    //         break;

    //       cur=st.pop();

    //       if(cur!=null)
    //       {
    //           cur=cur.right;
    //       }



    //   }



    //     return a1;
    // }
}
