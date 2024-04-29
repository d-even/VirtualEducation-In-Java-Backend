import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class MiniProject {
    public static void main(String[] args) {
    	String url = "jdbc:mysql://127.0.0.1:4306/test"; // pointing to no database.
        String username = "root";
        String password = "";

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        System.out.print(
                "\n\nWelcome \n\n Which subject you will study today ??\n Enter your choice\n 1.POC\n 2.Mathematics3\n 3.DSA\n 4.PCPF\n 5.DBMS\n 6.Exit\nChoice: ");
        choice = sc.nextInt();
        switch (choice) {
            // POC
            case 1:
            {
                System.out.printf("Which module you have to study\n\n");
                System.out.printf("1.Module1\n 2.Module2\n 3.Module3\n 4.Module4\n 5.Module5\n 6.Module6\n 7.Go Back");
                System.out.printf("\nChoice of Module : ");
                int choice2 = sc.nextInt();
                String sqlQuery = "SELECT * FROM test.pcom where PCOMid=" + choice2 +";";
                String chosenModule = "";
                String chosenTopics = "";
				try(Connection serverConnection = DriverManager.getConnection(url, username, password);
						Statement stmt =  serverConnection.createStatement();
						ResultSet rs  =  stmt.executeQuery(sqlQuery)) {
					while(rs.next())
					{
					chosenModule = rs.getString("PCOMsubject");
					chosenTopics = rs.getString("topics");
					}
				} catch (SQLException e) {;
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(chosenModule.length() == 0) {
					System.out.println("Please print valid Module no ie.(1-6)");
				}
				else {
	                System.out.printf("So here is your Roadmap for PCOM\n\n\n");
					System.out.println(chosenModule);
					System.out.println(chosenTopics.replace("\\n","\n"));
					System.out.print("Refrence Books:\nElectronic Communications Systems\n Modern Digital and Analog Communication Systems\nPrinciples of Communication Systems\n Link May you Refer  :-\n https://youtube.com/playlist?list=PL0s3O6GgLL5falRKBVe0tSRgp6Hud9oKm&feature=shared \n\n Refered pdf :- \n https://classroom.google.com/c/Mzk5NjU4MjYwMzY1/m/NTI5ODk5MzYxODY2/details");
            }
            }
                break;
            // MATHEMATICS3
            case 2: {
                System.out.printf("Which module you have to study\n\n");
                System.out.printf("1.Laplace Transform\n 2.Invers Laplace Transform\n 3.Fourier Series\n 4.Complex Variables\n 5.Statistical Technique\n 6.Probablity\n");
                System.out.printf("\nChoice of Chapter : ");
                int choice2 = sc.nextInt();
                String sqlQuery = "SELECT * FROM test.maths3 where Maths3ID=" + choice2 +";";
                String chosenModule = "";
                String chosenTopics = "";
				try(Connection serverConnection = DriverManager.getConnection(url, username, password);
						Statement stmt =  serverConnection.createStatement();
						ResultSet rs  =  stmt.executeQuery(sqlQuery)) {
					while(rs.next())
					{
					chosenModule = rs.getString("Module");
					chosenTopics = rs.getString("topics");
					}
				} catch (SQLException e) {;
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(chosenModule.length() == 0) {
					System.out.println("Please print valid Module no ie.(1-6)");
				}
				else {
	                System.out.printf("So here is your Roadmap for Mathematics3\n\n\n");
					System.out.println(chosenModule);
					System.out.println(chosenTopics.replace("\\n","\n"));
				    System.out.println("Refrence Books:\n\n Higher Engineering Mathematics\n Advanced Engineering Mathematics\n Complex Variables and Applications\n\n Link to refer:- \n https://youtube.com/@SAURABHDAHIVADKAR?feature=shared\n\nNote: Don't forget to solve Question Paper \n All the Best\n\n");
				}
            }
                break;
            // DSA
            case 3: {
                System.out.printf("\nWhich module you have to study\n");
                System.out.printf(
                        "1.Introduction to Stacks,Queues and Linked Lists\n 2.Trees\n 3.Graphs\n 4.Recursion and Storage Management\n 5.Searching and Sorting\n 6.Applications of Data Structures\n");
                System.out.printf("\nChoice of Chapter : ");
                int choice2 = sc.nextInt();
                String sqlQuery = "SELECT * FROM test.dsa where DSAid=" + choice2 +";";
                String chosenModule = "";
                String chosenTopics = "";
				try(Connection serverConnection = DriverManager.getConnection(url, username, password);
						Statement stmt =  serverConnection.createStatement();
						ResultSet rs  =  stmt.executeQuery(sqlQuery)) {
					while(rs.next())
					{
					chosenModule = rs.getString("DSAsubject");
					chosenTopics = rs.getString("topics");
					}
				} catch (SQLException e) {;
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(chosenModule.length() == 0) {
					System.out.println("Please print valid Module no ie.(1-6)");
				}
				else {
	                System.out.printf("So here is your Roadmap for DSA\n\n\n");
					System.out.println(chosenModule);
					System.out.println(chosenTopics.replace("\\n","\n"));
                System.out.print("Refrence Books:\n\n  C++; Prentice Hall of India\n Data Structures using C\n Data Structures through C in Depth\nLink to refer :- \n https://youtube.com/playlist?list=PLu0W_9lII9ahIappRPN0MCAgtOu3lQjQi&feature=shared");
				}
            }
                break;
            // PCPF
            case 4: {
                System.out.printf("\nWhich module you have to study\n");
                System.out.printf(
                        "1.introduction of Programming Paradigms & Core Language Design Issues\n 2.Imperative Paradigms: Data Abstraction in Object Orientation\n 3.Declarative Programming Paradigm: Functional Programming\n 4.Declaratve Programming Paradigm: Logical Programming\n 5.Alternative Paradigms: Concurrency\n 6.Alternative Paradigms: Scripting Languages\n");
                System.out.printf("\nChoice of Chapter : ");
                int choice2 = sc.nextInt();
                String sqlQuery = "SELECT * FROM test.pcpf where PCPFid=" + choice2 +";";
                String chosenModule = "";
                String chosenTopics = "";
				try(Connection serverConnection = DriverManager.getConnection(url, username, password);
						Statement stmt =  serverConnection.createStatement();
						ResultSet rs  =  stmt.executeQuery(sqlQuery)) {
					while(rs.next())
					{
					chosenModule = rs.getString("PCPFsubject");
					chosenTopics = rs.getString("topics");
					}
				} catch (SQLException e) {;
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(chosenModule.length() == 0) {
					System.out.println("Please print valid Module no ie.(1-6)");
				}
				else {
	                System.out.printf("So here is your Roadmap for PCPF\n\n\n");
					System.out.println(chosenModule);
					System.out.println(chosenTopics.replace("\\n","\n"));
                System.out.print("Refrence Books:\n\n Scott M L, Programming Language Pragmatics\n Concepts and Constructs\n Programming in Haskel\n\nLink to refer :- \n  https://youtu.be/oGOa_S4N0XU?feature=shared");
				}
            }
                break;
            // DBMS
            case 5: {
                System.out.printf("\nWhich module you have to study\n");
                System.out.printf(
                        "\n 1.Introduction\n 2.Entity Relational Data Model\n 3.Relational Data Model\n 4.Structured Query Language\n 5.Relational Database Design\n 6.Recovery\n");
                System.out.printf("\nChoice of Chapter : ");
                int choice2 = sc.nextInt();
                
                String sqlQuery = "SELECT * FROM test.dbms where DBMSid=" + choice2 +";";
                String chosenModule = "";
                String chosenTopics = "";
				try(Connection serverConnection = DriverManager.getConnection(url, username, password);
						Statement stmt =  serverConnection.createStatement();
						ResultSet rs  =  stmt.executeQuery(sqlQuery)) {
					while(rs.next())
					{
					chosenModule = rs.getString("DBMSsubject");
					chosenTopics = rs.getString("topics");
					}
				} catch (SQLException e) {;
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(chosenModule.length() == 0) {
					System.out.println("Please print valid Module no ie.(1-6)");
				}
				else {
					System.out.printf("\nSo here is your Roadmap for DBMS\n\n\n");
	                
					System.out.println(chosenModule);
					System.out.println(chosenTopics.replace("\\n","\n"));
					System.out.print("Refrence Books:\n\n Database System Concepts\n Fundamentals of Database Systems\n  Database Management Systems\n\nLink to refer :- \n https://youtube.com/playlist?list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&feature=shared");
				}
            }
                break;
            case 6:{
            	System.out.printf("Please enter valid Choice");
            	break;
            }
            default:       
        }
    }
    public static Connection createConnection() {
        String url = "jdbc:mysql://127.0.0.1:4306/test"; // pointing to no database.
        String username = "root";
        String password = "";
        System.out.println("Connecting to server...");
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Server connected!");
            return conn;
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the server!", e);
        }
    }
}