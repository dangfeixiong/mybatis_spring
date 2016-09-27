package cn.ziroom.mybatis.mapper;


import java.util.List;

import cn.ziroom.mybatis.pojo.User;
import cn.ziroom.mybatis.pojo.UserVO;

/**   
 * @Title UserMapper.java 
 * @Package cn.ziroom.mybatis.mapper 
 * @Description: UserDaoʵ�� 
 * @author dfx  
 * @date 2015-11-9 ����2:32:01 
 * @version V1.0   
 */
public interface UserMapper {

	/**
	 * ͨ��userId��ѯ�û�
	 */
	public User getUserById(String id) throws Exception ;
	
	/**
	 * ����û�
	 */
	public void insertUser(User user) throws Exception ;
	
	/**
	 * �޸��û�
	 */
	public void updateUser(User user) throws Exception ;
	
	/**
	 * ɾ���û�
	 */
	public void deleteUserById(String id) throws Exception ;
	
	/**
	 * ��������ѯ
	 */
	public List<User> getUserByfields(UserVO userVO) throws Exception ;
	
	/**
	 * foreach��ѯ
	 */
	public List<User> getUserByName(List<String> names) throws Exception ;
}
