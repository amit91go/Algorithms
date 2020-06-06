package ay.algos;

public class QuickFind implements DynamicConnectivityInterface {
	
	private int n;
	private int storage[];
	
	public QuickFind(int n)
	{
		this.n = n;
		storage = new int[this.n];
		for(int i=0;i<n;i++)
		{
			storage[i] = i;
		}
	}
	
	public void union(int x, int y)
	{
		int first = this.storage[x];
		int second = this.storage[y];
		for(int i=0;i<n;i++)
		{
			if(storage[i] == first)
			{
				storage[i] = second;
			}
		}
	}
	
	public Boolean find(int x, int y)
	{
		if(storage[x] == storage[y])
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
