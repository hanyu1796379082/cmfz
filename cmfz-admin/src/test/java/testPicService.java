import com.baizhi.cmfz.entity.Picture;
import com.baizhi.cmfz.service.PictureService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

/**
 * @Author 韩雨
 * @Time in 9:09 2018/7/6
 * @Despriction
 */
public class testPicService {

    @Test
    public void test1(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        PictureService ps = (PictureService) act.getBean("pictureServiceImpl");

        List<Picture> pictures = ps.queryAllPic(1,4);
        for (Picture picture : pictures) {
            System.out.println(picture);
        }
    }
    @Test
    public void test2() throws UnsupportedEncodingException {
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        PictureService ps = (PictureService) act.getBean("pictureServiceImpl");
        Picture pic = new Picture();
        pic.setDate(new Date());
        pic.setPath("7.jpg");
        String a = "这是一个图片";
        String a1 = URLEncoder.encode(a, "utf-8");
        System.out.println(a1  +"    a1");
        pic.setDescrip(a1);
        pic.setStatus("0");
        int i = ps.addPic(pic);
        System.out.println(i);
        System.out.println(URLDecoder.decode(a1,"utf-8"));
    }
}
