package package1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;

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
	//private static final Logger logger = Logger.getLogger(TrainingApp.class);
	public static void main(String[] args)throws SQLException{
		
		String url = "jdbc:postgresql://localhost:5432/book";//jdbc:postgresql://localhost:5432/oo-test"
		String username = "postgres";
		String password = "postgres";
				
		Connection connection = DriverManager.getConnection(url,username,password);	
		PreparedStatement pStatement = connection.prepareStatement("Select * from products inner join orders on products.product_no=orders.product_no");
		ResultSet result = pStatement.executeQuery();
		while (result.next()) {
			//Long insertedId = generatedKeys.getLong(1);
			String productNo = result.getString("product_no");
			String name = result.getString("name");
			String price = result.getString("price");
			String quantity = result.getString("quantity");
			System.out.println(productNo + "\t" + name + "\t" + price + "\t" + quantity);
		}
		System.out.println();
		
		PreparedStatement pStatement2 = connection.prepareStatement("SELECT * FROM book_base WHERE id = ?");
		//Statement.RETURN_GENERATED_KEYS
		int i = 1;
		while(i <= 4)
		{
			pStatement2.setLong(1, i++);
		
			ResultSet result2 = pStatement2.executeQuery();
			while (result2.next()) {
				//Long insertedId = generatedKeys.getLong(1);
				String author = result2.getString("author");
				String bookName = result2.getString("bookname");

				System.out.println(author + "\t\t" + bookName);
			}
		}
		
		//PropertyConfigurator.configure("log.conf");
		
		//logger.info("test message");
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new JavaProgrammer(new Date(), "Ruslan","Danilin",24, 500, 10, 15, "EE"));
		employees.add(new JavaProgrammer(new Date(), "Dmitriy","Avseitsev",22, 2000, 9, 25, "SE"));
		employees.add(new Tester(new Date(), "Olya","Tester", 18, 200, false));
		//employees.add(new Tester(new Date(), "Tanya","Tester", 19, 210, true));
		
		
		
		//connection.setAutoCommit(false);
		
		PreparedStatement pStatementInsert = connection.prepareStatement("INSERT INTO autors(author)  Values (?)");
		for(Employee empl : employees){
			pStatementInsert.setString(1, "" + empl.getFirstName() + "  " + empl.getLastName() + "");
			pStatementInsert.executeUpdate();
		}

	
		//connection.commit();
		
		System.out.println();
		PreparedStatement pStatementSelect = connection.prepareStatement("SELECT * FROM autors");
		ResultSet resultSelect = pStatementSelect.executeQuery();
		while (resultSelect.next()) {
			String author = resultSelect.getString("author");
			System.out.println(author);
		}
		
		/*for(Employee empl : employees){
			System.out.println(empl.getFirstName() + ": " + empl.getDate()+" : "+empl.hireDate);
			empl.doWork();
			if(empl instanceof Codable ) ((Codable) empl).writeCode();
		}
 		*/
		
		/*System.out.println((employees.get(1)).equals(employees.get(0)));
		
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
		}*/
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