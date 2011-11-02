package package1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class MyException1 extends Exception{
	MyException1()
	{
		super("my exception 1");
	}
}
class MyException2 extends Exception{
	MyException2()
	{
		super("my exception 2");
	}
}

public class TrainingApp {
	public static void testLogger(int param) throws MyException1,MyException2{
		if(param!=0)
		{
			if(param<100)
			{
				throw new MyException1();
			}
			else
			{
				throw new MyException2();
			}
		}
	}
	private static final Logger logger = Logger.getLogger(TrainingApp.class);
	public static void main(String[] args)throws SQLException{
		
		String url = "jdbc:postgresql://127.0.0.1:5432/test";
		String username = "postgres";
		String password = "postgres";
				
		Connection connection = DriverManager.getConnection(url,username,password);	
		PreparedStatement pStatement = connection.prepareStatement("INSERT INTO book (author,bookname) VALUES ('qwerty','bname')",
				Statement.RETURN_GENERATED_KEYS);
		
		System.out.println(pStatement.executeUpdate());
		
		
		
		
		
		PropertyConfigurator.configure("log.conf");
		
		logger.info("test message");
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new JavaProgrammer(new Date(), "Ruslan","Danilin",24, 500, 10, 15, "EE"));
		employees.add(new JavaProgrammer(new Date(), "Dmitriy","Avseitsev",22, 2000, 9, 25, "SE"));
		employees.add(new Tester(new Date(), "Olya","Tester", 18, 200, false));
		employees.add(new Tester(new Date(), "Tanya","Tester", 19, 210, true));
		
		/*for(Employee empl : employees){
			System.out.println(empl.getFirstName() + ": " + empl.getDate()+" : "+empl.hireDate);
			empl.doWork();
			if(empl instanceof Codable ) ((Codable) empl).writeCode();
		}
 		*/
		
		System.out.println((employees.get(1)).equals(employees.get(0)));
		
		try
		{
			testLogger(0);
			testLogger(1);
			testLogger(500);
		}
		
		catch(MyException1 ex1)
		{
			logger.error(ex1);
		}
		catch(Exception ex2)
		{
			logger.error(ex2);
		}
	}
}
/*
		Pattern pattern = Pattern.compile("(?iu)<a[^<>]+href\\s*=\\s*['\"]([^<>'\"]+)['\"][^<>]*>([^<>]+)</a>");
		Matcher matcher = null; //<a href="http://i.ua/" class="asd">Почта i.ua</a>
		
		Scanner reader = new Scanner(new FileInputStream("skipy.ru.htm"));
		
		StringBuilder sb = new StringBuilder();
		
		while(reader.hasNext()){
			String input = reader.nextLine();
			//String result = new String(input.getBytes("windows-1251"), "UTF-8");
			
			sb.append(input);
			sb.append("\r\n");
		}
		
		matcher = pattern.matcher(sb.toString());
		
		while(matcher.find()){
			String result  = matcher.group(2)+"\r\n\t"+matcher.group(1);
			result = new String(result.getBytes("windows-1251"), "UTF-8");
			System.out.println(result);
		}

*/