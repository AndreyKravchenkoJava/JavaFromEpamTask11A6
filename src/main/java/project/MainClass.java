package project;

public class MainClass {
    public static void main(String[] args) {
        Set set1 = new Set(5, 6, 7, 8);
        Set set2 = new Set(7, 8, 9, 10, 11, 12);

        System.out.println("Intersection: " + set1.intersect(set2));
        System.out.println("Union: " + set1.unify(set2));
    }
}
