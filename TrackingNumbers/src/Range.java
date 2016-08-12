
public class Range {
	
	int start;
	int end;

	public boolean isSubSet(Range r){
		return this.start< r.getStart() && this.end > r.getEnd();
	}
	
	public boolean isSuperSet(Range r){
		return true;
	}
	
	@Override
	public boolean equals(Object o){
		Record r = (Record) o;
		return this.start==r.getStart() && this.end==r.getEnd();
	}
	
	public int getStart() {
		return this.start;
	}

	public int getEnd() {
		return this.end;
	}
	
}
