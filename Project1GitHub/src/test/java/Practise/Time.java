package Practise;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class Time {

	@Test
	public void getTime() {
	 Date dateObj = new Date();
	 SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
	 System.out.println(sim.format(dateObj));
	 

		Calendar cal = sim.getCalendar();
		cal.add(cal.DAY_OF_WEEK, 7);
		String reqDate = sim.format(cal.getTime());
		System.out.println(reqDate);
		
		
	}

	
}
