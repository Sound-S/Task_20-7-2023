public class Func_Programming 
{
	public static void main(String args[])
	{
		
		int len = args.length;
		
		int[] numbers = new int[len];
		
		for(int i=0; i<len; i++) 
	    {
			numbers[i] = Integer.parseInt(args[i]);
	    }
		
		
		
	}
	
	public boolean isOdd(int num)
	{
		int check_number = num;
		
		if(check_number%2 != 0)
		{
			return true;
		}
		return false;
	}

}
