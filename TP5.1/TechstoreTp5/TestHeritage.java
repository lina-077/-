package TechstoreTp5;

public class TestHeritage {
    public static void main(String[] args) {
    Adulte a1 = new Adulte("Amine", 35, "Ingénieur","96325874");
    a1.afficherIdentite();

    Enfant e1 = new Enfant("Sami", 10, "École primaire","25631478");
    Bebe b1 = new Bebe("Lina", 1, true,"58899344");

    System.out.println(a1);
    System.out.println(e1);
    System.out.println(b1);

    TypePersonne type = TypePersonne.ADULTE;
    System.out.println(type);
    for (TypePersonne t : TypePersonne.values()) {
        System.out.println(t);
        }
    }
}