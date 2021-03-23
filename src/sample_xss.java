import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cnt.Security.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BookDetail_jsp extends HttpJspBase {

	private static void printSanitizedName (String str) {

		String sanitizedUserData = Security.validName(str);
		//String sanitizedUserData = escapeHtml4(str);
		out.println (sanitizedUserData);
	}

	public static void loadData () {

		String userData = request.getParameter("Data"); 
		//out.println (userData);

		printSanitizedName(userData);
	}
	public static void loadName () {

		String userName = request.getParameter("Name"); 

		// this is a test
		printSanitizedName(userName);
	}

	public static void loadAccount () {

		String userAccount = request.getParameter("Account"); 

		printSanitizedName(userAccount);
	}

	public static void loadNumber () {

		String userNumber = request.getParameter("Number"); 

		printSanitizedName(userNumber);
	}

	public static void loadField () {

		String userField = request.getParameter("Field"); 

		printSanitizedName(userField);
	}

	public static void loadComments () {

		String userComment = request.getParameter("Comment"); 

		printSanitizedName(userComment);
	}

	public static void loadLink () {

		String userLink = request.getParameter("Link"); 

		printSanitizedName(userLink);
	}

	public static void loadProfile () {

		String userProfile = request.getParameter("Profile"); 

		printSanitizedName(userProfile);
	}

	public static void loadReport () {

		String userReport = request.getParameter("Report"); 

		printSanitizedName(userReport);
	}

	public static void loadInfoxxx () {

		String userInfo = request.getParameter("Info"); 

		//printSanitizedName(userInfo);
	}
	
	public static void xxxloadInfo () {

		String userInfo = request.getParameter("xxxInfo"); 

		printSanitizedName(userInfo);
	}
}
