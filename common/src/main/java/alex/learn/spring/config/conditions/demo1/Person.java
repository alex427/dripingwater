package alex.learn.spring.config.conditions.demo1;

/**
 * Created by zhiguang on 2018/6/18.
 */

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
