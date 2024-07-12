// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans=new ArrayList<>();
        int[][] vis=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        if(m[0][0]==1){
            solve(0,0,m,n,ans,"",vis);
        }
        return ans;
    }
    private static void solve(int i,int j,int[][] m,int n,ArrayList<String> ans,String s,int[][] vis){
        if(i==(n-1) && j==(n-1)){
            ans.add(s);
            return;
        }
        // Downward
        if (i + 1 < n && vis[i + 1][j] == 0 && m[i + 1][j] == 1) 
        {
            vis[i][j] = 1;
            solve(i + 1, j, m, n, ans, s + 'D', vis);
            vis[i][j] = 0;
        }
        // Left
        if(j-1>=0 && vis[i][j-1]==0 && m[i][j-1]==1)
        {
            vis[i][j]=1;
            solve(i,j-1,m,n,ans,s+'L',vis);
            vis[i][j]=0;
        }
        // Right
        if(j+1<n && vis[i][j+1]==0 && m[i][j+1]==1){
            vis[i][j]=1;
            solve(i,j+1,m,n,ans,s+'R',vis);
            vis[i][j]=0;
        }
        // Upward
        if(i-1>=0 && vis[i-1][j]==0 && m[i-1][j]==1){
            vis[i][j]=1;
            solve(i-1,j,m,n,ans,s+'U',vis);
            vis[i][j]=0;
        }
    }
}

Input:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR
