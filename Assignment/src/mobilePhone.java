import javafx.scene.image.Image;

public class mobilePhone {
//class here there is method and stuff is happening
	
	
	public String manufacturer;
	public String model;
	public String price;
	public String carrier;
	public static String callnum;
	public static String gettext;
	
	
	
	

	//attributes
	public mobilePhone(String manufacturer, String model, String price,String carrier, String callnum,String gettext) {
		this.manufacturer= manufacturer;
		this.model= model;
		this.price =price;
		this.carrier=carrier;
		this.callnum=callnum;
		this.gettext=gettext;
		
	}
	
	
//method for call and text
	public static void call(){
	       System.out.println("I am calling "+ callnum);
	   }


	public static void  text() {
		System.out.println(gettext);
	}


//to string method
	
	public String toString()
	{
		return "Manufacturer: " + manufacturer + "\n" +
				"Model: " + model + "\n" +
				"Price: " + price+ "\n" +
				"Carrier "+carrier+ "\n"
				;
				
	}


}
