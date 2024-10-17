import java.util.Arrays;

public class PingPong {
    public static String[] pingPong(String[] pongs, boolean win) {
        int length = win ? pongs.length * 2 : pongs.length * 2 - 1;
        String[] result = new String[length];
        int index = 0;
        for (int i = 0; i < pongs.length; i++) {
            result[index++] = "Ping!";
            if (index < result.length) {
                result[index++] = "Pong!";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pingPong(new String[]{"Ping!"}, true)));
        System.out.println(Arrays.toString(pingPong(new String[]{"Ping!", "Ping!"}, false)));
        System.out.println(Arrays.toString(pingPong(new String[]{"Ping!", "Ping!", "Ping!"}, true)));
    }
}
