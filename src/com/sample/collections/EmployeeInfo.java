package com.sample.collections;

public class EmployeeInfo {

		private String name;
		private int empid;
		private String email;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		EmployeeInfo(String name, int id, String email){
			this.email=email;
			this.empid=id;
			this.name=name;
		}
		
		@Override
		public String toString() {
			
			return "[id="+this.empid +"name="+this.name+"email="+this.email+"]";
		}


}
