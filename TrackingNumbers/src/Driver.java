import java.io.*;

public class Driver {

	public static void main(String args[]) throws IOException {
		
		Table nt = new Table();
		
//		nt.createRecord(1, 1000, "A", 1);
//		nt.createRecord(2000, 2500, "B", 2);
		// add Megha's Code
		FileReader in = new FileReader("C:/input.txt");

		BufferedReader br = new BufferedReader(in);

		while (br.readLine() != null) {

			String[] values = br.readLine().split("\\s*");
			
			for(String s:values){
				System.out.println(s);
			}

			String startTrackNumber = String.valueOf(values[0]);

			String endTrackNumber = String.valueOf(values[1]);

			String statusCode = String.valueOf(values[2]);

			String transferCode = String.valueOf(values[3]);

			int start = Integer.parseInt(startTrackNumber);

			int end = Integer.parseInt(endTrackNumber);

			int transfer = Integer.parseInt(transferCode);

			nt.createRecord(start, end, statusCode, transfer);

		}

		in.close();

	}

}
