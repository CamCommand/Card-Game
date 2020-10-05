public class main {
    private static void Director(boolean director) {
        if (director) {
            //disable the option to add to scenarios and then pick a winner once timer runs out
        }
    }

    public static void main(String[] args) {
        int time_interval = 100;
        while (time_interval > 0) {
            //System.out.println("Timer: " + time_interval);
            try {
                time_interval--;
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                System.out.println("BIG ERROR...please retry your game instance.");
            }
        }

        boolean director = false;
        //something to pass director on to other players
        Director(director);
    }
}