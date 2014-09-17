
public class PercolationStats {
	
	public PercolationStats(int N, int T){
		for (int i = 0; i < T; i++) {
			Percolation perc = new Percolation(N);
			while(perc.percolates()){
				int x, y;
				
				do{
					x = StdRandom.uniform(N);
					y = StdRandom.uniform(N);
				}while(perc.isOpen(x, y));
				
				perc.open(x, y);
			}
		}
	}
	
	public double mean(){
		
	}
	
	public double stddev(){
		
	}
	
	public double confidenceLo(){
		
	}
	
	public double confidenceHi(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
