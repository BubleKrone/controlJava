import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class work{
    public OperatingSystemMXBean mbean =
            (com.sun.management.OperatingSystemMXBean)
                    ManagementFactory.getOperatingSystemMXBean();
    public long getMaxRam()
    {
        long max=0;
        long max_size = mbean.getTotalPhysicalMemorySize();
        max=max_size/1048576;
        return max;
    }
    private long getAvailableRam()
    {
        long available = 0;
        long turl = 0;
        long available_size = mbean.getFreePhysicalMemorySize();
        available =  available_size/1048576;
        return available;
    }
    public double PercentRamLoad()
    {
        double s = getAvailableRam();
        double h = getMaxRam();
        return  (s/h)*100;
    }

}