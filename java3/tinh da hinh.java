/*gọi cùng phương thức trên các đối tượng khác  nhau,
 phương thức thực thi dựa trên đặc điẻm riêng biệt của vật*/


class Animal { // lớp cha
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal { // lớp con
    @Override // được sử dụng để ghi đè một phương thức từ cha trong lớp con
    public void makeSound() {
        System.out.println("Bark"); // đặc diểm riêng của vật
    }
}

class Cat extends Animal { // lớp con
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.makeSound(); // Gọi cùng tên phương thức, nhưng kết quả sẽ khác nhau theo loại đối tượng.
        }
    }
}
