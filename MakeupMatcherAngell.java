import java.util.Scanner;

public class MakeupMatcherAngell {

    static String[] foundationAngell = {
        "TIRTIR Cushion Shade 17C Ivory Cool",
        "TIRTIR Cushion Shade 21N Light Neutral",
        "TIRTIR Cushion Shade 23W Medium Warm",
        "TIRTIR Cushion Shade 25C Tan Cool",
        "TIRTIR Cushion Shade 27N Deep Neutral"
    };

    static String[] bedakAngell = {
        "Laura Mercier Translucent Setting Powder",
        "Maybelline Fit Me Loose Finishing Powder Shade Fair Light",
        "Innisfree No-Sebum Mineral Powder",
        "NARS Light Reflecting Setting Powder",
        "Fenty Beauty Pro Filt'r Instant Retouch Setting Powder Shade Butter"
    };

    static String[] lipTintAngell = {
        "Peripera Ink Velvet Lip Tint Shade 01 Good Brick",
        "Rom&nd Juicy Lasting Tint Shade 06 Fig Fig",
        "Etude House Dear Darling Water Tint Shade 02 Strawberry Ade",
        "3CE Velvet Lip Tint Shade Going Right",
        "The Saem Saemmul Real Tint Shade Red"
    };

    static String[] lipstickAngell = {
        "MAC Matte Lipstick Shade Ruby Woo",
        "YSL Rouge Pur Couture Shade 70 Le Nu",
        "Maybelline SuperStay Matte Ink Shade Lover",
        "Chanel Rouge Allure Velvet Shade 58 Rouge Vie",
        "Dior Addict Lip Glow Shade 001 Pink"
    };

    public static void main(String[] args) {
        Scanner angelScanner = new Scanner(System.in);
        String cobaLagiAngell;

        printSeparator();
        System.out.println(">.< + .` * Welcome to Angel's Makeup Matcher! * `. + >.<");
        printSeparator();

        do {
            String jenisKulitAngell = getJenisKulitAngell(angelScanner);
            String undertoneAngell = getUndertoneAngell(angelScanner);
            String preferensiCoverage = getPreferensiCoverage(angelScanner); 
            String warnaBibirAngell = getWarnaBibirAngell(angelScanner);
            String produkAngell = getProdukAngell(angelScanner);

            rekomendasiProdukAngell(jenisKulitAngell, undertoneAngell, preferensiCoverage, warnaBibirAngell, produkAngell);

            System.out.println();
            System.out.println(">>> Apakah kamu mau mencoba lagi? ^-^ (yes/no) <<<");
            cobaLagiAngell = angelScanner.next();

        } while (cobaLagiAngell.equalsIgnoreCase("yes"));

        System.out.println("======================================================================");
        System.out.println("<3 * . + Terima kasih sudah menggunakan Makeup Matcher Angel! + . * <3");
        System.out.println("======================================================================");

        angelScanner.close();
    }

    public static void printSeparator() {
        System.out.println("========================================================");
    }

    public static String getJenisKulitAngell(Scanner angelScanner) {
        System.out.println("\n--> Apa jenis kulitmu? ^-^ ");
        System.out.println("1. Berminyak (sering berkilau dan berminyak)");
        System.out.println("2. Kering (sering merasa kering dan terlihat bersisik)");
        System.out.println("3. Kombinasi (berminyak di area T-zone dan kering di area lainnya)");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihanAngell = angelScanner.nextInt();
        return (pilihanAngell == 1) ? "Berminyak" : (pilihanAngell == 2) ? "Kering" : "Kombinasi";
    }

    public static String getUndertoneAngell(Scanner angelScanner) {
        System.out.println("\n--> Apa undertonemu? ^.^");
        System.out.println("1. Cool (kulit terlihat lebih pink atau merah)");
        System.out.println("2. Warm (kulit terlihat lebih kuning atau emas)");
        System.out.println("3. Neutral (campuran pink dan kuning)");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihanAngell = angelScanner.nextInt();
        return (pilihanAngell == 1) ? "Cool" : (pilihanAngell == 2) ? "Warm" : "Neutral";
    }

    public static String getPreferensiCoverage(Scanner angelScanner) {
        System.out.println("\n--> Seberapa tebal kamu suka foundationmu? ^~^");
        System.out.println("1. Ringan (cocok untuk tampilan natural sehari-hari)");
        System.out.println("2. Sedang (cocok untuk menutupi noda kecil tapi tetap terlihat natural)");
        System.out.println("3. Full Coverage (cocok untuk menutupi semuanya, cocok untuk acara-acara khusus)");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihanAngell = angelScanner.nextInt();
        return (pilihanAngell == 1) ? "Ringan" : (pilihanAngell == 2) ? "Sedang" : "Full Coverage";
    }

    public static String getWarnaBibirAngell(Scanner angelScanner) {
        System.out.println("\n--> Apa preferensi warna bibirmu? ^o^");
        System.out.println("1. Mauve (warna ungu lembut)");
        System.out.println("2. Merah (warna merah terang)");
        System.out.println("3. Nude (warna lembut seperti kulit)");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihanAngell = angelScanner.nextInt();
        return (pilihanAngell == 1) ? "Mauve" : (pilihanAngell == 2) ? "Merah" : "Nude";
    }

    public static String getProdukAngell(Scanner angelScanner) {
        System.out.println("\n--> Produk apa yang kamu cari? :]");
        System.out.println("1. Foundation");
        System.out.println("2. Bedak");
        System.out.println("3. Lip Tint");
        System.out.println("4. Lipstick");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihanAngell = angelScanner.nextInt();
        switch (pilihanAngell) {
            case 1:
                return "Foundation";
            case 2:
                return "Bedak";
            case 3:
                return "Lip Tint";
            case 4:
                return "Lipstick";
            default:
                return "Produk Tidak Diketahui";
        }
    }

    public static void rekomendasiProdukAngell(String jenisKulitAngell, String undertoneAngell, String preferensiCoverage, String warnaBibirAngell, String produkAngell) {
        printSeparator();
        System.out.println("Mencocokkan pilihanmu... (^~^)/ ");
        System.out.println("Jenis Kulit: " + jenisKulitAngell);
        System.out.println("Undertone: " + undertoneAngell);
        System.out.println("Preferensi Coverage: " + preferensiCoverage);
        System.out.println("Warna Bibir: " + warnaBibirAngell);
        System.out.println("Produk yang Dicari: " + produkAngell);
        printSeparator();

        String[] produkTerpilihAngell;
        if (produkAngell.equals("Foundation")) {
            produkTerpilihAngell = foundationAngell;
        } else if (produkAngell.equals("Bedak")) {
            produkTerpilihAngell = bedakAngell;
        } else if (produkAngell.equals("Lip Tint")) {
            produkTerpilihAngell = lipTintAngell;
        } else {
            produkTerpilihAngell = lipstickAngell;
        }

        int indexRandomAngell = (int) (Math.random() * produkTerpilihAngell.length);
        System.out.println("Rekomendasi produk: " + produkTerpilihAngell[indexRandomAngell] + " (^o^)/ ");
    }
}
