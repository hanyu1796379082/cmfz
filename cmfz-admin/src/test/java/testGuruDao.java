import com.baizhi.cmfz.dao.GuruDao;
import com.baizhi.cmfz.entity.Guru;
import com.baizhi.cmfz.service.GuruService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @Author 韩雨
 * @Time in 19:06 2018/7/7
 * @Despriction
 */
public class testGuruDao {
    @Test
    public  void test1() throws UnsupportedEncodingException {
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        GuruDao gd= (GuruDao) act.getBean("guruDao");
        Guru guru = new Guru();
        guru.setName(URLEncoder.encode("盈盈仁波切","utf-8"));
        guru.setPhoto("123456");
        guru.setSummary(URLEncoder.encode("这是个好上师","utf-8"));
        int i = gd.insertGuru(guru);
        System.out.println(i);
    }

    @Test
    public void test2(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        GuruDao gd= (GuruDao) act.getBean("guruDao");
        List<Guru> gurus = gd.selectGuruByFname("仁", 0, 2);
        for (Guru guru : gurus) {
            System.out.println(guru);
        }
    }
    @Test
    public void test3(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        GuruDao gd= (GuruDao) act.getBean("guruDao");
        int count = gd.selectGuruByFnameCount("仁");
        System.out.println(count);
    }
}
