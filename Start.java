import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
 

import com.student.management.app.Student;
import com.student.management.app.StudentDao;

public class Start {

	public static void main(String args[]) throws SQLException, IOException {
		 
	 
	 
	 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	 
	while(true) {
	 
	 System.out.println("Enter 1 to Add");

	 System.out.println("Enter 2 to Delete");

	 System.out.println("Enter 3 to Display all");

	 System.out.println("Enter 4 to update");
	  
	 System.out.println("Enter 5 to exit");
	 
	 System.out.println("Enter Your Choice");
	 int c =Integer.parseInt(br.readLine()) ;
 
	 if(c==1)
	 {
		 System.out.println("Enter name");
		 String name = br.readLine();
		 
		 System.out.println("Enter phone");
		 String phone = br.readLine();
		 
		 System.out.println("Enter city");
		 String city = br.readLine();
		 
		 Student st = new Student(name,phone,city);
		 
		boolean f = StudentDao.insertStudent(st);
		
		if(f) {
			System.out.println("Student Added");
		}else {
			System.out.println("Something went wrong..");
		}
		
		 
		 
	 }else if(c==2) 
	 {
		 System.out.println("Enter id");
		 int id = Integer.parseInt(br.readLine()) ;
		 
		 
		  
		boolean f = StudentDao.deleteStudent(id);
		
		if(f) {
			System.out.println("Student Deleted");
		}else {
			System.out.println("Something went wrong..");
		}
		
		 
	 }else if(c==3) {
		 
			  StudentDao.displayAll();
		 
		 
	 }else if(c==4){
		 
		 System.out.println("Enter id");
		 int sid =Integer.parseInt(br.readLine()) ;
		 
		 System.out.println("Enter name");
		 String name = br.readLine();
		 
		 System.out.println("Enter phone");
		 String phone = br.readLine();
		 
		 System.out.println("Enter city");
		 String city = br.readLine();
		 
		 Student st = new Student(sid,name,phone,city);
		 
		 
		 boolean f = StudentDao.updateStudent(st);
			if(f) {
				System.out.println("Updated..");
			}else {
				System.out.println("Something went wrong..");
			}
			
		 
		 
	 }if(c==5){
		 System.out.println("Thank You"); 
		 break;
	 }else {
		 
	 }
	 
	 
	}
	}
	
}
