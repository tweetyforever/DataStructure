package Array.ClickCountsByDomain;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		String[] counts = {"900,google.com",
			     "60,mail.yahoo.com",
			     "10,mobile.sports.yahoo.com",
			     "40,sports.yahoo.com",
			     "300,yahoo.com",
			     "10,stackoverflow.com",
			     "20,overflow.com",
			     "5,com.com",
			     "2,en.wikipedia.org",
			     "1,m.wikipedia.org",
			     "1,mobile.sports",
			     "1,google.co.uk"};
		Map<String, Integer> mapMail = new TreeMap<>();
		Solution test = new Solution();
		mapMail = test.calculateClicksByDomain(counts);
		mapMail.forEach((key, value) -> System.out.println(key + ":" + value));
	}

}
