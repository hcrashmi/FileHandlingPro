package demo1;

public class ReverseEach {
	public static void main(String[] args) {
		String s2="I am here for interview now";
		
		char[] ch=s2.toCharArray();
		String res="";
		for(int i=0;i<ch.length;i++)
		{
			String s1="";
			while(i<ch.length && ch[i]!=' ')
		{
			//s1=ch[i]+s1;
				s1=s1+ch[i];
			i++;
		}
			//res=res+s1+" ";
			res=s1+res+"";
		}
		
		System.out.println(res);
	}
}
