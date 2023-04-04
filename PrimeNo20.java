package lab1;

public class PrimeNo20 {

	public static void main(String[] args) {
		System.out.println("Prime numbers between 2 to 30");
				for(int i=2;i<=30;i++)
				{
					for(int j=2;i<=30;i++)
						if(i!=j&&i%j!=0)
						{
							System.out.print(i);
							System.out.println();
							break;
						}
				}

	}

}
