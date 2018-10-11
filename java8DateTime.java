import java.text.DateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class java8DateTime.java {

	public static void main(String[] args) {
		
		DateTimeFormatter formatter =
			    DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
			                     .withLocale( Locale.UK )
			                     .withZone( ZoneId.systemDefault() );
		
		Instant Start = Instant.now();
		Instant end = Instant.now().plus(3, ChronoUnit.DAYS);
		
		System.out.println(formatter.format(end));
		
		
		Duration elapsed = Duration.between(Start, end);
		long hours = elapsed.toHours();
		
		System.out.println("Hours: "+ hours);
		
		
	}
}
