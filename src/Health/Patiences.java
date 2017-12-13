package Health;
import java.util.*;
interface hospital{
	public void hospital_details();
	
	//public void sysptoms();
}
interface doctor{
	public void doctor_details();
}

class Arunhospital implements hospital{
	public void hospital_details( ){
		String name="Arun Hospital";
		int doctors=32;
		String branch="kovilambakkam,Medavakkam,Tharamani";
		String phone="09566275879,0978997122";
		System.out.println(name);
		System.out.println(branch);
		System.out.println("No.of doctor"+doctors);
		System.out.println(phone);
	 
		
	}
	
}
class Arun_doctor extends Arunhospital implements doctor{
	public void doctor_details(){
		HashMap<String,String>lp=new HashMap<String,String> ();
		lp.put("Dr. Arun Sathish", " 09566275879");
		lp.put("Dr. Anitha Sathish", " 09566275878");
		lp.put("Dr. Arjun Sathish", " 09566275877");
		for(Map.Entry m:lp.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  } 
		//System.out.println("Dr. Arun Sathish A (Arun Hospital) in Kovilambakkam, Chennai");
		//System.out.println("Dr. Anitha Sathish A (Arun Hospital) in Medavakkam, Chennai");
		//System.out.println("Dr. Arjun Sathish A (Arun Hospital) in Taramani, Chennai");
		
	}
	
	public void ambulance(){
		System.out.println("ambulance at kovilambakkam contact number 09566275879 ");
	}
}
class Problem extends Arun_doctor {
	public void disease(){
	int ch;
	Scanner sc=new Scanner(System.in);
	System.out.println("1.fever 2.cough&cold flu 3.cardiology consultation 4.neurology consulation 5.ciritcal health");
	System.out.println("Enter ur problem in number format");
	ch=sc.nextInt();
	switch(ch){
	case 1:
		System.out.println("Treatment for normal fever and take any one of the following tablet");
		System.out.println("paracetamol morning and evening one capsule");
		System.out.println("                   or");
		System.out.println(" Actaminophen morning and evening one capsule");
		System.out.println("                   or");
		System.out.println(" Tylenol morning and evening one capsule");
		System.out.println("For other types of fever please contact Dr. Arjun Sathish 09566275879 ");
		break;
	case 2:
		System.out.println("Treatment for cough&cold flu and take any one of the following tablet");
		System.out.println("DEMAZIN morning and evening one capsule");
		System.out.println("For any help please contact Dr. Arjun Sathish 09566275879 ");
		break;
	case 3:
		System.out.println("For cardology consulating Dr. Arun Sathish 09566275878");
		System.out.println("op timing are as follows 10am to 2pm and 4pm to 9pm");
		break;
	case 4:
		System.out.println("For neurology consulating Dr. Anitha Sathish 09566275879");
		System.out.println("op timing are as follows 11am to 2pm and 4pm to 9pm");
		break;
	case 5:
		System.out.println("For critical health care consulating Dr. Arjun Sathish 09566275870");
		System.out.println("op timing are as follows 9am to 2pm and 4pm to 10pm");
		break;
		default:
			System.out.println("enter correct option");
			break;

	}

	}
	public void ambulance(){
		System.out.println("ambulance at Madavakkam contact number 09566275870");
	}
	
}
public class Patiences {
	public static void main(String args[]){
		String pname,gender;
		int age;
		Arunhospital ah=new Arunhospital();
		ah.hospital_details();
		Arun_doctor ad=new Arun_doctor();
		ad.doctor_details();
		ad.ambulance();
		Problem p=new Problem();
		p.ambulance();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Patient name");
		pname=sc.next();
		System.out.println("Enter the Patient age");
		age=sc.nextInt();
		System.out.println("Enter the gender");
		gender=sc.next();
		
		p.disease();
		
	}
}
