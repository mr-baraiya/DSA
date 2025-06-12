/*Prob. 1 Perform a Depth First Search (DFS) traversal starting from vertex 0, visiting vertices from left to 
right according to the adjacency list, and return a list containing the BFS traversal of the graph.  
Input: adj =  [[1, 2], [0, 2], [0, 1, 3, 4], [2], [2]] 
 
 
 
Output: [0 1 2 3 4] 
Explanation:  The source vertex s is 0. We visit it first, and then we visit an adjacent.  
Start at 0: Mark as visited. Output: 0 
Move to 1: Mark as visited. Output: 1  
Move to 2: Mark as visited. Output: 2  
Move to 3: Mark as visited. Output: 3 (backtrack to 2) 
Move to 4: Mark as visited. Output: 4 (backtrack to 2, then backtrack to 1, then to 0) */
import java.util.*;

public class DFSTraversal {
    
}
