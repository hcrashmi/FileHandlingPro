package demo1;

public class DuplicateDigit
{
	public static void main(String[] args) {
		int n=1452654;
		int[] digitArray=new int[10];
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			digitArray[rem]++;
			n=n/10;
		}
		System.out.println
		("Number \t Occurance");
		for (int i = 0; i < digitArray.length; i++) {
			int count=digitArray[i];
			if(count!=0)
			{
				System.out.println(i +"\t" +count);
				
				//extra comment
				System.out.println(count);
			}
		}
		
		/*int[] arr={9,9,8,6,9,2,9};
		int count=0;
		int j;
		for (int i = 0; i < arr.length; i++)
		{
			for ( j = 0; j < arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(arr[i]+" repeated for"+count);
			}
			count=0;
		}
		*/
		/*String str = "2485083572085748";
	    int counter = 0;
	    for(char c : s.toCharArray()) {
	        if( c >= '0' && c<= '9') {
	            ++counter;
	        }
	    }
	    System.out.println(counter);
	    char[] ch = str.toCharArray();
		
		char[] ch1 = str.toCharArray();

		int len=ch.length;

		for ( int i = 0; i < len; i++) 
		{

		int counter = 0;

		for (int j = 0; j < len; j++) 
		{

		if (ch1[i]==ch[j])
		{

		counter++;

		ch[j]='\u0000';

		}

		}

		if(counter>0)
		{
			
			System.out.println(ch1[i]+"="+counter);
		}

		}
*/
		}

}


		
		
	
