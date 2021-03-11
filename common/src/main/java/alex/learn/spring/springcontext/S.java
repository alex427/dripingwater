package alex.learn.spring.springcontext;

import org.springframework.context.ApplicationContext;

/**
 * author  : zhiguang
 * date    : 2018/7/6
 */
public class S   {

    public int a=1;
    private  ApplicationContext applicationContext = null;
    private ResourceReader reader;



    public S() {
    }

    public String getFromIoc() {
        System.out.println("conext:  "+ ApplicationContextProvider.getApplicationContext());
        this.reader = ApplicationContextProvider.getBeanByBeanClass(ResourceReader.class);
        System.out.println("reader:  "+this.reader);
        return this.reader.getLastName();
    }



}
