package mvndemo;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ExampleMain {
	public static void main(String[] args) {
		Person p1 = new Person("Vinod","Bhagat",25,"Mumbai","+919975983077");
		
		try {
			ObjectMapper mapper = new ObjectMapper();
			String str = mapper.writeValueAsString(p1);
			System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
