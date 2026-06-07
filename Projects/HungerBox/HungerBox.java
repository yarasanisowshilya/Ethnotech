package Projects.HungerBox;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;

interface Orderable
{
    double getPrice();
    String getDescription();
    void prepare();
}

interface Discounts
{
    double applyDiscounts(double discount);
}

abstract class MenuItems implements Orderable,Discounts
{
    private final String name;
    private double price;
    private static int totalNumberOfOrders = 0;
    private String categories;

    public MenuItems(String name, double price, String categories) {
        this.name = name;
        this.price = price;
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String getDescription() {
        return "Item Name : " + getName() + "price " + getPrice();
    }

    @Override
    abstract public void prepare();

    public double applyDiscounts(double discount) {
        return price - (price * discount / 100);
    }

    public static int getTotalNumberOfOrders() {
        return totalNumberOfOrders;
    }

    public static void setTotalNumberOfOrders(int totalNumberOfOrders) {
        MenuItems.totalNumberOfOrders = totalNumberOfOrders;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
}

    class VegItems extends MenuItems
    {
        private boolean isJain;
        public VegItems(String name,double price)
        {
            super(name,price,"veg");
            isJain=false;
        }
        public VegItems(String name,double price,boolean isJain)
        {
            super(name,price,"veg");
            isJain=isJain;
        }
        @Override
        public void prepare()
        {
            System.out.println("Your Order of " +getName()+ " of price " +
                    getPrice() + "Id been prepared");
            setTotalNumberOfOrders(getTotalNumberOfOrders()+1);
        }
    }


class NonVegItems extends MenuItems
{
    private String meatType;


    public NonVegItems(String name, double price, String categories, String meatType) {
        super(name, price, categories);
        this.meatType = meatType;
    }
    @Override
    public void prepare()
    {
        System.out.println("Your Order of " +getName()+ " of price " +
                getPrice() + "Id been prepared");
        setTotalNumberOfOrders(getTotalNumberOfOrders()+1);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + this.meatType;
    }
}

class Orders {
    private final int orderId;
    private static int orderCount;
    private final String customerName;
    ArrayList<MenuItems> list;
    private String status;

    public Orders(String customerName) {
        this.customerName = customerName;
        list = new ArrayList<>();
        status = "Order placed";
        this.orderId = ++orderCount;
    }

    public void addItems(MenuItems items) {
        list.add(items);
        //System.out.println("The order has been placed for " +customerName + "with items " );
        System.out.println("The Items Ordered is " + items.getName() + "The price is " + items.getPrice());
    }

    public void prepareOrder() {
        this.status = "Preparing Order";
        for (MenuItems items : list) {
            items.prepare();
        }
    }

    double calculatePrice() {
        double price = 0;
        for (MenuItems items : list) {
            price += items.getPrice();
        }
        return price;
    }

    void generateBill(double discountPercent) {

        double subtotal = calculatePrice();
        double discounted = subtotal - (subtotal * discountPercent / 100);
        double tax = discounted * 0.05;
        double total = discounted + tax;

        System.out.println("  ┌────────────────────────────────────┐");
        System.out.println("  │         HungerBox — Bill           │");
        System.out.println("  ├────────────────────────────────────┤");
        System.out.println("  │  Order ID  : #" + orderId);
        System.out.println("  │  Customer  : " + customerName);
        System.out.println("  │  Status    : " + status);
        System.out.println("  ├────────────────────────────────────┤");
        for (MenuItems item : list) {
            System.out.printf("  │  %-22s ₹%6.2f%n", item.getName(), item.getPrice());
        }
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  Subtotal              ₹%8.2f%n", subtotal);
        if (discountPercent > 0)
            System.out.printf("  │  Discount (%d%%)         -₹%7.2f%n", (int) discountPercent, subtotal - discounted);
        System.out.printf("  │  GST (5%%)              ₹%8.2f%n", tax);
        System.out.println("  ├────────────────────────────────────┤");
        System.out.printf("  │  TOTAL                 ₹%8.2f%n", total);
        System.out.println("  └────────────────────────────────────┘");
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class Res{
    String name;
    ArrayList<MenuItems>menu;
    ArrayList<Orders> o;

    public Res(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
        this.o = new ArrayList<>();
    }
    void addMenu(MenuItems items)
    {
        menu.add(items);
    }
    void showMenu()
    {
        for (int i=0;i< menu.size();i++ )
        {
            System.out.println((i+1) + " : " + menu.get(i).getDescription());
        }
    }
Orders placeOrder(String name)
{
    Orders order1=new Orders(name);
    o.add(order1);
    return order1;
}
MenuItems getItems (int index)
{
    return menu.get(index);
}
    Orders ord=new Orders(name);

void showOrder()
{
    for (Orders order:o) {
        System.out.println("The Order of " +order.getCustomerName() + " " + order.getStatus() + menu.get(order.getOrderId()).getDescription());

    }
}
}
public class HungerBox {

    public static void main(String[] args) {

        Res res=new Res("Spicy Garden");
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("  ║       Welcome to HungerBox 🍕     ║");
        System.out.println("  ╚═══════════════════════════════════╝");
        res.addMenu(new VegItems("Panner Butter Masala",300));
        res.addMenu(new VegItems("kaju Butter Masala",200));
        res.addMenu(new VegItems("Peanut Butter Masala",340));
        res.addMenu(new VegItems("chilli Butter Masala",350));
        res.addMenu(new VegItems("soya Butter Masala",250,true));
        res.addMenu(new NonVegItems("Chicken Butter Masala",390,"Non veg","chikcen"));
        res.showMenu();

        Orders ord =res.placeOrder("Sowshilya Y");
        ord.addItems(res.getItems(0));
        ord.addItems(res.getItems(2));
        ord.addItems(res.getItems(1));
        ord.addItems(res.getItems(3));
        res.showOrder();

        ord.prepareOrder();
        ord.generateBill(10);
    }


}
