
//   Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};


class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        if (root == nullptr) {
            return true;
        }
        return isSymmetric(root->left, root->right);
    }
    
    bool isSymmetric(TreeNode* leftSubtree, TreeNode* rightSubtree) {
        if (leftSubtree == nullptr && rightSubtree == nullptr) {
            return true;
        }
        if (leftSubtree == nullptr || rightSubtree == nullptr) {
            return false;
        }
        if (leftSubtree->val != rightSubtree->val) {
            return false;
        }

        return isSymmetric(leftSubtree->left, rightSubtree->right) &&
               isSymmetric(leftSubtree->right, rightSubtree->left);
    }
};
