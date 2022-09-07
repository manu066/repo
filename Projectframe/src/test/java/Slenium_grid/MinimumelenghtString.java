package Slenium_grid;

public class MinimumelenghtString {

	public static void main(String[] args) {
		String s[]= {"hi" ," hello","dell", "samsung","packpac"};
		int min=s[0].length();
		
		for (int i = 0; i < s.length; i++) {
			if(min>s[i].length())
			{
				min=s[i].length();
			}
			
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==min)
			{
				System.out.println(s[i]);
			}
		}

	}

}
