package final_assignment;

import java.io.*;
import java.lang.*;

public class test {
	public static void main(String[] args) throws FileNotFoundException{
		//open the file and read it
		FileInputStream fstream = new FileInputStream("src/final_assignment/polynomial.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		
		String eachLine;
		
		try{
			//reading file line by line
			while ((eachLine = br.readLine()) != null){
				//process each line
				//System.out.println(eachLine);
				String[] parts = eachLine.split(";");
				int number_terms = parts.length - 1;
				for (int i = 1; i <= number_terms ; i++){
					String coef = null;
					String exp;
					if (i%2 != 0){
						coef = parts[i];
					}
					else{
						exp = parts[i];
						try{
							int int_coef = Integer(coef).intValue();
							System.out.println(int_coef);
							
						}
						
						catch(Exception ex){
							
						}
						try{
							int int_exp = Integer(exp).intValue();
						}
						catch (Exception ex){
							
						}
						Term my_termm = new Term(int_coef, int_exp);
						System.out.println(my_termm.get_exponent());
						System.out.println("Wow i did it");
					}
					System.out.println(parts[i]);
				}
				System.out.println("One line over");
				
				
			}
			br.close();
			
			
		}
		catch(IOException ioe){
			
		}
	}

	private static Integer Integer(String coef) {
		// TODO Auto-generated method stub
		return null;
	}

}
