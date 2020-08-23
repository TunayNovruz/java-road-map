package GC;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Random;

public class GarbageCollector {
    public static void main(String[] args) {
        visualVmTest();
        //getGCInfo();
        System.gc();
    }

    public static void getGCInfo() {
        List<GarbageCollectorMXBean> list = ManagementFactory.getGarbageCollectorMXBeans();
        for (GarbageCollectorMXBean bean : list) {
            System.out.println(bean.getName());
            System.out.println(bean.getCollectionCount());
            System.out.println(bean.getCollectionTime());
            for (String name : bean.getMemoryPoolNames()) {
                System.out.println(name);
            }
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
            }
            System.out.println("-------------------------");
        }
    }

    /***
     *
     */
    public static void visualVmTest() {
        bigObj objs[] = new bigObj[10000000];
        for (int i = 0; i <10000000 ; i++) {
            objs[i] = new bigObj();
            var a = new Random();
            try{
                Thread.sleep(1);
            }catch (Exception e){}
        }
    }
}


class bigObj{
    long a;
    long aa;
    long aaa;
    long aassa;
    long aassdda;
    long aassdddda;
    long aassdddddda;
    long aassdddddddda;
    long aassdddddddddda;
    long aassdddddddddddda;
    long aassddddddddddddddda;
    long aassdddddddddddddda;
    long aassddddddddddddda;
}
