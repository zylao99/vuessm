import com.itheima.dao.IUserDao;
import com.itheima.daomain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.security.krb5.internal.tools.Klist;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Usertest {
    @Autowired
    private IUserDao iUserDao;

    @Test
    public void  findAll(){
        List list = iUserDao.findAll();
        System.out.println(list);
    }
     @Test
    public  void findById(){
         User user = iUserDao.findById(1);
         System.out.println(user);

     }
    @Test
    public  void  updateUser(){
       User user = iUserDao.findById(1);
        System.out.println(user );
       user.setAge(353);
         iUserDao.updateUser(user);
        User user1 = iUserDao.findById(1);
        System.out.println(user1);
    }
}
