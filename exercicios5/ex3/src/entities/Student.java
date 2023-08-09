package entities;

public class Student {

		public String name;
		public Double n1, n2 ,n3;
		
		public Double finalGrade() {
			return n1+n2+n3;
		}
		
		public Double missingPoints() {
			return 60 - finalGrade();
		}
}
