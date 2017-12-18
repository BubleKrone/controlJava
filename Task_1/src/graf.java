public class graf {
    public char[] StatusBar(double PercentOfSmt)
    {
        char[] bar = new char[102];

        for(int i = 0; i < 100;i++)
        {
            bar[i]='|';
        }
        for (Double i=new Double(101-PercentOfSmt);i<101;i++) {
            bar[i.intValue()] = '-';
        }
            return bar;
    }
    public char[] StatusCPUBar(double PercentOfSmt)
    {
        char[] bar = new char[102];

        for(int i = 0; i < 100;i++)
        {
            bar[i]='-';
        }
        for (Double i=new Double(100-PercentOfSmt);i<100;i++) {
            bar[i.intValue()] = '|';
        }
        return bar;
    }
    public  char[] Chart(char[] Bottom) {

        char[] chart = new char[102];

        for(int j = 0; j < 101 ; j++){
                chart[j] = Bottom[j];
        }
        return chart;
    }
    public  void ShowRAMCo(char[] chart)
    {
        cpuZ c = new cpuZ();
        work ram = new work();
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";
            for (int i = 0; i < 101; i++) {
                System.out.print(chart[i]);
            }
        System.out.print("  *  "+"RAM_Load "+  ANSI_RED +(100 - (int)ram.PercentRamLoad())+ ANSI_RESET+"%");
        System.out.print(" RAM_Free "+   ANSI_RED +(int)ram.PercentRamLoad()+ ANSI_RESET+"%");
        System.out.print(" RAM_Max "+  ANSI_RED + ram.getMaxRam()   + ANSI_RESET);
        System.out.print(" # "+"CPU_Time " + ANSI_RED + c.CpuTime() / 1000000000 + ANSI_RESET);
        System.out.println(" CPU_Load " + ANSI_RED +(int)c.Load()+ ANSI_RESET+"%");
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
    }
    public  void ShowCPU(char[] chart){

        cpuZ cp = new cpuZ();
        graf pols = new graf();

            for(int j = 101; j > 0; j--) {
                System.out.print(chart [j]);
            }
            System.out.println();
        try
        {
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            // this part is executed when an exception (in this example InterruptedException) occurs
        }
    }
}