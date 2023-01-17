public class For_2 {

    public static void main(String[] args) {

        int [] arr1 = {10, 20, 30, 40, 50};
        int sum = 0;

        for(int i = 0; i < arr1.length; i++){
            System.out.printf("%d ", arr1[i]);
        }
        System.out.println();

        for(int tmp : arr1){
            System.out.printf("%d ", tmp);
            sum += tmp;
        }
        System.out.println();
        System.out.println("sum = " + sum);

    }

}
