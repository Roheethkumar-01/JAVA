//String

public class Main
{
	public static void main(String[] args) {
		String a="Roheeth Kumar R J";
		String b="Roheeth Kumar R J";
		String d=" Hero ";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a);
		System.out.println(a.replace("Kumar R J","Vijay"));
		System.out.println(a.contains("Kumar"));
		System.out.println(a.isEmpty());
		System.out.println(a.startsWith("Ree"));
		System.out.println(a.endsWith("Jee"));
		System.out.println(a.substring(5));
		char[] arr=a.toCharArray();
		for(char c: arr){
		    System.out.print(c+" ");
		}
		System.out.println("");
		System.out.println(d.length());
		System.out.println(d.trim());
		System.out.println(d.trim().length());
		
	}
}
