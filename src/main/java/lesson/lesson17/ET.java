package lesson.lesson17;

public class ET {
    public int dev(int a, int b){
        if (b == 0){
            throw new ZeroException();
        }else {
            return a/b;
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(new ET().dev(a,b));
    }
}
class ZeroException extends RuntimeException{

}
