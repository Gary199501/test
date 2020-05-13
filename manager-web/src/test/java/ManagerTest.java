import com.itheima.mapper.UsersMapper;
import com.itheima.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description: PACKAGE_NAME
 * @Author GARY
 * @Version V1.0.0
 * @Date 2020/5/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){
        Users users = new Users();
        users.setUserage(20);
        users.setUsername("admin");
        this.usersMapper.insertUser(users);
    }

    @Test
    public void selectUserAll(){
        List<Users> users = this.usersMapper.selectUserAll();
        for (Users user:
             users) {
            System.out.println(user.getUsername() + "-->" + user.getUserage());
        }
    }
}
