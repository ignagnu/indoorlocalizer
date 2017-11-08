

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.uni.pwm.indoorlocalizer.model.Utente;
import it.uni.pwm.indoorlocalizer.model.UtenteDao;
import it.uni.pwm.indoorlocalizer.model.UtenteDaoFactory;
import it.uni.pwm.indoorlocalizer.util.HibernateUtil;

public class MainTest {
	private static Logger log= LogManager.getLogger("");
	
	public static void main(String[] args) {
	
		
		Utente u = new Utente();
		u.setAbilitato((byte) 1);
		u.setNome("ciccio");
		u.setEmail("sspeie@sa.iu");
		u.setCognome("cicciu");
		u.setPwd("sss");
		UtenteDao utenteDao=UtenteDaoFactory.getDAO();
		utenteDao.create(u);
		HibernateUtil.close();
	}

}
