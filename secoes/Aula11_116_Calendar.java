package secoes;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Aula11_116_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		Date data = Date.from(Instant.parse("2025-06-12T15:44:23Z"));
		System.out.println(sdf1.format(data));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		data = cal.getTime();
		System.out.println(sdf1.format(data));
		System.out.println("===================");
		
		int minutos = cal.get(Calendar.MINUTE);
		System.out.println("Minutos: "+minutos);
		
		int mes = 1+cal.get(Calendar.MONTH);
		System.out.println("Mês: "+mes);
	}

}
