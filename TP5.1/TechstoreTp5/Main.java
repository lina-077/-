package TechstoreTp5;

public class Main {
    public static void main(String[] args) {
        SystemeExploitation s1 = SystemeExploitation.Windows;
        SystemeExploitation s2 = SystemeExploitation.Ubuntu;
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("--- Tous les OS ---");
        for (SystemeExploitation s : SystemeExploitation.values()) {
            System.out.println(s);
        }

        OrdinateurPortable pc = new OrdinateurPortable(
                1, "ThinkPad X1", "REF-PC-01", 3200.0,
                14.0, "Intel i7", 16, SystemeExploitation.Windows,
                512, "Iris Xe", 57000);

        OrdinateurDeBureau tour = new OrdinateurDeBureau(
                2, "Station Fixe", "REF-DB-02", 2100.0,
                27.0, "Ryzen 7", 32, SystemeExploitation.Ubuntu,
                1000, "RTX 4060", "650W Bronze");

        Mobile tel = new Mobile(
                3, "Galaxy S25", "REF-MB-03", 1450.0,
                6.2, "Snapdragon", 12, SystemeExploitation.Android,
                50.0, 12.0, 2, 4000);

        ComposantStockage ssd = new ComposantStockage(
                4, "SSD NVMe", "REF-ST-04", 180.0, 1000);

        Peripheriques souris = new Peripheriques(
                5, "Souris Sans Fil", "REF-PR-05", 65.0,
                "Bluetooth", "Sans fil");

        System.out.println(pc + " | Garantie : " + pc.garantirAppareil() + " an(s)");
        System.out.println(tour + " | Garantie : " + tour.garantirAppareil() + " an(s)");
        System.out.println(tel + " | Garantie : " + tel.garantirAppareil() + " an(s)");
        System.out.println(ssd + " | Garantie : " + ssd.garantirAppareil() + " an(s)");
        System.out.println(souris);
    }
}