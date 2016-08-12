
public class Record extends Range{
	String statusCode;
	int transferCode;

	public Record(int start, int end, String status, int code) {
		this.start = start;
		this.end = end;
		this.statusCode = status;
		this.transferCode = code;
	}


	public String toString() {
		String result = this.start + " " + this.end + " " + this.statusCode + " " + this.transferCode;
		return result;
	}


}
