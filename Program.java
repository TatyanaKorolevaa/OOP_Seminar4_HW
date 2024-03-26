
public class Program {
    public static void main(String[] args) {

        Box<Orange> orange = new Box<>();
        Box<Orange> orange1 = new Box<>();
        Box<Apple> apple = new Box<>();
        Box<Apple> apple1 = new Box<>();
      

        orange.addFruits(new Orange(), 7);
        orange1.addFruits(new Orange(), 20);
        apple.addFruits(new Apple(), 11);
        apple1.addFruits(new Apple(), 9);
        

        System.out.println("Коробка 1: " + apple.getWeight());
        System.out.println("Коробка 2: " + apple1.getWeight());
        System.out.println("Коробка 3: " + orange.getWeight());
        System.out.println("Коробка 4: " + orange1.getWeight());
      
        
        System.out.println("Коробка 1 равна Коробке 3: " + apple.compare(orange));
        System.out.println("Коробка 2 равна Коробке 4: " + apple1.compare(orange1));

        apple.pourTo(apple1);
        orange.pourTo(orange1);

        System.out.println("Коробка 1: " + apple.getWeight());
        System.out.println("Коробка 2: " + apple1.getWeight());
        System.out.println("Коробка 3: " + orange.getWeight());
        System.out.println("Коробка 4: " + orange1.getWeight());
        

    }
    
}
