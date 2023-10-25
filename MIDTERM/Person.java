
public class Person {
 private String FirstName;
 private String MiddleName;
 private String LastName;
 private int Age;
 private String Birthday;
 private String Address;
 
 public Person(String FirstName, String MiddleName, String LastName, String string, String Birthday, String Address ) {
	 this.FirstName = FirstName;
	 this.MiddleName = MiddleName;
	 this.LastName = LastName;
	 this.Age = Age;
	 this.Birthday = Birthday;
	 this.Address = Address;
	 
 }
 public String getFirstName() {
	 return FirstName;
 }
 public void setFirstName(String FirstName) {
	 this.FirstName = FirstName;
 }
 public String getMiddleName() {
	 return MiddleName;
 }
 public void setMiddleName(String MiddleName) {
	 this.MiddleName = MiddleName;
 }
 String getLastName() {
	 return LastName; 
}
 public void setLastName(String MiddleName) {
	 this.LastName = LastName;
}
 public int Age() {
	 return Age;
 }
 public void setAge(int Age) {
	 this.Age = Age;
 }
 String getBirthday() {
	 return Birthday; 
}
 public void setBirthday(String Birthday) {
	 this.Birthday = Birthday;
}
 String getAddress() {
	 return Address; 
}
 public void setAddress(String Address) {
	 this.Address = Address;
}	
 public static void main(String args[]) {
	 Person person = new Person("Aurelio Jr" , "Bensi", "Ramos", "18", "08-13-2004", "Babag 1 Lamacan");
	 System.out.println("FirstName: " + person.getFirstName());
	 System.out.println("MiddleName: " + person.getMiddleName());
	 System.out.println("LastName: " + person.getLastName());
	 System.out.println("Age: " +  person.Age());
	 System.out.println("Birthday: " + person.getBirthday());
	 System.out.println("Address: " + person.getAddress());
	 
	 person.getAge(19);
	 person.setAddress("Babag 1 Lamacan");
	
	 
	 
	 
 }
private void getAge(int i) {
	// TODO Auto-generated method stub
	
}

 }
