package com.xworkz.app.dto;

public class XeroxDTO {

	private String name;
	private String emailId;
	private int noOfCopies;
	private int noOfPages;
	private String printout;

	public XeroxDTO() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getPrintout() {
		return printout;
	}

	public void setPrintout(String printout) {
		this.printout = printout;
	}

	@Override
	public String toString() {
		return "XeroxDTO [name=" + name + ", emailId=" + emailId + ", noOfCopies=" + noOfCopies + ", noOfPages="
				+ noOfPages + ", printout=" + printout + "]";
	}
	
	
}
