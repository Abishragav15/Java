import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String user="AbishRagav";
		String pass="123abish";
		System.out.println("Enter the details to login");
		System.out.println("Enter the Username");
		String username=input.nextLine();
		System.out.println("Enter the Password");
		String password=input.nextLine();
		username=username.trim();
		password=password.trim();
		if(user.equalsIgnoreCase(username)) {
			if(pass.equals(password)) {
				System.out.println("Login Successful");
			}
			else {
				System.out.println("Wrong Password");
			}
		}
		else {
			System.out.println("Invalid username or Password");
		}
	}
}