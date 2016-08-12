import java.util.ArrayList;

public class Record extends Range{
	String statusCode;
	int transferCode;
	ArrayList<Record> recordList;

	public Record(int start, int end, String status, int code) {
		this.start = start;
		this.end = end;
		this.statusCode = status;
		this.transferCode = code;
	}

	public ArrayList<Record> resolveConflicts(ArrayList<Record> list){
		recordList = list;
		//perform naveen's algo
		return recordList;
	}

	public String toString() {
		String result = this.start + " " + this.end + " " + this.statusCode + " " + this.transferCode;
		return result;
	}


}
