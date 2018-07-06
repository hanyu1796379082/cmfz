import com.baizhi.cmfz.dao.MenuDao;
import com.baizhi.cmfz.entity.Menu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 14:02 2018/7/5
 * @Despriction
 */
public class testMenuDao {
    @Test
    public void test1(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        MenuDao menuDao = (MenuDao) act.getBean("menuDao");
        List<Menu> menus = menuDao.selectAllByPid(1);
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
}
