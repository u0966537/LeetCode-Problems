package prime;

import java.util.LinkedList;
import java.util.Queue;

public class TheMaze {
	  public boolean hasPath(int[][] maze, int[] start, int[] dest) {
		  if(maze == null || maze.length == 0 || maze[0] == null || maze[0].length == 0)
			  return false;
		  
		  int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
		  Queue<int[]> queue = new LinkedList<>();
		  boolean[][] visited = new boolean[][] {};
		  queue.add(start);
		  visited[start[0]][start[1]] = true;
		  
		  while(!queue.isEmpty()) {
			  int[] pos = queue.poll();
			  
			  if(pos[0] == dest[0] && pos[1] == dest[1])
				  return true;
			  
			  for(int i = 0; i < dirs.length; i++) {
				  int x = pos[0] + dirs[i][0];
				  int y = pos[1] + dirs[i][1];
				  
				  while(x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 0) {
					  x += dirs[i][0];
					  y += dirs[i][1];
				  }
				  
	              x -= dirs[i][0];
	              y -= dirs[i][1];
	              
	              if(!visited[x][y]) {
	                  visited[x][y] = true;
	            	  queue.add(new int[]{x,y});
	              }
			  }
		  }
		  
		  return false;
		  
	  }
}
