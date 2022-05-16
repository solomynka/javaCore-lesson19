// * @Author Solomiia
// * 16.05.2022
// * 
// *

package lesson19;

import java.io.File;
import java.util.Arrays;

public class Application {
	public static void main(String[] args) throws Exception {

		File file = new File("employee.txt");
		Employee empl1 = new Employee(8000.5, 1, "Bob");
		
		Method.serialize(file, empl1);
		
		System.out.println();
		
		System.out.println(Method.deserialize(file));
		
		Employee[] mas = {new Employee(8000.5, 1, "Bob"), new Employee(9000.5, 2, "Rob"),
				new Employee(8500.5, 3, "Jen")};
		
		Method.serialize(file, mas);
		
		System.out.println(Arrays.toString((Object[]) Method.deserialize(file)));
		
		
		
	}
}


	
	