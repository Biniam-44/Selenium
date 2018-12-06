package DateConcept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Date d = new Date();
           
           SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY");
           SimpleDateFormat sd = new SimpleDateFormat("M/d/YYYY hh:mm:ss");
           System.out.println(sdf.format(d));
           System.out.println(sd.format(d));
           System.out.println(d.toString());
	}

}
