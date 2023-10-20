import java.util.Arrays;
import java.util.logging.SocketHandler;

public class HandleString {
    public static void main(String[] args) {
        // Lớp đại diện cho chuỗi
        String fullName = "Rikkei Academy"; // kiểu dữ liệu tham chiếu
        String fakeName = "Hùng";// chung địa chỉ tham chiếu
        System.out.println(fullName.equals(fakeName));
        System.out.println(fullName);
//        String str1 = new String("Rikkei Academy");
        String str2 = new String("Rikkei Academy");
        System.out.println(fullName.equals(str2));
        str2 = "Nam"; // bất cứ sự thay đổi giá trị nào của String đều tạo ra vùng nhớ mới
        System.out.println(fullName); // Rikkei Academy
        System.out.println(str2); // Nam
        System.out.println("Độ dài chuỗi "+str2.length());
        System.out.println("Kí tự tại vị trí 2 là "+str2.charAt(2));
        System.out.println("hiẹu của 2 chuỗi dạng keycode "+str2.compareTo(fullName));
        // mục đích để so sánh 2 chuỗi để tiến hành sắp xếp
        String arrString = "1,2,3,4,5,6";
        String[] arr =arrString.split(",");
        System.out.println(Arrays.toString(arr));
        StringBuilder stringBuilder = new StringBuilder("Hùng"); // phương thức khởi tạo mặc định
        System.out.println(stringBuilder.toString()); // ngầm gọi đến phương thức toString
        stringBuilder.append(" rikkei");
        System.out.println(stringBuilder.toString());
        stringBuilder.insert(4,"insert");
        System.out.println(stringBuilder.toString());
        stringBuilder.delete(2,4);
        System.out.println(stringBuilder.toString());
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString());
    }
}
