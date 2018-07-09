import com.baizhi.cmfz.entity.Article;
import com.baizhi.cmfz.service.ArtService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author 韩雨
 * @Time in 15:55 2018/7/9
 * @Despriction
 */
public class testArtService {

    ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
    @Test
    public void test1(){
        ArtService artServiceImpl = (ArtService) act.getBean("artServiceImpl");
        Article ac = new Article();
        ac.setIntroduction("好人");
        ac.setName("zs");
        ac.setGuruid(1);
        ac.setDate(new java.util.Date());
        ac.setPic("1.jpg");

        int result = artServiceImpl.addArt(ac);
        System.out.println(result);
    }
}
