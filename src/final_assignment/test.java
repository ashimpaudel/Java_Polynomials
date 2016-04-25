package final_assignment;

import java.io.*;
import java.util.*;
public class test {
	public static void main(String[] args) throws FileNotFoundException {
		//open the file and read it
		FileInputStream fstream = new FileInputStream("src/final_assignment/polynomial.txt"); //file i/o
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));// found out buffered_reader from stackoverflow
		
		String eachLine;
		
		try{
			//reading file line by line
			while ((eachLine = br.readLine()) != null){//this loop continues until last line
				//process each line
				System.out.println(eachLine);
				String[] parts = eachLine.split(";"); //gives the array of string of each coefficient and exponent 
				
				int number_terms = parts.length - 1; // total number of items(exponent + coefficient) in polynomial, -1 because we have to discard first item as it is the name of polynomial
				String coef;
				String exp;
				List<Integer> int_terms = new ArrayList<>(); // int terms will be the array list of integer that will store coefficients and exponents
				polynomial polynomial_obj = new polynomial(); // instantiate the polynomial object;this will create the polynomial_obj variable that will reference to polynomial class
				
				for (int i = 1; i <= number_terms ; i++){ //this loop will run till the last exponent of our polynomial
					
					if (i%2 != 0){ // coefficient are stored in the odd indices of our parts array
						coef = parts[i];
						int int_coef = Integer.parseInt(coef); //converting string into int
						int_terms.add(int_coef); //adding the integer value of coefficient in my array list int_terms
						
					}
					else if (i%2 == 0){ //exponents are stored in the even indices of our parts array
						exp = parts[i];						
						int int_exp = Integer.parseInt(exp);//converting string into integer
						int_terms.add(int_exp);//adding the integer value of exponents in my array list int_terms
						//System.out.println(int_exp);
						
						
							
						}
					if (i%2 == 0 ){
						Term my_term = new Term(int_terms.get(i-2), int_terms.get(i-1)); // creating the instance of Term class

						
						polynomial_obj.insert(my_term); //calling the insert method of term class
						
					}
						
					}
					
				System.out.println(polynomial_obj.show_polynomial());//show the polynomial in string
				polynomial_obj.reverse();//reversing the polynomial
				System.out.print("After reversing: ");
				System.out.println(polynomial_obj.show_polynomial());//print the polynomial after reversing
				
				
				}
				//System.out.println("One line over");
				
				
				
				
			
			br.close();
		}
			
		
		catch(IOException ioe){
			
		}
		
	}




}
