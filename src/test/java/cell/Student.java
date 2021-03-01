package cell;

/**
 * @author: Luo
 * @description:
 * @time: 2020/9/20 14:24
 * Modified By:
 */
public class Student {
		private String schoolName;
		private String address;
		private int studentNumber;
		public String getSchoolName() {
			return schoolName;
		}
		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public int getStudentNumber() {
			return studentNumber;
		}
		public void setStudentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
		}
		@Override
		public String toString() {
			return "School [schoolName=" + schoolName + ", address=" + address
					+ ", studentNumber=" + studentNumber + "]";
		}

}
