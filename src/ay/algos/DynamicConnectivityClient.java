package ay.algos;

import java.util.Scanner;

public class DynamicConnectivityClient {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DynamicConnectivityInterface game;
		System.out.print("Enter the number of objects : ");
		int n = sc.nextInt();
		System.out.print("Enter 1 - QuickFind, 2 - QuickUnion");
		int gmOpt = sc.nextInt();
		while((gmOpt != 1) && (gmOpt != 2))
		{
			System.out.println("Please choose from 1,2 only: ");
			gmOpt = sc.nextInt();
		}
		if(gmOpt == 1)
		{
			game = new QuickFind(n);
		}
		else
		{
			game = new QuickUnion(n);
		}		
		while(true){
			System.out.print("Choose Option: 1- Union, 2- Find, 3- Exit :");
			int option = sc.nextInt();
			while((option != 1) && (option != 2) && (option != 3))
			{
				System.out.println("Please choose from 1,2,3 only: ");
				option = sc.nextInt();
			}
			if(option == 1){
				System.out.println("Enter two numbers for union :");
				int x = sc.nextInt();
				while(x >= n || x < 0)
				{	
					System.out.println("Number should be between 0 and "+(n-1) + " :");
					x = sc.nextInt();
				}
				int y = sc.nextInt();
				while(y >=n || y < 0)
				{
					System.out.println("Number should be between 0 and "+(n-1)+ " :");
					y = sc.nextInt();
				}
				game.union(x, y);
				System.out.println("Ok Done "+ x+" and "+ y+ " are connected now.");
			}
			if(option == 2){
				System.out.println("Enter two numbers for find : ");
				int x = sc.nextInt();
				while(x >= n || x < 0)
				{	
					System.out.println("Number should be between 0 and "+(n-1));
					x = sc.nextInt();
				}
				int y = sc.nextInt();
				while(y >=n || y < 0)
				{
					System.out.println("Number should be between 0 and "+(n-1));
					y = sc.nextInt();
				}
				Boolean res = game.find(x, y);
				if(res){
					System.out.println( x+" and "+ y+ " are connected.");
				}
				else
				{
					System.out.println( x+" and "+ y+ " are not connected.");
				}					
			}
			if(option == 3){
				System.out.println("Ok Game Ends.");
				sc.close();
				break;
			}
		}

	}

}
