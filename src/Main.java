import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Mảng 1 chiều
        // khởi tạo mảng theo cách 1
        String[] arrString = {"Hùng","Nam","Anh"}; // có 3 phần tử
        // cách 2
//        int[] arrInt = new int[100];
        // có 100 phần từ nhưng tất các phần tử đều mang giá trị mặc định là 0
        int[] arrInt = {1,6,9,3,5,2};
        // lấy ra giá trị phần tử
        System.out.println("giá trị phần tử tại vị trí index = 2 là "+arrString[2]);
        // thay đổi giá trị của phần tử tại vị trí index
        arrString[1] = "Ngọc Anh";
        System.out.println("giá trị phần tử tại vị trí index = 1 là "+arrString[1]);
        System.out.println("Độ dài của mảng là "+arrString.length); // thuộc tính duy nhất
        // duyệt mảng
        for (int i = 0; i < arrString.length; i++) {
            System.out.println("Phần tử thứ index = "+i+" có giá trị = "+arrString[i]);
        }
        // foreach
        System.out.println("duyêt mảng theo foreach");
        for (int number : arrInt){ // duyệt theo giá trị
            System.out.println(number);
        }
         String[] cloneArrString = arrString.clone(); // phương thức clone tạo vùng nhớ mới
//        arrString[0] = null;

        for (int i = 0; i < cloneArrString.length; i++) {
            System.out.println("Phần tử thứ index = "+i+" có giá trị = "+cloneArrString[i]);
        }


        // lớp Arrays
//        System.out.println(arrString);
        System.out.println(Arrays.toString(arrString)); // chuyển 1 đối tượng array thành dạng chuỗi
        String[] copyArray1 = Arrays.copyOfRange(arrString,1,3);
        String[] copyArray2 = Arrays.copyOf(arrString,arrString.length);
        System.out.println(Arrays.toString(copyArray2));

        Arrays.sort(arrString, Comparator.reverseOrder()); // mặc định là chuỗi a->z , là số -> tăng dần
//        Arrays.sort(arrInt);
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = i; j <arrInt.length ; j++) {
                if(arrInt[i]>arrInt[j]){
                    int temp = arrInt[i];
                    arrInt[i] =arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp lá : "+Arrays.toString(arrString));
        System.out.println("Mảng sau khi sắp xếp lá : "+Arrays.toString(arrInt));

        // mảng 2 chiều : mảng lồng mảng
        int[][] arrayInteger = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2  = new int[3][3];
        // truy cập 1 phàn tử của mảng
        arrayInteger[1][2] =100;
        System.out.println("Phần tử tại vị trí i = 1,j = 2 là "+arrayInteger[1][2]);
        // duyệt mảng
        for (int i = 0; i < array2.length; i++) {
//            int[] element =  arrayInteger[i];
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(" "+array2[i][j]+" ");
            }
            System.out.println();
        }
    }
}