public class JavaCore222 {
    public static void main(String[] args) {
        System.out.println(charExpression(1));
    }

    public static char charExpression ( int a){
        char b = '\\';
        int c = b + a;
        return (char) c;
    }

//    public static char charExpression ( int a){
//            char b = '\\';
//            int c = b;
//            int d = c + a;
//            char e = (char) d;
//            return e;
//    }
}