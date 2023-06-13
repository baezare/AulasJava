package secoes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula11_111_data_hora_texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3 formas de elaborar o processo
		LocalDate date01 = LocalDate.parse("2030-07-12");
		LocalDateTime date02 = LocalDateTime.parse("2030-09-13T01:30:25");
		Instant date03 = Instant.parse("2033-12-11T01:33:25Z");
		
		DateTimeFormatter form01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("formato personalizado data: "+date01.format(form01));
		System.out.println("formato personalizado data: "+form01.format(date01));
		System.out.println("formato personalizado data: "+date01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("======================================================");
		
		DateTimeFormatter form02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("formato personalizado data e hora: "+date02.format(form02));
		System.out.println("formato personalizado data e hora: "+form02.format(date02));
		System.out.println("formato personalizado data e hora: "+date02.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		System.out.println("formato personalizado data e hora ISO: "+DateTimeFormatter.ISO_DATE_TIME.format(date02));
		System.out.println("================================================================================");
		
		DateTimeFormatter form03 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		System.out.println("formato personalizado data e hora local hora do computador :"+form03.format(date03));
		System.out.println("formato personalizado data e hora local hora ISO :"+DateTimeFormatter.ISO_INSTANT.format(date03));
		System.out.println("================================================================================");
		
	}

}
