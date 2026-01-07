class Animal{
    void Sound() {
        System.out.println("animal Make sounds");
    }
    static class Dog extends Animal { // static class so that it can be accessed in main method directly
        @Override
        void Sound() {
            System.out.println("Dog barks");
        }
    }
    static class Cat extends Animal {
        @Override
        void Sound() {
            System.out.println("Cat meows");
        }
    }
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.Sound(); 
        animal = new Cat();
        animal.Sound(); 
    }
}