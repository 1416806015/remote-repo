package d28_api_object;

import java.util.PrimitiveIterator;
// Cloneable 是一个标记接口
public class User  implements Cloneable{
    private int id;
    private String username;
    private String password;
    private double[] scores;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // super去调用父类Object中的clone方法
        User u2= (User) super.clone();
        u2.scores=u2.scores.clone();
        return u2;
    }

    public User() {
    }

    public User(int id, String username, String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScores() {
        return scores;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }
}
