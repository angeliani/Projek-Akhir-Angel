import java.util.Scanner;

public class MakeupMatcherAngel {

    static String[][] foundationAngell = {
        {"Light", "Cool", "Oily", "Light", "TIRTIR Cushion Shade 17C Ivory Cool"},
        {"Medium", "Cool", "Oily", "Medium", "TIRTIR Cushion Shade 21C Soft Cool"},
        {"Tan", "Cool", "Dry", "Full Coverage", "TIRTIR Cushion Shade 23C Cool Tan"},
        {"Deep", "Cool", "Combination", "Medium", "TIRTIR Cushion Shade 27C Deep Cool"},
        {"Light", "Warm", "Oily", "Light", "TIRTIR Cushion Shade 18W Warm Ivory"},
        {"Medium", "Warm", "Dry", "Medium", "TIRTIR Cushion Shade 22W Warm Light"},
        {"Tan", "Warm", "Combination", "Full Coverage", "TIRTIR Cushion Shade 25W Warm Tan"},
        {"Deep", "Warm", "Oily", "Full Coverage", "TIRTIR Cushion Shade 27W Deep Warm"},
        {"Light", "Neutral", "Dry", "Light", "TIRTIR Cushion Shade 21N Neutral Light"},
        {"Medium", "Neutral", "Combination", "Medium", "TIRTIR Cushion Shade 23N Neutral Medium"},
        {"Tan", "Neutral", "Oily", "Full Coverage", "TIRTIR Cushion Shade 25N Neutral Tan"},
        {"Deep", "Neutral", "Combination", "Medium", "TIRTIR Cushion Shade 27N Neutral Deep"}
    };

    static String[][] bedakAngell = {
        {"Oily", "Light", "Laura Mercier Translucent Setting Powder"},
        {"Dry", "Medium", "Maybelline Fit Me Loose Finishing Powder Shade Fair Light"},
        {"Combination", "Deep", "Innisfree No-Sebum Mineral Powder"},
        {"Dry", "Tan", "NARS Light Reflecting Setting Powder"},
        {"Oily", "Medium", "Fenty Beauty Pro Filt'r Instant Retouch Setting Powder Shade Butter"},
        {"Combination", "Medium", "Huda Beauty Easy Bake Powder Shade Banana"},
        {"Dry", "Light", "Charlotte Tilbury Airbrush Flawless Finish Powder"},
        {"Oily", "Medium", "Tarte Shape Tape Setting Powder"},
        {"Combination", "Light", "KVD Lock-It Setting Powder"}
    };

    static String[][] lipTintAngell = {
        {"Dark", "Red", "Oily", "Peripera Ink Velvet Lip Tint Shade 01 Good Brick"},
        {"Bright", "Pink", "Dry", "Etude House Dear Darling Water Tint Shade 02 Strawberry Ade"},
        {"Medium", "Mauve", "Combination", "Rom&nd Juicy Lasting Tint Shade 06 Fig Fig"},
        {"Bright", "Coral", "Oily", "3CE Velvet Lip Tint Shade Going Right"},
        {"Deep", "Red Wine", "Dry", "The Saem Saemmul Real Tint Shade Red"},
        {"Light", "Peach", "Combination", "Tony Moly Delight Lip Tint Shade 01 Peach"},
        {"Medium", "Berry", "Dry", "Peripera Ink The Airy Velvet Lip Tint Shade 10"},
        {"Bright", "Orange", "Combination", "Innisfree Vivid Cotton Ink Shade 17 Tangerine"}
    };

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String tryAgain;

        printSeparator();
        System.out.println(">.< + .` * Welcome to Angel's Makeup Matcher! * `. + >.<");
        printSeparator();

        do {
            String productType = getProductType(userInput);

            switch (productType) {
                case "Foundation":
                    handleFoundation(userInput);
                    break;
                case "Bedak":
                    handlePowder(userInput);
                    break;
                case "Lip Tint":
                    handleLipTint(userInput);
                    break;
                default:
                    System.out.println("Maaf aku gak ngenalin produk ini :()");
            }

            System.out.println("\n>>> Apakah kamu ingin mencoba lagi? ^-^ (ya/tidak) <<<");
            tryAgain = userInput.next();

        } while (tryAgain.equalsIgnoreCase("ya"));

        System.out.println("================================================================");
        System.out.println("<3 * . + Terima kasih sudah menggunakan Makeup Matcher! + . * <3");
        System.out.println("================================================================");

        userInput.close();
    }

    public static void printSeparator() {
        System.out.println("========================================================");
    }

    public static String getProductType(Scanner userInput) {
        System.out.println("\n--> Produk apa yang kamu cari? ^o^ ");
        System.out.println("1. Foundation");
        System.out.println("2. Bedak");
        System.out.println("3. Lip Tint");
        System.out.print("Masukkan pilihanmu (1-3): ");
        int choice = userInput.nextInt();
        switch (choice) {
            case 1:
                return "Foundation";
            case 2:
                return "Bedak";
            case 3:
                return "Lip Tint";
            default:
                System.out.println("Pilihan tidak valid :/");
                return "Unknown";
        }
    }

    public static String getSkinTone(int index) {
        return switch (index) {
            case 0 -> "Light";
            case 1 -> "Medium";
            case 2 -> "Tan";
            case 3 -> "Deep";
            default -> "Unknown";
        };
    }

    public static String getUndertone(int index) {
        return switch (index) {
            case 0 -> "Cool";
            case 1 -> "Warm";
            case 2 -> "Neutral";
            default -> "Unknown";
        };
    }

    public static String getSkinType(int index) {
        return switch (index) {
            case 0 -> "Oily";
            case 1 -> "Dry";
            case 2 -> "Combination";
            default -> "Unknown";
        };
    }

    public static void handleFoundation(Scanner userInput) {
        System.out.println("\n--> Apa warna kulitmu? ^v^");
        System.out.println("1. Light");
        System.out.println("2. Medium");
        System.out.println("3. Tan");
        System.out.println("4. Deep");
        System.out.print("Masukkan pilihanmu (1-4): ");
        int skinToneIndex = userInput.nextInt() - 1;

        System.out.println("\n--> Apa undertone kulitmu? ^.^");
        System.out.println("1. Cool");
        System.out.println("2. Warm");
        System.out.println("3. Neutral");
        System.out.print("Masukkan pilihanmu (1-3): ");
        int undertoneIndex = userInput.nextInt() - 1;

        System.out.println("\n--> Apa jenis kulitmu? ^~^");
        System.out.println("1. Oily");
        System.out.println("2. Dry");
        System.out.println("3. Combination");
        System.out.print("Masukkan pilihanmu (1-3): ");
        int skinTypeIndex = userInput.nextInt() - 1;

        System.out.println("\n--> Seberapa besar coverage yang kamu inginkan? ^V^");
        System.out.println("1. Light");
        System.out.println("2. Medium");
        System.out.println("3. Full Coverage");
        System.out.print("Masukkan pilihanmu (1-3): ");
        int coverageIndex = userInput.nextInt() - 1;

        for (String[] product : foundationAngell) {
            if (product[0].equalsIgnoreCase(getSkinTone(skinToneIndex)) &&
                product[1].equalsIgnoreCase(getUndertone(undertoneIndex)) &&
                product[2].equalsIgnoreCase(getSkinType(skinTypeIndex)) &&
                product[3].equalsIgnoreCase(getCoverage(coverageIndex))) {
                System.out.println("\nRekomendasi Foundation: " + product[4]);
                return;
            }
        }
        System.out.println("Maaf, aku belum menemukan produk yang cocok :[");
    }

    public static String getCoverage(int index) {
        return switch (index) {
            case 0 -> "Light";
            case 1 -> "Medium";
            case 2 -> "Full Coverage";
            default -> "Unknown";
        };
    }

    public static void handlePowder(Scanner userInput) {
        System.out.println("\n--> Apa jenis kulitmu? ^o^");
        System.out.println("1. Oily");
        System.out.println("2. Dry");
        System.out.println("3. Combination");
        System.out.print("Masukkan pilihanmu (1-3): ");
        int skinTypeIndex = userInput.nextInt() - 1;

        System.out.println("\n--> Apa warna kulitmu? ^-^");
        System.out.println("1. Light");
        System.out.println("2. Medium");
        System.out.println("3. Deep");
        System.out.print("Masukkan pilihanmu (1-3): ");
        int toneIndex = userInput.nextInt() - 1;

        for (String[] product : bedakAngell) {
            if (product[0].equalsIgnoreCase(getSkinType(skinTypeIndex)) &&
                product[1].equalsIgnoreCase(getSkinTone(toneIndex))) {
                System.out.println("\nRekomendasi Bedak: " + product[2]);
                return;
            }
        }
        System.out.println("Maaf, aku belum menemukan produk yang cocok :[");
    }

    public static void handleLipTint(Scanner userInput) {
        System.out.println("\n--> Apa warna dasar bibirmu? ^=^");
        System.out.println("1. Dark");
        System.out.println("2. Bright");
        System.out.println("3. Medium");
        System.out.print("Masukkan pilihanmu (1-3): ");
        int lipBaseIndex = userInput.nextInt() - 1;

        System.out.println("\n--> Apa warna lip tint yang kamu suka? ^u^");
        System.out.println("1. Red");
        System.out.println("2. Pink");
        System.out.println("3. Mauve");
        System.out.println("4. Coral");
        System.out.println("5. Red Wine");
        System.out.println("6. Peach");
        System.out.println("7. Berry");
        System.out.println("8. Orange");
        System.out.print("Masukkan pilihanmu (1-8): ");
        int lipColorIndex = userInput.nextInt() - 1;

        System.out.println("\n--> Apa jenis kulitmu? ^.^");
        System.out.println("1. Oily");
        System.out.println("2. Dry");
        System.out.println("3. Combination");
        System.out.print("Masukkan pilihanmu (1-3): ");
        int skinTypeIndex = userInput.nextInt() - 1;

        for (String[] product : lipTintAngell) {
            if (product[0].equalsIgnoreCase(getLipBase(lipBaseIndex)) &&
                product[1].equalsIgnoreCase(getLipColor(lipColorIndex)) &&
                product[2].equalsIgnoreCase(getSkinType(skinTypeIndex))) {
                System.out.println("\nRekomendasi Lip Tint: " + product[3]);
                return;
            }
        }
        System.out.println("Maaf, aku belum menemukan produk yang cocok :[");
    }

    public static String getLipBase(int index) {
        return switch (index) {
            case 0 -> "Dark";
            case 1 -> "Bright";
            case 2 -> "Medium";
            default -> "Unknown";
        };
    }

    public static String getLipColor(int index) {
        return switch (index) {
            case 0 -> "Red";
            case 1 -> "Pink";
            case 2 -> "Mauve";
            case 3 -> "Coral";
            case 4 -> "Red Wine";
            case 5 -> "Peach";
            case 6 -> "Berry";
            case 7 -> "Orange";
            default -> "Unknown";
        };
    }
}
