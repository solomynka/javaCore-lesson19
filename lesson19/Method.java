// * @Author Solomiia
// * 16.05.2022
// * 
// *

package lesson19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Method {
	
	public static Serializable deserialize(File file) throws Exception {

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Serializable object = (Serializable) ois.readObject();
		ois.close();
		fis.close();
		
		return object;
	}
	public static void serialize(File file, Serializable object) throws Exception {

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(object);
		oos.close();
	}
}


