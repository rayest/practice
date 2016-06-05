package designPattern.decoratorPattern;

/**
 * Created by Rayest on 2016/6/5 0005.
 */
class SceneryBookmark extends BookmarkDecorator{
    Book book;
    public SceneryBookmark(Book book){
        this.book = book;
    }
    @Override
    public String getDescription() {
        return book.getDescription() + ", sceneryBookmark ";
    }

    @Override
    public double cost() {
        return 2 + book.cost();
    }
}
