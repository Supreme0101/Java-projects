class product {
    int pro_id;
    String name;
    float price;
    int quantity;

    public product(String name, int pro_id, float price, int quantity) {
        this.name = name;
        this.pro_id = pro_id;
        this.price = price;
        this.quantity = quantity;
    }
}

class clothing extends product {
    public clothing(String name, int pro_id, float price, int quantity) {
        super(name, pro_id, price, quantity);
        int size;
        this.name = name;
        this.pro_id = pro_id;
        this.price = price;
        this.quantity = quantity;

    }
}
class ele extends product{
    public ele(String name, int pro_id, float price, int quantity){
        super(name, pro_id, price, quantity);

    }

}

public class retail {
    
}
