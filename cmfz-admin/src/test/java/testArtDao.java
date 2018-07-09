import com.baizhi.cmfz.dao.ArticleDao;
import com.baizhi.cmfz.entity.Article;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author 韩雨
 * @Time in 10:29 2018/7/9
 * @Despriction
 */
public class testArtDao {

    @Test
    public void test1(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ArticleDao articleDao = (ArticleDao) act.getBean("articleDao");
        List<Article> articles = articleDao.selectAnyArt("name", "上师", 0, 3);
        System.out.println(articles);
    }
}
