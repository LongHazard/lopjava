package filejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class fileText {
	public static void main(String[] args) {
		String s = "Hello Trung Tâm Java - File";
		writeFile(s);
		readFile();
	}
	
	public static void writeFile(String s) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
			byte[] bArr = s.getBytes();
			fileOutputStream.write(bArr);
			fileOutputStream.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void readFile() {
		File file = new File("text.txt");
		if (file.exists()) {
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				int c = fileInputStream.read();
				while (c != -1) {
					System.out.print((char) c);
					c = fileInputStream.read();
				}
				fileInputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
