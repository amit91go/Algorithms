package ay.algos;

public class QuickUnion implements DynamicConnectivityInterface{

	private int n;
	private int storage[];
	
	public QuickUnion(int n)
	{
		this.n = n;
		storage = new int[this.n];
		for(int i=0;i<n;i++)
		{
			storage[i] = i;
		}
	}
	
	private int getRoot(int x)
	{
		int counter = x;
		while(storage[counter] != counter)
		{
			counter = storage[counter];
		}
		return counter;
	}
	
	public void union(int x, int y)
	{
		int first = getRoot(x);
		int second = getRoot(y);
		
		storage[first] = second;
	}
	
	
	public Boolean find(int x, int y)
	{
		int rootX = getRoot(x);
		int rootY = getRoot(y);
		if(rootX == rootY)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
