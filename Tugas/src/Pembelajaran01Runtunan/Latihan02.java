package Pembelajaran01Runtunan;


public class Latihan02 {

    // Class Variable
    static double alas = 6;
    static double tinggiSegitiga = 4;
    static double sisiMiring = 5;
    static double tinggiPrisma = 10;

    // Method untuk menghitung luas alas segitiga
    static double luasAlas() {
        double luas = 0.5 * alas * tinggiSegitiga;
        return luas;
    }

    // Method untuk menghitung keliling alas segitiga
    static double kelilingAlas() {
        double keliling = alas + tinggiSegitiga + sisiMiring;
        return keliling;
    }

    // Method untuk menghitung luas permukaan prisma
    static double luasPermukaan() {
        double luas = 2 * luasAlas()
                    + kelilingAlas() * tinggiPrisma;
        return luas;
    }

    // Method untuk menghitung volume prisma
    static double volume() {
        double hasil = luasAlas() * tinggiPrisma;
        return hasil;
    }

    public static void main(String[] args) {

        // Local Variable
        double luasSegitiga = luasAlas();
        double kelilingSegitiga = kelilingAlas();
        double luasPrisma = luasPermukaan();
        double volumePrisma = volume();

        System.out.println("=== PROGRAM PRISMA SEGITIGA ===");
        System.out.println("Luas alas segitiga : " + luasSegitiga);
        System.out.println("Keliling alas      : " + kelilingSegitiga);
        System.out.println("Luas permukaan     : " + luasPrisma);
        System.out.println("Volume prisma      : " + volumePrisma);
    }
}

