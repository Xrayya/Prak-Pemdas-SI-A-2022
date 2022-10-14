package pertemuan7;

public class Materials {
    public static void main(String[] args) {
        int varInt = 5;

        if (varInt > 10) {
            System.out.println("varInt lebih dari 10");
            varInt += 2;
        } else {
            System.out.println("varInt kurang dari 10");
        }

        // [kondisi] ? [argumen jika benar] : [argumen jika salah]

        System.out.println(varInt > 10 ? "varInt lebih dari 10" : "varInt kurang dari 10");
    }
}
