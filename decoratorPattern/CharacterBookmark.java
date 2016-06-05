package designPattern.decoratorPattern;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
class CharacterBookmark extends BookmarkDecorator{
    Book book;

    public CharacterBookmark(Book book){
        this.book = book;
    }

    @Override
    public String getDescription() {
        return book.getDescription() + ", characterBookmark ";
    }

    @Override
    public double cost() {
        return 1 + book.cost();
    }
}
