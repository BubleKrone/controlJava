import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class cpuZ {
    OperatingSystemMXBean mbean =
            (com.sun.management.OperatingSystemMXBean)
                    ManagementFactory.getOperatingSystemMXBean();
    public double CpuTime()
    {
        mbean.getProcessCpuTime();
        Long cpuTime = mbean.getProcessCpuTime();

        return cpuTime.doubleValue();
    }
    public double Load()
    {
        mbean.getSystemCpuLoad();
        try
        {
            Thread.sleep(100);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
        return mbean.getSystemCpuLoad()*100;
    }

}
