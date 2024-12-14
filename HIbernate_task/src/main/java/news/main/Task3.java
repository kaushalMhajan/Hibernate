package news.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import news.utilities.OnetoManyUnidirectionalConfig;

public class Task3 {
	public static void main(String[] args) {
		try(
				SessionFactory  factory = OnetoManyUnidirectionalConfig.getSession();
				Session sessionObject = factory.openSession();
		){
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
