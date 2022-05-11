public class Main {
    public static void main(String[] args) {

        int[] myArr = {5, 8, 1};
        int[] myArr2 = null;

        try {
            GetSecondMax.getSecondMax(myArr2);
        } catch (NullArrayException e) {
            e.printStackTrace();
        }
        System.out.println("Still running..."); // still running test

        //        getSecondMax(myArr2);
        //System.out.println("Still running..."); // still running test
    }
}
