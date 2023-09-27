import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HelloMe{
	public static void main(String args[]){
		System.out.println("Hello Jack");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name="";
		try{
		name = reader.readLine();
		} catch (Exception e) {
		System.err.println(e);
}
	}
}
