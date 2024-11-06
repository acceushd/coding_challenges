public class CountTrue {
    public int countTrue(boolean[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int trues = 0;
        for (boolean b : array) {
            trues += b ? 1 : 0;
        }
        return trues;
    }

    public static void main(String[] args) {
        CountTrue ct = new CountTrue();
        int tmp = 1;
        System.out.println(ct.countTrue(new boolean[]{true, false, false, true, false}));
        System.out.println(ct.countTrue(new boolean[]{false, false, false, false}));
        System.out.println(ct.countTrue(new boolean[]{}));
    }
}
