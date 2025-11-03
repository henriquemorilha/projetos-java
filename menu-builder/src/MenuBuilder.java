import java.util.ArrayList;

public class MenuBuilder {
    public static void main(String[] args) {

        String menuTitle = "My Dream Menu";
        System.out.println(menuTitle);

        ArrayList<MenuItem> menu = new ArrayList<>();

        MenuItem starter = new MenuItem("Calamari");
        menu.add(starter);

        MenuItem mainCourse = new MenuItem("Ribeye Steak");
        menu.add(mainCourse);

        MenuItem dessert = new MenuItem("Churros");
        menu.add(dessert);

        System.out.println(menu);
    }
}
