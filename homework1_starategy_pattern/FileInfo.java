package homework1_starategy_pattern;

import java.util.Date;

public class FileInfo {

	public String name;
	public String type;
	public int size;
	public Date modifiedDate;
	
	public FileInfo(String name, String type, int size, Date modifiedDate) {
		
		this.name = name;
		this.type = type;
		this.size = size;
		this.modifiedDate = modifiedDate;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Date getModifiedDate() {
		return this.modifiedDate;
	}
	
	public String toString() { 
		return "Name: " + this.getName() + "\n" +
			   "Type: " + this.getType() + "\n" + 
			   "Size: " + this.getSize() + "\n" + 
			   "ModifiedDate: " + this.getModifiedDate() + "\n";
	}
}
