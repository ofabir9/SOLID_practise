public class Book
{
    private String name;
    private String author;
    private String text;
    
    public Book(String name,String author,String text)
    {
        this.author = author;
        this.text = text;
        this.name = name;
    }
    @Override
    public String toString()
    {
        return this.name+" "+this.author+" "+this.text;
    }
}