package cn.ziroom.mybatis.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ziroom.mybatis.mapper.UserMapper;
import cn.ziroom.mybatis.pojo.User;
import cn.ziroom.mybatis.pojo.UserVO;

/**   
 * @Title UserMapperTest.java 
 * @Package cn.ziroom.mybatis.test 
 * @Description: ͨ��mapper��ʽ����User
 * @author dfx  
 * @date 2015-11-9 ����2:30:10 
 * @version V1.0   
 */
public class UserMapperTest {

	ApplicationContext applicationContext ;
	@Before
	public void before() throws IOException{
		applicationContext = new ClassPathXmlApplicationContext("beans.xml");
	}
	/**
	 * @desc id��ѯ�û�
	 * @throws Exception
	 */
	@Test
	public void getUserById() throws Exception {
		UserMapper mapper = applicationContext.getBean(UserMapper.class);
		User user = mapper.getUserById("3bc7be81-9340-11e5-a56c-40f02fef381a");
		System.out.println(user);
	}
	
	@Test
	public void insertUser() throws Exception{
		UserMapper mapper = applicationContext.getBean(UserMapper.class);
		User user = new User();
		user.setName("����");
		user.setSex("1");
		user.setAge(23);
		user.setBirthday(new Date());
		user.setAddr("������ͬ");
		mapper.insertUser(user);
	}
	
	@Test
	public void updateUser() throws Exception{
		UserMapper mapper = applicationContext.getBean(UserMapper.class);
		User user = mapper.getUserById("a3677f6c-86c2-11e5-9518-40f02fef381a");
		user.setName("����");
		user.setSex("2");
		user.setAge(24);
		user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1992-09-08"));
		user.setAddr("�����Ȫ����");
		mapper.updateUser(user);
	}
	
	@Test
	public void deleteUserById() throws Exception{
		UserMapper mapper = applicationContext.getBean(UserMapper.class);
		String userId = "35b61b47-86c4-11e5-9518-40f02fef381a";
		mapper.deleteUserById(userId);
	}
	
	@Test
	public void getUserByfields() throws Exception{
		UserMapper mapper = applicationContext.getBean(UserMapper.class);
		UserVO userVO = new UserVO();
		User user = new User();
		user.setName("%��%");
		//user.setSex("1");
		userVO.setUser(user);
		List<User> list = mapper.getUserByfields(userVO);
		System.out.println(list.size());
	}
	
	@Test
	public void getUserByName() throws Exception{
		UserMapper mapper = applicationContext.getBean(UserMapper.class);
		List<String> names = new ArrayList<String>();
		names.add("����");
		names.add("��С��");
		names.add("�Ŵ���");
		List<User> list = mapper.getUserByName(names);
		System.out.println(list);
	}

}
