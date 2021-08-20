import com.kaitan.dao.UserDaoImpl;
import com.kaitan.dao.UserDaoMySQLImpl;
import com.kaitan.service.UserService;
import com.kaitan.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
/*        //用户实际调用的是业务层，dao被嵌在了service中，不需要直接接触
        UserServiceImpl userService = new UserServiceImpl();*/

//        解决方案
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMySQLImpl());
        userService.getUser();
    }
}
