package cn.ziroom.mybatis.pojo;

import java.util.Date;

/**
 * @Title User.java
 * @Package cn.ziroom.mybatis.pojo
 * @Description: �û�ʵ��
 * @author dfx
 * @date 2015-11-9 ����2:19:17
 * @version V1.0
 */
public class User {

	private String id;		//Ψһ��ʾ
	private String name;	//����
	private String sex;		//�Ա�
	private Integer age;	//����
	private Date birthday;	//����
	private String addr;	//סַ
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
