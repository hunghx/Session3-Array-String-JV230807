public class Method {
    public static void main(String[] args) {
       if (checkNumberIsPrime(1000000001)){
           System.out.println("Là số nguyên tố");
       }else {
           System.out.println("không là số nguyên tố");
       }
    }
    // tạo phương thức kiểm tra số nguyên tố
    public static boolean checkNumberIsPrime(int number){
//        if(number<2){
//            // ko là số nguyên tố
//            return false;
//        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number%i == 0){
//                System.out.println(i);
                return false;
            }
        }
        return number>=2;
//        if(number<2){
//            // ko là số nguyên tố
//            return false;
//        }else {
//            return true;
//        }
    }
}
