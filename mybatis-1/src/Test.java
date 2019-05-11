import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import domain.User;

public class Test {
	public static void main(String[] args) {
		
		
		String resource="File.xml";
		InputStream is=Test.class.getClassLoader().getResourceAsStream(resource);
		
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
		SqlSession session=sessionFactory.openSession();
		String statment="mapping.Usermapping.getUser";
		User user=session.selectOne(statment,2);
		//User user1=session.selectOne(statment,2);
		//System.out.println(user);
		System.out.println(user);
	}
}
