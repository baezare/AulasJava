package secoes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Aula11_115_Date {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date dt1 = sdf1.parse("23/10/2023"); System.out.println(sdf1.format(dt1));
		Date dt2 = sdf2.parse("27/06/2024 11:33:03"); System.out.println(sdf2.format(dt2));
		Date data = new Date();		
		System.out.println(sdf2.format(data));
		Date data2 = Date.from(Instant.parse("2025-06-12T15:44:23Z")); System.out.println(sdf2.format(data2));
		System.out.println(sdf3.format(data2));
		
	}

}
