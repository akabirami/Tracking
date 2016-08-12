import java.util.*;

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
	
	public ArrayList<Record> resolveConflicts(Record input, ArrayList<Record> recordList){
		Record startRecord = null, endRecord = null, superSetRecord = null;
		ArrayList<Record> toDeleteSubSets = new ArrayList<Record>();
		boolean isSubSet, isSameRange, isStartOverlap, isEndOverlap, isSuperSet;
		isSubSet = isSameRange = isStartOverlap = isEndOverlap = isSuperSet = false;
		
		for(Record current : recordList){
			if(isSameRange = input.equals(current)){
				current.updateData(input);
				break;
			}
			else if(input.isSuperSet(current)){
				toDeleteSubSets.add(current);
			}
			else if(isSubSet = input.isSubSet(current)){
				superSetRecord = current;
			}
			else if(isStartOverlap = input.isStartOverlap(current)){
				startRecord = current;
			}
			else if(isEndOverlap = input.isEndOverlap(current)){
				endRecord = current;
			}
		}
		
		deleteAll(toDeleteSubSets, recordList);
		
		if(isSubSet){
			if(!superSetRecord.isSameData(input)){
				int index = recordList.indexOf(superSetRecord);
				Record a = new Record(superSetRecord.getStart(), input.getStart() - 1, superSetRecord.getStatusCode(), superSetRecord.getTransferCode());
				Record b = input;
				Record c = new Record(input.getEnd() + 1, superSetRecord.getEnd(), superSetRecord.getStatusCode(), superSetRecord.getTransferCode());
				recordList.add(index,a);
				recordList.add(index+1,b);
				recordList.add(index+2,c);
				recordList.remove(recordList.indexOf(superSetRecord));
			}
		}
		
		
		return recordList;
	}

	public boolean isSameData(Record input){
		return this.statusCode.equals(input.getStatusCode()) && this.transferCode == (input.getTransferCode());
	}
	
	public void deleteAll(ArrayList<Record> toDeleteSubSets, ArrayList<Record> recordList){
		for(Record current : toDeleteSubSets){
			recordList.remove(recordList.indexOf(current));
		}
	}
	
	
	public void updateData(Record input){
		this.statusCode = input.getStatusCode();
		this.transferCode = input.getTransferCode();
	}
	
	public String getStatusCode(){
		return this.statusCode;
	}
	
	public int getTransferCode(){
		return this.transferCode;
	}
}
