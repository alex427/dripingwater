package alex.learn.threads.threadlocals;

import java.util.HashMap;
import java.util.Map;

/**
 * author  : zhiguang
 * date    : 2018/7/23
 */
public class SimulateThread {

    //每个线程都有一个ThreadLocalMap, 它的key是线程自己的ThreadLocal
    private Map<Threadlocalss, String> map = new HashMap<>();

    private Threadlocalss threadlocalss;

    public String get(SimulateThread t){
        return this.map.get(t.threadlocalss);
    }

    public void set(String v){
        this.map.put(this.threadlocalss,v);
    }

    class Threadlocalss {
        public String get(){
            return map.get(this);
        }
    }


}

