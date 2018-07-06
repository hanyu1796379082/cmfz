import com.baizhi.cmfz.dao.ManagerDao;
import com.baizhi.cmfz.entity.Manager;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testMgtDao {

    @Test
    public void test1(){
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagerDao managerDao = (ManagerDao) act.getBean("managerDao");
        System.out.println(managerDao);
        Manager mgr = managerDao.selectByName("zs");
        System.out.println(mgr);
    }
    @Test
    public void test2(){
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
        ManagerDao managerDao = (ManagerDao) act.getBean("managerDao");
        List<Manager> managers = managerDao.selectAll();
        for (Manager manager : managers) {
            System.out.println(manager);
        }
    }
}
