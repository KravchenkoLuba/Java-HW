public class Product {
    double cost;
    String category;
    String name;
    int rating;
    String manufacturer;

    public void print(){
        System.out.println(
            String.format(
                "%s %s %d %s %f",
                            this.name,
                            this.category,
                            this.rating,
                            this.manufacturer,
                            this.cost));
    }

    public static void main(String[] args){
        Product unit1 = new CreateProduct()
            .setName("Карандаш")
            .setCategory("канцтовары")
            .setRating(5)
            .setManufacturer("Россия")
            .setCost(57)
            .Create();
        unit1.print();
    }
}

