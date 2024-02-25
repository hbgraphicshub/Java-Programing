class employee
{
 String firstname,lastname;
 int sal;
 
 employee()
 {
	 firstname="";
	 lastname="";
	 sal=0;
 }
 
 void setfirstname(String st)
 {
	 firstname=st;
 }
 String getfirstname()
 {
	 return firstname;
 }
 
 void setlastname( String st)
 {
	 
	lastname=st;
 }
  
 String getlastname()
 {
	 return lastname;
 }
 void setsal(int k)
 {
	 if(k>0)
		 sal=k;
	 else
		 sal=0;
 }
 int getsal()
 {
	 return sal;
 }
 

}



public class firstexpt {

	public static void main(String[] args) {
		 int k,f;
	     employee obj1=new employee();
	     //employee obj2=new employee();
	     obj1.setfirstname ("Sahil");
	     obj1.setlastname ("Sutar");
	     obj1.setsal(10000);
	     k=obj1.getsal();
	     f=(k*10)/100+k;
	     
	     System.out.println("Revised Salary = "+f);

	}

}
