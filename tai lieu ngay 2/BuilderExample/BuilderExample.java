
class Product {
    private String part1;
    private String part2;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public String toString() {
        return "Part1: " + part1 + ", Part2: " + part2;
    }
}

class ProductBuilder {
    private Product product = new Product();

    public ProductBuilder withPart1(String part1) {
        product.setPart1(part1);
        return this;
    }

    public ProductBuilder withPart2(String part2) {
        product.setPart2(part2);
        return this;
    }

    public Product build() {
        return product;
    }
}

public class BuilderExample {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
            .withPart1("A")
            .withPart2("B")
            .build();
        
        System.out.println(product);
    }
}
