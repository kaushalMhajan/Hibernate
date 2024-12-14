package inventory.entity.utilities;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import inventory.entity.Product;

public class ProgrammaticConfiguration {
		
	public static SessionFactory getSession() {
		Configuration conf = new Configuration();
		Properties hibernateProps = new Properties();
		
		hibernateProps.put("hibernate.connection.url","jdbc:mysql://localhost:3306/bollywood");
		hibernateProps.put("hibernate.connection.username","root");
		hibernateProps.put("hibernate.connection.password","password");
		hibernateProps.put("hibernate.show_sql","true");
		hibernateProps.put("hibernate.hbm2ddl.auto","update");
		
		conf.setProperties(hibernateProps);
		conf.addAnnotatedClass(Product.class);
		SessionFactory factory = conf.buildSessionFactory();
		return factory;
	}
}
