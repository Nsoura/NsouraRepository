package Serveur;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
	public static void main(String[] args) {
		try{
			LocateRegistry.createRegistry(1099);
			//cree un objet de type RMI
			HelloImp obj = new HelloImp();
			
			//Binding sous le nom "HelloServer"
			Naming.rebind("rmi://localhost:1099/HelloServer", obj);
			System.out.println(obj.toString());
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
