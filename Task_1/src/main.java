public class main{

    public static void main(String[] args) {
        work ram = new work();
        cpuZ cpu = new cpuZ();
        graf pols = new graf();
        double nerd = cpu.Load();
        double yard = ram.PercentRamLoad();


        while (true) {
            pols.ShowRAMCo(pols.Chart(pols.StatusBar(ram.PercentRamLoad())));
            for(int io = 0; io < 10; io++){
                System.out.println();
            }
        }

        //while (true) {
          //  System.out.print((int)cpu.Load()+"%\t");
            //pols.ShowCPU(pols.Chart(pols.StatusCPUBar(cpu.Load())));
        //}
    }
}