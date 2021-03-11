package alex.learn.web.domains;

import javax.persistence.*;
import java.io.Serializable;

/**
 * author  : zhiguang
 * date    : 2018/7/9
 */
@Entity(name="user")
public class User implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private int gender;

    @Column(name = "job")
    private String job;

    @Column(name = "city")
    private String city;

    @Column(name = "salary")
    private int salary;

    @Column(name = "bonus")
    private int bonus;

    public User() {
    }

    public User(int id, String name, int gender, String job, String city, int salary, int bonus) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.city = city;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "User {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", job='" + job + '\'' +
                ", city='" + city + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
