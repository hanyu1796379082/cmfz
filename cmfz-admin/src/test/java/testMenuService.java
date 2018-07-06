import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 14:12 2018/7/5
 * @Despriction
 */
public class testMenuService {

    ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
    @Test
    public void test1(){
        MenuService menuService = (MenuService) act.getBean("menuServiceImpl");
        List<Menu> menus = menuService.queryMenuByPId(0);
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }

    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        MenuService menuService = (MenuService) act.getBean("menuServiceImpl");
        List<Menu> menus = menuService.queryAllMenu();
        for (Menu menu : menus) {
            System.out.println(menu);
        }
    }
}
