import com.shopping.dao.IUserDao;
import com.shopping.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class test {
    @Autowired
    private IUserDao dao;

    @Test
    public void testSelectUser() throws Exception {
        int id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }

    @Test
    public void testCheckUser() throws Exception {
        String username = "123";
        String password = "1234";
        User user = dao.checkUser(username,password);
        System.out.println(user.getUsername());
    }


}
