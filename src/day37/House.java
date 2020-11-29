package day37;
import java.util.ArrayList;
import java.util.List;

public class House {
	private String address;
	private int numberOfBedrooms;
	private int numberOfBathrooms;
	private List<String> schoolsCloseBy;
	private StringBuilder type;
	
	// 1. Make instance variables private
	// 2. public getters and setters
	public StringBuilder getType() {
		return new StringBuilder(type);
	}
	
	public void setType(StringBuilder type) {
		this.type = type;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public List<String> getSchoolsCloseBy() {
		return new ArrayList<>(schoolsCloseBy);
	}

	public void setSchoolsCloseBy(List<String> schoolsCloseBy) {
		this.schoolsCloseBy = schoolsCloseBy;
	}   
}
