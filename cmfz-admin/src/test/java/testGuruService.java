import com.baizhi.cmfz.entity.Guru;
import com.baizhi.cmfz.service.GuruService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URLEncoder;
import java.util.List;

/**
 * @Author 韩雨
 * @Time in 18:56 2018/7/7
 * @Despriction
 */
public class testGuruService {


    @Test
    public void test1(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        GuruService gs = (GuruService)act.getBean("guruServiceImpl");
        List<Guru> gurus = gs.queryGuru(1, 3);

        for (Guru guru : gurus) {
            System.out.println(guru);
        }
    }

    @Test
    public void test2() throws  Exception{
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        GuruService gs = (GuruService)act.getBean("guruServiceImpl");
        Guru guru = new Guru();
        guru.setName(URLEncoder.encode("盈盈仁波切","utf-8"));
        guru.setPhoto("123456");
        guru.setSummary(URLEncoder.encode("这是个好上师","utf-8"));
        int i = gs.addGuru(guru);
        System.out.println(i);
    }

    @Test
    public void test3() throws Exception{
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        GuruService gs = (GuruService)act.getBean("guruServiceImpl");
        Guru guru = new Guru();
        guru.setId(11);
        guru.setName(URLEncoder.encode("盈盈仁波切","utf-8"));
        guru.setPhoto("123456");
        guru.setSummary(URLEncoder.encode("这是个好上师","utf-8"));
        int i = gs.modifyGuru(guru);
        System.out.println(i);
    }
}
