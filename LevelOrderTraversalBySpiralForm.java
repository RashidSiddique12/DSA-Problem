
// @https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Tree/problem/level-order-traversal-in-spiral-form

// public class LevelOrderTraversalBySpiralForm {
    
// }





class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        int flag = 0;
        
        if(root==null){
            return list;
        }
            queue.add(root);
            while(!queue.isEmpty()){
                int size = queue.size();
                Stack<Integer> stack = new Stack<>();
                
              
              while(size>0){
                  Node curr_Node= queue.remove();
                  if(flag == 1){
                       list.add(curr_Node.data);
                  }
                  else{
                     
                      stack.add(curr_Node.data);
                  }
                  if(curr_Node.left != null) queue.add(curr_Node.left);
                  if(curr_Node.right != null) queue.add(curr_Node.right);
                   
                  size--;
                   
              }
              if(flag==0){
                  while(!stack.isEmpty()){
                      list.add(stack.pop());
                  }
              }
              flag = 1-flag;
               
            }
        
        return list;
    }
}

