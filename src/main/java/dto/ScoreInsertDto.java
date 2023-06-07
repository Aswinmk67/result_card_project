package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student_score")
public class ScoreInsertDto {
	@Id
	private long roll_number;
	private String student_name;
	private String date_of_birth;
	private String father_name;
	private String mother_name;
	private int kannada;
	private int english;
	private int hindi;
	private int maths;
	private int social;
	private int science;
	private int total_matks;
	private double percentage;
	public long getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(long roll_number) {
		this.roll_number = roll_number;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public int getKannada() {
		return kannada;
	}
	public void setKannada(int kannada) {
		this.kannada = kannada;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getTotal_matks() {
		return total_matks;
	}
	public void setTotal_matks(int total_matks) {
		this.total_matks = total_matks;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "ScoreInsertDto [roll_number=" + roll_number + ", student_name=" + student_name + ", date_of_birth="
				+ date_of_birth + ", father_name=" + father_name + ", mother_name=" + mother_name + ", kannada="
				+ kannada + ", english=" + english + ", hindi=" + hindi + ", maths=" + maths + ", social=" + social
				+ ", science=" + science + ", total_matks=" + total_matks + ", percentage=" + percentage + "]";
	}
	
	
	
	
	
}
