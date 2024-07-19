import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class Pair<T, U> {
    T node;
    U num;

    Pair(T node, U num) {
        this.node = node;
        this.num = num;
    }
}

public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> preorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        Stack<Pair<TreeNode, Integer>> st = new Stack<>();

        if (root == null) {
            return result;
        }

        st.push(new Pair<>(root, 1));

        while (!st.empty()) {
            Pair<TreeNode, Integer> it = st.pop();

            // preorder
            if (it.num == 1) {
                preorder.add(it.node.data);
                it.num = 2;
                st.push(it);
                if (it.node.left != null) {
                    st.push(new Pair<>(it.node.left, 1));
                }
            }
            // inorder
            else if (it.num == 2) {
                inorder.add(it.node.data);
                it.num = 3;
                st.push(it);
                if (it.node.right != null) {
                    st.push(new Pair<>(it.node.right, 1));
                }
            }
            // postorder
            else {
                postorder.add(it.node.data);
            }
        }

        // Returning the traversals
        result.add(inorder);
        result.add(preorder);
        result.add(postorder);
        return result;
    }
}

Sample Input 1 :
1 2 3 -1 -1 -1  6 -1 -1
Sample Output 1 :
2 1 3 6 
1 2 3 6 
2 6 3 1
