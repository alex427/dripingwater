package alex.learn.base.referencee;

/**
 * author  : zhiguang
 * date    : 2018/7/23
 */
public class Dog {
    private String name;
    private String home;

    public Dog(String name, String home) {
        this.name = name;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
