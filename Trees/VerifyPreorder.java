
// somdeep 
// Notes Auto Saved.
// |||

// Type here...(Markdown is enabled)
// ​
// 331. Verify Preorder Serialization of a Binary Tree   QuestionEditorial Solution  My Submissions
// Total Accepted: 24060
// Total Submissions: 70206
// Difficulty: Medium
// Contributors: Admin
// One way to serialize a binary tree is to use pre-order traversal. When we encounter a non-null node, we record the node's value. If it is a null node, we record using a sentinel value such as #.

//      _9_
//     /   \
//    3     2
//   / \   / \
//  4   1  #  6
// / \ / \   / \
// # # # #   # #
// For example, the above binary tree can be serialized to the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.

// Given a string of comma separated values, verify whether it is a correct preorder traversal serialization of a binary tree. Find an algorithm without reconstructing the tree.

// Each comma separated value in the string must be either an integer or a character '#' representing null pointer.

// You may assume that the input format is always valid, for example it could never contain two consecutive commas such as "1,,3".

// Example 1:
// "9,3,4,#,#,1,#,#,2,#,6,#,#"
// Return true

// Example 2:
// "1,#"
// Return false

// Example 3:
// "9,#,#,1"
// Return false


public class Solution {
   private int stack;
    
public boolean isValidSerialization(String preorder) {
    String[] nodes = preorder.split(",");
    int i = findLeft(nodes, 0);        
    while (stack > 0) {
        stack--;
        i = findLeft(nodes, ++i);
    }        
    return i == nodes.length - 1;
}
    
private int findLeft(String[] nodes, int i) {
    while (i < nodes.length && !nodes[i].equals("#")) {
        stack++;
        i++;
    }        
    return i;
}
}