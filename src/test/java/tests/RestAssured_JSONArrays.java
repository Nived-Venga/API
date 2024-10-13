package tests;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import payload.Payload;
import utilities.ConvertStringToJSON;

public class RestAssured_JSONArrays {

	int number_of_courses, number_of_copies, sum_of_all_courses = 0;
	Map<String, String> map;
	JsonPath json = ConvertStringToJSON.getJSON(Payload.getCoursesPayload());
	String purchase_amount;

	public void setNumberOfCourses(int number_of_courses) {
	 this.number_of_courses = number_of_courses;
	}
	
	public Integer getNumberOfCourses() {
		 return this.number_of_courses;
		}
	
	
	@Test
	public void Find_Number_Of_Courses() {

		int count = json.getInt("courses.size()");
		System.out.println("Number of courses: " + count);
		//setNumberOfCourses(count);
		this.number_of_courses = count;
	}

	@Test
	public void Find_Purchase_Amount() {
		String amount = json.getString("dashboard.purchaseAmount");
		System.out.println("Total Purchase Amount: " + amount);
		this.purchase_amount = amount;
	}

	@Test
	public void Title_Of_First_Course() {
		String title_of_first_course = json.getString("courses.get(0).title");
		System.out.println("Title of First Course: " + title_of_first_course);
	}

	public void iterate_over_courses() {
		number_of_copies = 0;
		sum_of_all_courses = 0;
		map = new HashMap<String, String>();
		for (int i = 0; i < number_of_courses; i++) {
			
			map.put(json.getString("courses.title"), json.getString("courses.price"));
			if (json.getString("courses.get(" + i + ").title").equalsIgnoreCase("RPA")) {
				number_of_copies = json.getInt("courses.get(" + i + ").copies");
			}
			sum_of_all_courses = sum_of_all_courses + (json.getInt("courses.get(" + i + ").price") * json.getInt("courses.get(" + i + ").copies"));
		}
	}

	@Test
	public void Get_CourseTitle_And_CoursePrice() {
		iterate_over_courses();
		System.out.println(map);
	}

	@Test
	public void Validate_SumOfAllCourses_And_PurchaseAnount() {
		iterate_over_courses();
		System.out.println("Sum of all courses: " + sum_of_all_courses);
		Assert.assertEquals("Validation Success", json.getInt("dashboard.purchaseAmount"), sum_of_all_courses);
		System.out.println("Validation Success");
	}

}
