package news.utilities;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import news.entities.Article;
import news.entities.Writer;

public class OnetoManyUnidirectionalConfig {
	public static SessionFactory getSession() {
		Configuration conf = new Configuration();
		
		Properties hibernateProps = new Properties();
		
		hibernateProps.put("hibernate.connection.url","jdbc:mysql://localhost:3306/sports");
		
		hibernateProps.put("hibernate.connection.username","root");
		
		hibernateProps.put("hibernate.connection.password","root");
		
		hibernateProps.put("hibernate.show_sql","true");
		
		hibernateProps.put("hibernate.hbm2ddl.auto","update");
		
		conf.setProperties(hibernateProps);
		conf.addAnnotatedClass(Article.class);
		conf.addAnnotatedClass(Writer.class);
		
		SessionFactory factory = conf.buildSessionFactory();
		
		return factory;
	}
}
