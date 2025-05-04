package d24_proxy2;

/**
 * 用户接口
 */
public interface UserService {
    // 登录功能
    void login(String loginName, String passWord) throws Exception;

    // 删除用户
    void deleteUsers() throws Exception;

    // 查询用户，返回数组的形式。
    String[] selectUsers() throws Exception;
}
