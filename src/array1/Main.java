package array1;

public class Main {
    public static void main(String[] args) {
        String [] abc = new String [ 10];
        System.out.println(abc.length);
        int[] wheights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        wheights[0] = 90;
        int januaryWeight = wheights[0];
        System.out.println(januaryWeight);
        System.out.println(wheights[0]);
        System.out.println(wheights[4]);
//        System.out.println(wheights[13]);
        int january = 0;
        System.out.println(wheights[january]);
        for (int i = 0; i < wheights.length; i++) {
            System.out.println(wheights[i]);

        }
    }
}
