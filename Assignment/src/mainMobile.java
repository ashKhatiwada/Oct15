import java.util.Scanner;

public class mainMobile {
	
	
	
	public static void main(String[] args)
	{
		
		String manufact = null;
		String mod = null;
		String prce = null;
		String carr = null;
		String calnum = null;
		String gettxt = null;
		Scanner myScan = new Scanner(System.in);
		Scanner myScan2= new Scanner(System.in);
		
		int choice=7;
		
		while (choice !=0) {

		System.out.println("press 1 to enter your manufacturer?");
	
		System.out.println("press 2 to enter the model of your phone?");
		
		System.out.println("press 3 to enter the price of your phone?");
		
		System.out.println("press 4 to enter who your carrier is?");
		
		System.out.println("press 5 to Input the number you are trying to call");
		
		System.out.println("press 6 to type the text you want to send");
		System.out.println("press 0 to quit");
		
		choice = myScan.nextInt();
		
		if (choice==1) {
			System.out.println("My manufacturer is: ");
			manufact= myScan.next();
		}
		else if (choice==2) {
			
		System.out.println("My phone's model is: ");
		mod=myScan.next();
		}
		else if (choice==3) {
			
		System.out.println("The price was: ");
		
		prce= myScan.next();
		}
		else if (choice==4) {
			
			System.out.println("My phone carrier is: ");
			
			carr= myScan.next();
			}
		
else if (choice==5) {
			
			System.out.println("My number is: ");
			
			calnum= myScan.next();
			}
else if (choice==6) {
	
	System.out.println("Text: ");
	
	gettxt= myScan2.nextLine();
	}
else {
	break;
}
		
}
		mobilePhone phn=new mobilePhone(manufact, mod, prce, carr, calnum, gettxt);
//	phn.manufacturer=manufact;
//	phn.model=mod;
//	phn.price=prce;
//	phn.carrier=carr;
//	phn.callnum=calnum;
//	phn.gettext=gettxt;
	
	System.out.println(phn);
	phn.call();
	phn.text();
	
	
		
		
	}
	
	

}
