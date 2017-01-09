
public class Assignment2_3 {

	public static void main(String[] args) {
		/* Write a program to print the following pattern:
         a
       a b a
     a b c b a
       a b a
         a*/

	
for(int i=1;i<=5;i++){
	if(i==1 || i==5){
	System.out.println("   a   ");}
	else{if(i==2|| i==4){
		System.out.println(" a b a  ");}
	else{System.out.println("a b c b a");}}
}
	}}
		
