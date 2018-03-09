package Client;

import java.rmi.Naming;

import Serveur.Hello;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello obj;
		String message;
		try{
			//obj de type hello
			obj = (Hello)Naming.lookup("rmi://localhost:1099/HelloServer");
				
			//message de type String
			message = obj.sayHello();
			System.out.println(message);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
