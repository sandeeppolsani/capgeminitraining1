package exerxise1;

import java.io.*;

public class FileProgram {

	public FileProgram() throws IOException,FileNotFoundException {
		// TODO Auto-generated constructor stub
		CopyDataThread thread=new CopyDataThread();
		thread.start();
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileProgram fc=new FileProgram();
	}

}
