
public class FizzBuzz {

	public static void main(String[] args) {
				// TODO Auto-generated method stub

		int number;
		
		for(number=1;number<=100;number++){
			if((number%3==0)&&!(number%5==0))
			System.out.println("Fizz");
			else if(number%5==0&&!(number%3==0))
				System.out.println("Buzz");
			else if((number%3==0)&&(number%5==0))
				System.out.println("FizzBuzz");
			else
				System.out.println(number);
			
		}
	}

}
