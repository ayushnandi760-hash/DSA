class Solution {
    
        public static boolean vaild(int[][] maze,ArrayList<String> out,int n,
        boolean[][] var,int srow,int scol,int desr,int desc){
            
            if(srow<0||srow>n-1||scol<0||scol>n-1) return false;
            
            else if(maze[srow][scol]==0) return false;
            
            else if(var[srow][scol]==true) return false;
            
            else return true;
            
        }
    
        public static void solve(int[][] maze,ArrayList<String> out,String s, int n,
        boolean[][] var,int srow,int scol,int desr,int desc){
            
            if(srow==desr && scol==desc){
                out.add(s);
                return;
            }
            
            var[srow][scol]=true;
            //up
            if(vaild(maze,out,n,var,srow-1,scol,n-1,n-1)){
                solve(maze,out,s+"U",n,var,srow-1,scol,n-1,n-1);
            }
            //down
            if(vaild(maze,out,n,var,srow+1,scol,n-1,n-1)){
                solve(maze,out,s+"D",n,var,srow+1,scol,n-1,n-1);
            }
            //right
            if(vaild(maze,out,n,var,srow,scol+1,n-1,n-1)){
                solve(maze,out,s+"R",n,var,srow,scol+1,n-1,n-1);
            }
            
            //left            
            if(vaild(maze,out,n,var,srow,scol-1,n-1,n-1)){
                solve(maze,out,s+"L",n,var,srow,scol-1,n-1,n-1);
            }
            
            var[srow][scol]=false;
            
        }
    public ArrayList<String> ratInMaze(int[][] maze) {
        
        int n= maze.length;
        
        int srow=0;
        int scol=0;
        int desr=n-1;
        int desc=n-1;
        
        
        
        ArrayList<String> out = new ArrayList<>();
        String s="";
        boolean[][] var = new boolean[n][n];
        if(maze[srow][scol]==0 ) return out;
        
        solve(maze,out,s,n,var,srow,scol,desr,desc);
        Collections.sort(out);
        
        return out;
        
    }
    
}