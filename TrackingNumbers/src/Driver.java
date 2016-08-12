import java.io.*;

public class Driver {

	public static void main(String args[]) throws IOException {
		
		Table nt = new Table();
		
//		nt.createRecord(1, 1000, "A", 1);
//		nt.createRecord(2000, 2500, "B", 2);
		// add Megha's Code
		FileReader in = new FileReader("C:/input.txt");

		BufferedReader br = new BufferedReader(in);
		
		String value = br.readLine();
		
		System.out.println(value);
		
//		value = br.readLine();

		while (value != null) {
			
			value = br.readLine();
			
			if(value.equals("0")){
				System.out.println(nt);
				nt = new Table();
				value = br.readLine();
				System.out.println(value);
			}	
			else{
				
				String[] values = value.split(" ");

				String startTrackNumber = String.valueOf(values[0]);

				String endTrackNumber = String.valueOf(values[1]);

				String statusCode = String.valueOf(values[2]);

				String transferCode = String.valueOf(values[3]);

				int start = Integer.parseInt(startTrackNumber);

				int end = Integer.parseInt(endTrackNumber);

				int transfer = Integer.parseInt(transferCode);

				nt.createRecord(start, end, statusCode, transfer);

//				value = br.readLine();		
			}		

		}

		in.close();

	}

}
