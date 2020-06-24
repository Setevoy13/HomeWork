public class lesson8 {
    public static void main(String[] args){
        System.out.println(sum(1,3));
        int xx =sum(1,3,2);
        int yy =sum(1,5);
        int zz =sum(5,7,9,5);
        double aa=sum(1.5,6.8,8);
        String bb=sum("sdfgsfg","fdgsdfg", "dfgsfdg");
        System.out.println(bb);

    }
    public static int sum(int a, int b){
        return a+b;
    }
    //method overload. перегрузка имен функций.
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static double sum(double a, double b, double c){
        return a+b+c;
    }
    public static String sum(String a, String b){
        return a+b;
    }
    public static String sum(String a, String b, String c){
        return a+b+c;
    }
}
