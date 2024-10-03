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
        boolean[] array = new boolean[10000];
        for (int i = 0; i < array.length; i += 2) {
            array[i] = true;
        }
        for (int i = 1; i < array.length; i += 2) {
            array[i] = false;
        }

        System.out.println(ct.countTrue(new boolean[]{true, false, false, true, false}));
        System.out.println(ct.countTrue(new boolean[]{false, false, false, false}));
        System.out.println(ct.countTrue(new boolean[]{true, true, true, true, true}));
        System.out.println(ct.countTrue(new boolean[]{true, true, true, false, true}));
        System.out.println(ct.countTrue(new boolean[]{}));
        System.out.println(ct.countTrue(new boolean[]{false, false, true, false, true}));
        System.out.println(ct.countTrue(array));
    }
}
