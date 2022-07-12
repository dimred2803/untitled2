public class Main {
    public static void main(String[] args) {

        int[] myArray = {1, 4, 5, 1, 1, 3};
        for (int i = 0; i < myArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < myArray.length; j++) {
                if(myArray[i] == myArray[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(myArray[i]);
                break;
            }
        }
    }
}