import java.util.Arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {

        int p[] = {1, 4, 5, 2, 3, 22, 31, 2};
        int q[] = new int[p.length - 1];//we create new array length-1 or whatever your deleting
        int count = 0;
        for (int e : p) {
            if (!(e == 22)) {
                q[count] = e;
                count++;
            }
        }
        System.out.println(Arrays.toString(q));
        //Copying one array from another array
        int a[] = {1, 4, 5, 2, 3, 22, 31, 2};
        int b[]=new int[a.length];
        int c=0;
        for (int e:a){
            b[c]=e;
            c++;
        }
        System.out.println(Arrays.toString(b));
    }

}
