public static int floor(Node root, int x) {
        int ans=-1;
        while(root!=null){
            if(root.data<=x)
            {
                ans=root.data;
                root=root.right;
            }
            else   root=root.left;
        }
        return ans;
    }

Input:
n = 7               2
                     \
                      81
                    /     \
                 42       87
                   \       \
                    66      90
                   /
                 45
x = 87
Output:
87
Explanation:
87 is present in tree so floor will be 87.

Input:
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 11
Output:
9
