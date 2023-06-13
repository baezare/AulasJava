package secoes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Aula11_112_data_hora_global_para_local {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date01 = LocalDate.parse("2030-07-12"); // ISO 8601	
		LocalDateTime date02 = LocalDateTime.parse("2030-09-13T01:30:25"); // ISO 8601	
		Instant date03 = Instant.parse("2033-12-11T01:33:25Z"); // GMT
		
		System.out.println("Converter uma data para o fuso horario local formato ISO:");
		LocalDate test01 = LocalDate.ofInstant(date03, ZoneId.systemDefault());
		System.out.println(test01);
		System.out.println("===========================================================");
		
		System.out.println("Converter uma data para o fuso horario do país formato ISO:");
		LocalDate test02 = LocalDate.ofInstant(date03, ZoneId.of("Portugal"));
		System.out.println(test02);
		System.out.println("================================================================");
		
		System.out.println("Converter uma data e hora para o fuso horario local formato ISO:");
		LocalDateTime test03 = LocalDateTime.ofInstant(date03, ZoneId.systemDefault());
		System.out.println(test03);
		System.out.println("==================================================================");
		
		System.out.println("Converter uma data e hora para o fuso horario do país formato ISO:");
		LocalDateTime test04 = LocalDateTime.ofInstant(date03, ZoneId.of("Portugal"));
		System.out.println(test04);
		System.out.println("==================================================================");
		
		System.out.print("Dia do mes: "+date01.getDayOfMonth()); 
		System.out.print(" --Mês do ano: "+date01.getMonthValue());
		System.out.println(" --Ano: "+date01.getYear());
		System.out.println("==================================================================");
		
		System.out.print("Hora: "+date02.getHour());
		System.out.print(" --Minutos: "+date02.getMinute());
		System.out.println(" --Segundos: "+date02.getSecond());
		System.out.println("Horas, minutos e segundos: "+date02.getHour()+":"+date02.getMinute()+":"+date02.getSecond());
		System.out.println("==================================================================");
		
		/* for(String nomes: ZoneId.getAvailableZoneIds()) {
		System.out.println(nomes);
		} */		
	}
}