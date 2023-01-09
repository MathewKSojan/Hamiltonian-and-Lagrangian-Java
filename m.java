import java.util.*;
public class m{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[input.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]<arr[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(arr[i]);
            }
            flag=false;
    }
}
}
