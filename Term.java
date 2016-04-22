package final_assignment;

public class Term {
	private int coefficient;
	private int exponent;
	public Term(int coeff, int expo){
		coefficient = coeff;
		exponent = expo;
		
	}
	public int get_coefficient(){
		return coefficient;
		
	}
	public int get_exponent(){
		return exponent;
	}
	public String tostring(){
		if (exponent != 0){
			return Integer.toString(coefficient) + "x^"+ Integer.toString(exponent);
		}
			else{
			return Integer.toString(coefficient);
		}
	}
}
