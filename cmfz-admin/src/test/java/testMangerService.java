import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class testMangerService {

    @Test
    public void test1(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ManagerService ms = (ManagerService) act.getBean("managerServiceImpl");
        Manager zs = ms.queryByName("管1");
        char a = '管';
        char b = '1';
        System.out.println(a);
        System.out.println(b);
        int c = a ;
        String encode = null;
        String encode1 = null;
        try {
            encode = URLEncoder.encode("你号", "utf-8");
            encode1 = URLDecoder.decode("encode", "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(encode);
        System.out.println(encode1);
        System.out.println(c);
        System.out.println(zs);
    }
}
