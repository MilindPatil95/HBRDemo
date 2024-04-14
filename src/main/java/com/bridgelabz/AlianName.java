package com.bridgelabz;

import javax.persistence.Embeddable;

@Embeddable
public class AlianName 
{
 String fname;
 String mname;
 String lname;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getMname() {
	return mname;
}
@Override
public String toString() {
	return "AlianName [fname=" + fname + ", mname=" + mname + ", lname=" + lname + "]";
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
}
