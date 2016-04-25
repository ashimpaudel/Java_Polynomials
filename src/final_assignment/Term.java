package final_assignment;

public class Term {
	private int coefficient;
	private int exponent;
	/*
	 * This is constructor of polynomial class
	 * 
	 * @param it takes two integers, coefficient and exponent as a parameter
	 * @return it is a constructor it returns nothing
	 */
	public Term(int coeff, int expo){
		coefficient = coeff;
		exponent = expo;
		
	}
	/*
	 * This is a getter method. It is used whenever we want to get the coefficient of our term
	 * 
	 * @param nothing it does not take any parameter
	 * @return integer it returns integer, as coefficient is of type integer
	 */
	public int get_coefficient(){
		return coefficient;
		
	}
	/*
	 * This is a getter method. It is used whenever we want to get the exponent of our term
	 * 
	 * @param it does not have any parameter
	 * @return integer it returns integer, as coefficient is of type integer
	 */
	public int get_exponent(){
		return exponent;
	}
	/*
	 * This methods convert the term to string
	 * 
	 * @param it does not have any parameter
	 * @return String it returns String of term
	 */
	public String toString(){
		if (this.exponent != 0){
			return Integer.toString(this.coefficient) + "x^"+ Integer.toString(this.exponent);
			
		}
			else{
			return Integer.toString(coefficient);
			
		}
	}
}
