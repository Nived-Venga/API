package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MySQLDBConnection {

	// @Test(dataProvider = "Test_Table_DP")

	// @Test
	public String[][] getDBValues() throws ClassNotFoundException, SQLException {

		// Load the driver class
		// Driver Class exists in com.mysql.jdbc
		//Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/selenium_test_data";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet resultSet = statement.executeQuery("select * from selenium_test_data.Test_Table");
		resultSet.last();
		int no_of_rows = resultSet.getRow();

		System.out.println("Number of Rows: " + no_of_rows);

		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
		int no_of_columns = resultSetMetaData.getColumnCount();

		System.out.println("Number of Columns: " + no_of_columns);

		String data[][] = new String[no_of_rows][no_of_columns];
		int i = 0;
		resultSet.beforeFirst();
		while (resultSet.next()) {
			for (int j = 0; j < no_of_columns; j++) {
				data[i][j] = resultSet.getString(j + 1);
				System.out.print(data[i][j] + " ");
			}
			System.out.println();
			i++;
		}
		// return data;
		return data;

	}

	// @DataProvider(name = "Test_Table_DP") //@Test
	// @Test
	// public String[][] feedDataProvider() throws ClassNotFoundException,
	// SQLException { String
	// data[][] = getDBValues(); return data; }

	/*
	 * @Test
	 * 
	 * public void TestDataCheck1(String data1, String data2, String data3)
	 * 
	 * { System.out.println("Data1: " + data1); System.out.println("Data2: " +
	 * data2); System.out.println("Data3: " + data3);
	 * 
	 * ArrayList<String> nameList = new ArrayList<String>(); ArrayList<String>
	 * cityList = new ArrayList<String>(); ArrayList<String> ageList = new
	 * ArrayList<String>();
	 * 
	 * nameList.add(data1); cityList.add(data2); ageList.add(data3);
	 * 
	 * System.out.println("NameList: " + nameList); System.out.println("CityList: "
	 * + cityList); System.out.println("AgeList: " + ageList);
	 * 
	 * }
	 */

	@Test

	public void TestDataCheck2() throws ClassNotFoundException, SQLException {

		String[][] data = getDBValues();

		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> cityList = new ArrayList<String>();
		ArrayList<String> ageList = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				if (j == 0) {
					nameList.add(data[i][j]);
				}
				if (j == 1) {
					cityList.add(data[i][j]);
				}
				if (j == 2) {
					ageList.add(data[i][j]);
				}

			}
		}

		System.out.println("NameList: " + nameList);
		System.out.println("CityList: " + cityList);
		System.out.println("AgeList: " + ageList);
		
		
		
		/*
		 * Map map = new HashMap<String, String[][]>(); for(int i=0;i<10;i++) {
		 * map.put(nameList.get(i), data[j][j]);
		 */
	}
}
