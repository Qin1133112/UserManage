package control;

import model.PowerDao;
import pojo.Power;

public class PowService {
	
	
	PowerDao powDao=new PowerDao();

	/**
	 * 增加用户权限
	 * @param u
	 * @return flag
	 */
	
	public boolean addPow(Power p){
		return powDao.addPow(p);
	}
}
