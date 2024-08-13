package Recursion.String;

public class skipChar {
    public static void main(String[] args) {
        skip1("","abbcadha");
        System.out.println();
        System.out.print(skip2("abbcadha"));
        System.out.println();
        skipStr("", "aahbapplejkhd");
        System.out.println();
        skipStrAdv("", "aahbappljkhd");
    }

    public static void skip1(String p, String up){     //p: processed , up:unprocessed
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }

        char ch=up.charAt(0);
        if(ch=='a'){
            skip1(p,up.substring(1));
        }else{
            skip1(p+ch, up.substring(1));
        }
    }

    public static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch=up.charAt(0);

        if(ch=='a'){
            return skip2(up.substring(1));
        }else{
            return ch+skip2(up.substring(1));
        }
    }

    // Skip particular string

    public static void skipStr(String p, String up){
        if(up.isEmpty()) {
            System.out.print(p);
            return;
        }

        if(up.startsWith("apple")) skipStr(p,up.substring(5));
        else skipStr(p+up.charAt(0), up.substring(1));
    }

    // skuip app only when their is no apple
    public static void skipStrAdv(String p, String up){
        if(up.isEmpty()) {
            System.out.print(p);
            return;
        }

        if(up.startsWith("app") && !up.startsWith("apple")) skipStrAdv(p,up.substring(3));
        else skipStrAdv(p+up.charAt(0), up.substring(1));
    }

}