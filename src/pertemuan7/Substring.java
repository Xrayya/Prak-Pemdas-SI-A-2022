package pertemuan7;

public class Substring {
    public static void main(String[] args) {
        String x = "aku:suka:makan:bakso";
        String temp = (x.substring(x.indexOf(":") + 1));

        System.out.println(x.substring(x.lastIndexOf(":")+ 1));

        System.out.println(temp.substring(temp.indexOf(":") + 1, temp.lastIndexOf(":")));
    }
}
