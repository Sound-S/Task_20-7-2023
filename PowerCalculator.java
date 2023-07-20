public class PowerCalculator implements Calculator
{
	public static void main(String args[]) throws Exception
	{
		
		PowerCalculator p = new PowerCalculator();  // PowerCalculator class object
		
		double numbers[] = new double[2];
		
		for(int i = 0; i<2; i++)
		{
			numbers[i] = Double.parseDouble(args[i]); //converting string values into corresponding values based on datatype	
		}
		
		double number_1 = numbers[0];
		double number_2 = numbers[1];
		 
                 if(number_1  > 0 && number_2 > 0)
		 {
		
			double power_result = p.power(number_1, number_2);      // method calling - power()
		
                        double result= Math.round(power_result * 10.0) / 10.0;

			System.out.println(result);
                 }
                 else
                 {
                     throw new Exception("Please enter positive numbers only!"); //exception throw
	         }
				
	}

	@Override
	public double power(double a, double b) 
	{
                  double power_value = Math.pow(a,b);
		  return power_value; 
       }

}

interface Calculator
{
	double power(double a, double b);
}
