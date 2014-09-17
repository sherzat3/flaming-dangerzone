
public class Percolation {
	private int n;
	private int[][] table;
	private WeightedQuickUnionUF cells;
	
	public Percolation(int N){
		n = N;
		cells = new WeightedQuickUnionUF(n * n + 2);
		
		table = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				table[i][j] = 1;
			}
		}
	}
	
	
	public void open(int i, int j){
		int x = i * n + j;
		
		if(i > 0) cells.union(x, (i - 1) * n + j);
		if(i < n - 1) cells.union(x, (i + 1) * n + j);
		if(j > 0) cells.union(x, i * n + j - 1);
		if(j < n - 1) cells.union(x, i * n + j + 1);
		
		if(i == 0) cells.union(x, n * n);
		if(i == n - 1) cells.union(x, n * n + 1);
		
		table[i][j] = 0;
	}
	
	public boolean isOpen(int i, int j){
		return table[i][j] == 0;
	}
	
	public boolean isFull(int i, int j){
		return table[i][j] == 1;
	}
	
	public boolean percolates(){
		return cells.connected(n * n, n * n + 1);
	}
}
