import java.util.Scanner;


public class Clint {

	public static void main (String args[])
	{
		mobileFactory info=new mobileFactory();
		mobileSpeci type;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the mobile type \n 1.Samsung \n 2.BlackBerry \n");
		
		if(input.hasNextInt())
		{
			int option= input.nextInt();
			type=info.mafuacture(option);
			
			if(type!=null)
			{
				showInfo(type);
			}
			else
				System.out.println("inbl "+info.toString());
			
		}
	}
	
	static void showInfo(mobileSpeci mbl)
	{
		mbl.showCompany();
		mbl.showPrice();
	}
}
