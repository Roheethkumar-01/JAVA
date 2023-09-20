//Date and time

import java.time.*;
public class Main
{
	public static void main(String[] args) {
		LocalDateTime obj1=LocalDateTime.now();
		System.out.println(obj1);
		LocalTime obj2=LocalTime.now();
		System.out.println(obj2);
		LocalDate obj=LocalDate.now();
		System.out.println(obj);
	}
}
