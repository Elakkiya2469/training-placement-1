
interface Food {
    String getType();
}

class Pizza implements Food {
    @Override
    public String getType() {
        return "Fast Food";
    }
}
class Cake implements Food {
    @Override
    public String getType() {
        return "Dessert";
    }
}
class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("cake")) {
            return new Cake();
        }
        return null; 
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.nextLine();
        
        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(order);
        
        System.out.println("The factory returned class " + food.getClass().getSimpleName());
        System.out.println("Someone ordered a " + food.getType() + "!");
        
        sc.close();
    }
}
