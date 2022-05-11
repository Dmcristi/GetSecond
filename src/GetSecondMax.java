public class GetSecondMax {
    public static void getSecondMax(int[] arr) throws NullArrayException {

//        //update in case of null array
//        if (arr == null) {
//            System.out.println("Array is null!");
//            return; //to exit the getSecondMax method
//        }  //This also works!

        //update in case of null array
        if (arr == null) {
            throw new NullArrayException("Null array!");
        }

        //if the arr has 1 element print this
        if (arr.length < 2) {
            System.out.println("No second max value was found");
            return; //to exit the getSecondMax method
        }

        int largeNr = Integer.MIN_VALUE;
        int secondLargeNr = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largeNr) {
                secondLargeNr = largeNr;
                largeNr = arr[i];
            }
            if (arr[i] != largeNr && arr[i] > secondLargeNr) {
                secondLargeNr = arr[i];
            }
        }

        if (secondLargeNr == Integer.MIN_VALUE) {
            System.out.println("No second max value was found");
        } else {
            System.out.printf("Second max number is %d", secondLargeNr);
        }
    }
}
