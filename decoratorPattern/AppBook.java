package designPattern.decoratorPattern;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
class AppBook{
    public static void main(String[] args) {
        Book book1 = new Essay();
        print(book1.getDescription() + " $" + book1.cost());

        Book book2 = new Poem();
        print(book2.getDescription() + "  $" + book2.cost());

        Book book3 = new Novel();
        print(book3.getDescription() + " $" + book3.cost());

        Book book4 = new Essay();
        book4 = new CharacterBookmark(book4);
        print(book4.getDescription() + " $" + book4.cost());

        Book book5 = new Poem();
        book5 = new CharacterBookmark(book5);
        book5 = new SceneryBookmark(book5);
        print(book5.getDescription() + " $" + book5.cost());
    }
}
