public class JC3311 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello();
        Cat cat = new Cat();
        cat.sayHello();
        dog.catchCat(cat);
    }

    public static class Cat{
        public void sayHello(){
            System.out.println("Мяу!");
        }

    }
    public static class Dog{
        public void sayHello() {
            System.out.println("Гав!");
        }
        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }
}
