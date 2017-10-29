package jmx;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by Mateusz on 29.10.2017.
 */

/**
 * https://stackify.com/jmx/
 *
 * uruchomienie: jconsole <PID>java-
 *               jconsole
 * */
public class Main {
    public static void main(String[] args) throws  Exception{
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("jmx:type=Game");

        GameMBean userMBean = new Game();
        userMBean.setPlayerName("Mati");

        mBeanServer.registerMBean(userMBean, name);

        Thread.sleep(Long.MAX_VALUE);
    }
}
