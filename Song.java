public class Song {
    public static void Introduction(String[] args) {
        System.out.println("Behruz Omonullaev, Section 001, Assignment 2 \nThe goal of this assignment is to utilize static methods to eliminate redundancy in the program/class.");
        System.out.println();
    }
    public static void main(String[] args) {
        Introduction(args);
        VerseOne(args);
        VerseTwo(args);
        VerseThree(args);
        VerseFour(args);
        VerseFive(args);
        VerseSix(args);
    }
    public static void VerseOne(String[] args) {
        System.out.println("Bought me a cat and the cat pleased me,\nI feed my cat under younder tree");
        Cat(args);
    }
    public static void VerseTwo(String[] args) {
        System.out.println("Bought me a hen and the hen pleased me,\nI feed my hen under younder tree");
        Hen(args);
        Cat(args);
    }
    public static void VerseThree(String[] args) {
        System.out.println("Bought me a duck and the duck pleased me,\nI fed the duck under younder tree");
        Duck(args);
        Hen(args);
        Cat(args);
    }
    public static void VerseFour(String[] args) {
        System.out.println("Bought me a goose and the goose pleased me, \nI fed the goose under yonder tree");
        Goose(args);
        Duck(args);
        Hen(args);
        Cat(args);
    }
    public static void VerseFive(String[] args) {
        System.out.println("Bought me a sheep and the sheep pleased me, \nI fed the sheep under yonder tree");
        Sheep(args);
        Goose(args);
        Duck(args);
        Hen(args);
        Cat(args);
    }
    public static void VerseSix(String[] args){
        System.out.println("Bought me a pig and the pig pleased me, \nI fed the pig under younder tree");
        Pig(args);
        Sheep(args);
        Goose(args);
        Duck(args);
        Hen(args);
        Cat(args);       
    }
    public static void Cat(String[] args) {
        System.out.println("Cat goes fiddle-i-fee.");
        System.out.println();
    }
    public static void Hen(String[] args) {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
    }
    public static void Duck(String[] args){
        System.out.println("Duck goes quack, quack,");
    }
    public static void Goose(String[] args) {
        System.out.println("Goose goes hissy, hissy,");
    }
    public static void Sheep(String[] args) {
        System.out.println("Sheep goes baa, baa,");
    }
    public static void Pig(String[] args) {
        System.out.println("Pig goes oink, oink,");
    }

}
