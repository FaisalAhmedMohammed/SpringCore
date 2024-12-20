package in.ahmed.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BookService {
	private IBookDao bookdao;

	public BookService(IBookDao bookdao) {
		
		this.bookdao = bookdao;
	}

	public void readData() throws Exception {

		File file = new File("book.txt");
		FileReader f = new FileReader(file);
		BufferedReader br = new BufferedReader(f);
		String line = br.readLine();
		while (line != null) {
			String[] data = line.split(",");

			int id = Integer.parseInt(data[0]);
			String name = data[1];
			Double price = Double.parseDouble(data[2]);

			bookdao.readData(id, name, price);
			line = br.readLine();
		}
		System.out.println("inseted");

	}

}
