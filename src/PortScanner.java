import java.net.Socket;

public class PortScanner{
        public static void main(String[] args) {
            for (int i = 1; i <= 65535; i++) {
                try {
                    Socket socC1ient = new Socket("localhost", i);
                    System.out.println("Service active on " + i);
                    socC1ient. close();
                } catch (Exception e) {
                    //System. out. println("No Service on port");
                }
            }
        }
}