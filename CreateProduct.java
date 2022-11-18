public class CreateProduct {
    Product unit;
    public CreateProduct(){
        unit = new Product();
        unit.name = "__";
        unit.category = "__";
        unit.rating = -1;
        unit.manufacturer = "__";
        unit.cost = -1;
    }

    public CreateProduct setName(String name){
        unit.name = name;
        return this;
    }

    public CreateProduct setCategory(String category){
        unit.category = category;
        return this;
    }

    public CreateProduct setRating(int rating){
        unit.rating = rating;
        return this;
    }

    public CreateProduct setManufacturer(String manufacturer){
        unit.manufacturer = manufacturer;
        return this;
    }

    public CreateProduct setCost(int cost){
        unit.cost = cost;
        return this;
    }

    public Product Create() {
        return unit;
      }
}
