package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import pojo.User;
import service.UserService;
import utils.ConnUtil;

/**
 * ����ҳ�沼�ֺ��߼����
 * @author QinGuangrui
 *
 */

public class IndexAction {
	static Scanner sc=new Scanner(System.in);
	static RegisteAction registeAction=new RegisteAction();
	static LoginAction login=new LoginAction();
	static SelectAction select=new SelectAction();
	static User u=new User();
	static UserService us=new UserService();
	public static ConnUtil connUtil=new ConnUtil();
	public static Connection conn=connUtil.getConn();
	/**
	 * ��ӭҳ��
	 * 
	 */
	public void index() {
		
		System.out.println("========��ӭʹ���û�����ϵͳ========");
		System.out.println("����������ѡ�����¹��ܣ�");
		System.out.println("1:���û���¼");
		System.out.println("2:ע�����û�");
		System.out.println("3.�˳�ϵͳ");
		System.out.println("==================================");
		String i=sc.next();
		int userId=0;
		switch(i){
			case "1": 
				userId=login.login(u);
				afterLogin(userId);
				break;
			case "2": 
				registeAction.userRegister();
				System.out.println("==================================");
				System.out.println("ע��ɹ�����ѡ���Ƿ�ʹ�ô�ϵͳ��");
				System.out.println("ʹ���밴Y��y��");
				System.out.println("��ʹ���밴������˳�");
				System.out.println("==================================");
				String str=sc.next();
				if("Y".equals(str)	||	"y".equals(str)){
					index();
				}else{
					System.exit(0);
				}
				break;
			case "3": 
				System.exit(0);
				break;
			default: 
				System.out.println("�����������������룡");
				index();
		}
	}
	/**
	 * ��¼�ɹ�֮����н�ɫ�ж�
	 * @param userId
	 */
	public  void afterLogin(int userId) {
		String role="";
		if(userId!=0){
			System.out.println("��¼�ɹ�");
			String sql="select rolename from u_role where userid = ?";
			try {
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, userId);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					role=rs.getString("rolename");
					System.out.println("��Ľ�ɫ��"+role);
					System.out.println("==================================");
					break;
				}
			} catch (SQLException e) {
				//e.printStackTrace();
			}
			loginIndex(role);
		}else{
			index();
		}
	}
	/**
	 * ��ɫ�жϺ������ز���
	 * @param role
	 */
	public  void loginIndex(String role) {
		boolean flag=true;
		while(flag){
			System.out.println("==========��ѡ�����¹���============");
			if(role.equals("admin")){
				System.out.println("1.��ѯ�û���Ϣ");
				System.out.println("2.�޸��û���Ϣ");
				System.out.println("3.ɾ���û���Ϣ");
				System.out.println("4.ע�����û�");
				System.out.println("5.�˳���ǰ��¼");
				System.out.println("==================================");
				int a=sc.nextInt();
				switch(a){
				case 1:
					selectIndex(role);
					break;
				case 2:
					us.updateById(u);
					break;
				case 3:
					us.deleteById(u);
					break;
				case 4:
					registeAction.register();
					break;
				case 5:
					u.setUserName(null);
					index();
					flag=false;
					break;
				}
			}else if(role.equals("user")){
				System.out.println("1.��ѯ�û���Ϣ");
				System.out.println("2.�޸��û���Ϣ");
				System.out.println("3.�˳���ǰ��¼");
				System.out.println("==================================");
				int a=sc.nextInt();
				switch(a){
				case 1:
					us.selectInfo(u);
					break;
				case 2:
					us.updateByUser(u);
					break;
				case 3:index();
					flag=false;
					break;
				}
			}else{
				System.out.println("�޴˽�ɫ");
			}
		}
		
	}
	/**
	 * ����Ա�� ��ѯ����
	 * 
	 */
	public  void selectIndex(String role) {
		boolean flag=true;
		while(flag){
			System.out.println("=========��ѡ�����¹���=============");
			System.out.println("1.��ѯȫ���û���Ϣ");
			System.out.println("2.�����û�ID��ѯ�û���Ϣ");
			System.out.println("3.�����û�IDģ����ѯ�û���Ϣ");
			System.out.println("4.�����û�����ѯ�û���Ϣ");
			System.out.println("5.�����û���ģ����ѯ�û���Ϣ");
			System.out.println("6.�˳���ѯ");
			System.out.println("==================================");
			int b=sc.nextInt();
			switch(b){
			case 1: 
				select.selectAll();
				break;
			case 2:
				select.selectById();
				break;
			case 3:
				select.selectByIds();
				break;
			case 4:
				select.selectByUserName();
				break;
			case 5:
				select.selectByUserNames();
				break;
			case 6:
				loginIndex(role);
				flag=false;
				break;
			}
		}
		
	}

	
}
