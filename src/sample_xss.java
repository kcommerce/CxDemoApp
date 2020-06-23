Skip to content
GitLab
More
Search or jump to…
4
Help
James Brotsos
C
CxApp
Project overview
Repository
Files
Commits
Branches
Tags
Contributors
Graph
Compare
Locked Files
Issues
0
Merge Requests
1
Requirements
CI / CD
Security & Compliance
Operations
Packages & Registries
Analytics
Wiki
Snippets
Members
Settings
Collapse sidebar

Please ensure your account's recovery settings are up to date.
James Brotsos
CxApp
Repository
master
cxapp
 src
 sample_xss.java
James Brotsos's avatar
Add new file
James Brotsos authored 3 months ago
d720e0fc
 sample_xss.java 1.82 KB
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
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
		out.println (sanitizedUserData);
	}
	public static void loadData () {
		String userData = request.getParameter("Data"); 
		out.println (userData);
		printSanitizedName(userData);
	}
	public static void loadName () {
		String userName = request.getParameter("Name"); 
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
		printSanitizedName(userInfo);
	}
	
	public static void xxxloadInfo () {
		String userInfo = request.getParameter("xxxInfo"); 
		printSanitizedName(userInfo);
	}
}