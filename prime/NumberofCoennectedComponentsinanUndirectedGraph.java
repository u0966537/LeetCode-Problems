package prime;


public class NumberofCoennectedComponentsinanUndirectedGraph {
	public static void main(String[]args) {
		int[][] edges = new int[][] {{0, 1}, {1, 2}, {3, 4}};
		System.out.println(countComponents(5, edges));
	}

	public static int countComponents(int n, int[][] edges) {
		if(edges == null || edges.length == 0)
			return 0;
		
		int res = n;
		int[] nodes = new int[n];
		for(int i = 0; i < n; i++)
			nodes[i] = i;
		
		for(int[] edge : edges) {
			res -= union(edge[0], edge[1], nodes);
		}
		
		return res;
		
	}
	
	private static int union(int left, int right, int[]nodes) {
		int first  = find(nodes, left);
		int second = find(nodes, right);
		nodes[first] = second;
		return first == second ? 0 : 1;
	}
	
	private static int find(int[] nodes, int i) { 
		if(nodes[i] == i) 
			return i;
		return nodes[i] = find(nodes, nodes[i]);
	}
}
