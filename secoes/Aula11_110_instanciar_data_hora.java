package secoes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula11_110_instanciar_data_hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		// GMT - Greenwich Mean Time -> UTC - Universal Time Coordinated -> Z - Zulu Time (londres)		
		
		LocalDate data01 = LocalDate.now(); System.out.println("data de hoje: "+data01);
		System.out.println("======================================================================");
		
		LocalDateTime data02 = LocalDateTime.now(); System.out.println("hora e data agora: "+data02);
		System.out.println("======================================================================");
		
		Instant data03 = Instant.now(); System.out.println("hora e data agora UTC: "+data03);
		System.out.println("======================================================================");
		
		LocalDate data04 = LocalDate.parse("2023-07-20"); System.out.println("criar uma data especifica: "+data04);
		System.out.println("======================================================================");
		
		LocalDateTime data05 = LocalDateTime.parse("2023-07-20T11:14:30");System.out.println("ciar uma data e hora especifica:"+data05);
		System.out.println("======================================================================");
		
		Instant data06 = Instant.parse("2023-07-20T15:33:25Z");System.out.println("ciar uma data e hora especifica UTC: "+data06);
		System.out.println("======================================================================");
		
		Instant data07 = Instant.parse("2023-07-20T15:33:25-03:00");System.out.println("ciar uma data e hora especifica Fuso Horario BR: "+data07);
		System.out.println("======================================================================");	
		
		LocalDate data08 = LocalDate.parse("27/09/1978", DateTimeFormatter.ofPattern("dd/MM/yyyy"));System.out.println("data formatada ISO: "+data08);
		System.out.println("======================================================================");
		
		DateTimeFormatter form02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime data09 = LocalDateTime.parse("27/09/1978 01:30:33", form02); System.out.println("data e hora formatada ISO: "+data09);
		System.out.println("======================================================================");
		
		LocalDate data10 = LocalDate.of(2030, 7, 30);System.out.println("outra forma de criar data: "+data10);		
		System.out.println("======================================================================");
		
		LocalDateTime data11 = LocalDateTime.of(2030, 7, 30, 1, 30);System.out.println("outra forma de criar data e hora: "+data11);
		System.out.println("======================================================================");		
	}
}