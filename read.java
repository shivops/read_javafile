import java.io.*;

public class read {
	public static void main(String [] args) {
	String fileName = "/Users/Siva Yadav/Desktop/JAva/context.txt";
	String line = null;
	try {
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while((line = bufferedReader.readLine()) != null){
    //process the line
    System.out.println(line);
	}
	bufferedReader.close();
	}
	catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");
}
catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
}
}
}
