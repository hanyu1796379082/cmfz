import com.baizhi.cmfz.dao.AreaDao;
import com.baizhi.cmfz.entity.Area;
import com.baizhi.cmfz.service.AreaService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 20:21 2018/7/9
 * @Despriction
 */
public class testAreaService {

    @Test
    public void test1(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        AreaDao as  = (AreaDao) act.getBean("areaDao");
        List<Area> areas = as.selectArea("0");

        for (Area area : areas) {
            System.out.println(area);
        }
    }
    @Test
    public void test2(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        AreaService as = (AreaService) act.getBean("areaServiceImpl");
        List<Area> areas = as.queryArea("1");
        for (Area area : areas) {
            System.out.println(area);
        }
    }
}
