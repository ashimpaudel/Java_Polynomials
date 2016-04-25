package final_assignment;
import java.util.*;



public class polynomial {
	
	private List<Term> my_polynomial;
	//private Term[] myTerms;
	/*
	 * This is constructor of polynomial class
	 * 
	 * @param it does not have any parameter
	 * @return it is a constructor it returns nothing
	 */
	public polynomial(){
		// create a empty array
		my_polynomial = new ArrayList<Term>();
		
		
	}
	/*
	 * This is insert method. It inserts the term into the polynomial array after it has been initialized 
	 * 
	 * @param parameter is the term that you want to insert
	 * @return it is a void function so it does not return anything
	 */
	public void insert(Term term){
		// insert x and y in the polynomial list
		// @param 
		int i = 0;
		if (my_polynomial.size() == 0) {
			my_polynomial.add(term);

		} else {
		while (i<my_polynomial.size() && my_polynomial.get(i).get_exponent() < term.get_exponent()) {
			i++;
		}
		my_polynomial.add(i,term);
		}
	}
	/*
	 * This  method shows the polynomial as a string
	 * 
	 * @param this method does not take any parameter
	 * @return it returns string, the final string of the polynomial 
	 */
	public String show_polynomial(){
		int poly_length = my_polynomial.size();
		String final_poly = "";
		
		for (int i = 0; i<poly_length; i++){
			
			Term P_ith_term = my_polynomial.get(i);
			if (i == 0){
			}
			else{
				if (P_ith_term.get_coefficient() > 0){
					final_poly += "+";
				}
			}
			final_poly += P_ith_term.toString();

			
		}
		return "P(X) = " + final_poly;
	}
	/*
	 * This method deletes all the term in polynomial that has same both exponent and coefficient
	 * 
	 * @param this method takes two integer, coefficient and exponent as a parameter
	 * @return it is a void method, so it does not return anything
	 */
	public void delete(int x, int y){
		int poly_length = my_polynomial.size();
		for (int i = 0; i<poly_length; i++){
			Term P_ith_term = my_polynomial.get(i);
			if (P_ith_term.get_coefficient() == x && P_ith_term.get_exponent() == y){
				my_polynomial.remove(i);
				
			}
			
			
		}
		// delete everywhere x and y appears
	}
	/*
	 * this method computes and returns the product of all the terms
	 * 
	 * @param this method does not take any parameter
	 * @return String, as it returns the product as a string
	 */
	public String product(){
		// compute the product if the array of the polynomial is not empty
		int poly_length = my_polynomial.size();
		int final_coef = 1;
		int final_exp=0;
		for (int i =0; i<poly_length; i++){
			Term P_ith_term;
			P_ith_term = my_polynomial.get(i);
			final_coef *= P_ith_term.get_coefficient();
			final_exp += P_ith_term.get_exponent();
			
		}
		return Integer.toString(final_coef) + "x^"+ Integer.toString(final_exp);
		 
		
		
	}
	/*
	 * this method reverses the order of the terms of the polynomial
	 * 
	 * @param this method does not take any parameter
	 * @return it is a void function so it does not return anything
	 */
	public void reverse(){
		// reverse the order of polynomial
		List<Term> temp_polynomial = new ArrayList<Term>();
		int poly_length = my_polynomial.size();
		
		for (int i=poly_length-1; i>=0; i--){
			Term P_ith_term = my_polynomial.get(i);
			temp_polynomial.add(P_ith_term);
		}
		my_polynomial = temp_polynomial;
		
		
	}
	

}
