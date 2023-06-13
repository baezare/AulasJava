package secoes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula11_113_calculo_data_hora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date01 = LocalDate.parse("2030-07-12"); // ISO 8601	
		LocalDateTime date02 = LocalDateTime.parse("2030-09-13T01:30:25"); // ISO 8601	
		Instant date03 = Instant.parse("2033-12-11T01:33:25Z"); // GMT
		
		System.out.println("Subtrair x dias da semana LocalDate: 2030-07-12");
		LocalDate subtrairDias = date01.minusDays(7);System.out.println("Resultado: "+subtrairDias);
		System.out.println("===========================================================");
		
		System.out.println("Somar x dias na semana LocalDate: 2030-07-12");
		LocalDate somarDias = date01.plusDays(7);System.out.println("Resultado: "+somarDias);
		System.out.println("===========================================================");
		
		System.out.println("Subtrair x dias da semana LocalDateTime: 2030-09-13");
		LocalDateTime subtrairDiasHoras = date02.minusDays(7);System.out.println("Resultado: "+subtrairDiasHoras);
		System.out.println("===========================================================");
		
		System.out.println("Somar x dias na semana LocalDateTime: 2030-09-13");
		LocalDateTime somarDiasHoras = date02.plusDays(7);System.out.println("Resultado: "+somarDiasHoras);
		System.out.println("===========================================================");
		
		System.out.println("Subtrair x dias da semana Instant: 2033-12-11");
		Instant subtrairInstant = date03.minus(7, ChronoUnit.DAYS);System.out.println("Resultado: "+subtrairInstant);
		System.out.println("===========================================================");
		
		System.out.println("Somar x dias na semana Instant: 2033-12-11");
		Instant somarInstant = date03.plus(7, ChronoUnit.DAYS);System.out.println("Resultado: "+somarInstant);
		System.out.println("===========================================================");
		
		Duration tempo01 = Duration.between(subtrairDiasHoras, date02);
		System.out.println("Duração total de dias LocalDateTime: "+tempo01.toDays());
		System.out.println("===========================================================");
		
		Duration tempo02 = Duration.between(subtrairDias.atTime(0,0), date01.atTime(0,0)); // atTime converte LocalDate para LocalDateTime
		Duration tempo03 = Duration.between(subtrairDias.atStartOfDay(), date01.atStartOfDay()); //atStartOfDay converte LocalDate para LocalDateTime
		System.out.println("Duração total de dias LocalDate: "+tempo02.toDays());
		System.out.println("Duração total de dias LocalDate: "+tempo03.toDays());
		System.out.println("===========================================================");
		
		Duration tempo04 = Duration.between(subtrairInstant, date03);
		System.out.println("Duração total de dias Instant: "+tempo04.toDays());
	}
}
