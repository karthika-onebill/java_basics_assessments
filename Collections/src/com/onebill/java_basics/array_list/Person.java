package com.onebill.java_basics.array_list;

public class Person implements Comparable<Person> {

		int p_no;
		String p_name;
		public Person(int p_no, String p_name) {
			super();
			this.p_no = p_no;
			this.p_name = p_name;
		}
		public int getP_no() {
			return p_no;
		}
		public void setP_no(int p_no) {
			this.p_no = p_no;
		}
		public String getP_name() {
			return p_name;
		}
		public void setP_name(String p_name) {
			this.p_name = p_name;
		}
		@Override
		public int compareTo(Person a) {
			//return this.p_no-a.p_no ;  //descending
			return a.p_no -this.p_no; //ascending
		}
		@Override
		public String toString() {
			return "Person [p_no=" + p_no + ", p_name=" + p_name + "]";
		}
	@Override
	public int hashCode() {
	
	return super.hashCode();
	}
		
		
	

}
