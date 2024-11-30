import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}

class CartItem {
    private Product product;
    private int quantity;
    
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    
    public Product getProduct() {
        return product;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}

class Cart {
    private List<CartItem> items;
    
    public Cart() {
        items = new ArrayList<>();
    }
    
    public void addItem(CartItem item) {
        items.add(item);
    }
    
    public void removeItem(int index) {
        items.remove(index);
    }
    
    public double getTotalPrice() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
    
    public void displayCart() {
        System.out.println("Cart Items:");
        for (int i = 0; i < items.size(); i++) {
            CartItem item = items.get(i);
            Product product = item.getProduct();
            System.out.println((i+1) + ". " + product.getName() + " - Rp." + product.getPrice() +
                    " x " + item.getQuantity() + " = Rp." + item.getTotalPrice());
        }
        System.out.println("Total: Rp" + getTotalPrice());
    }
}

public class WarungMakanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();
        
        // Menambahkan produk ke dalam keranjang
        Product product1 = new Product("Nasi Goreng", 20000.00);
        Product product2 = new Product("Mie Goreng", 15000.00);
        Product product3 = new Product("Bihun Goreng", 13000.00);
        
        System.out.print("Masukkan jumlah " + product1.getName() + ": ");
        int quantity1 = scanner.nextInt();
        CartItem item1 = new CartItem(product1, quantity1);
        cart.addItem(item1);
        
        System.out.print("Masukkan jumlah " + product2.getName() + ": ");
        int quantity2 = scanner.nextInt();
        CartItem item2 = new CartItem(product2, quantity2);
        cart.addItem(item2);
        
        System.out.print("Masukkan jumlah " + product3.getName() + ": ");
        int quantity3 = scanner.nextInt();
        CartItem item3 = new CartItem(product3, quantity3);
        cart.addItem(item3);
        
        // Menampilkan isi keranjang dan total harga
        cart.displayCart();
        
        // Menghapus item dari keranjang
        System.out.print("Masukkan nomor item yang akan dihapus: ");
        int itemIndex = scanner.nextInt() - 1;
        cart.removeItem(itemIndex);
        
        // Menampilkan isi keranjang setelah penghapusan item
        cart.displayCart();
        
        scanner.close();
    }
}