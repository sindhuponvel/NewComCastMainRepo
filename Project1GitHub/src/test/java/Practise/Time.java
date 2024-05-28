package Practise;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Time {

	@Test
	public void getTime() {
	 Date dateObj = new Date();
	 SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
	 System.out.println(sim.format(dateObj));
		
		
	}

	
}
