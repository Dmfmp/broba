package rs.raf.quotes.domain;

public class Quotes
{
    private String date;

    private String quote;

    private String author;

    private String background;

    private String length;

    private String id;

    private String category;

    private String permalink;

    private String title;

    private String[] tags;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getQuote ()
    {
        return quote;
    }

    public void setQuote (String quote)
    {
        this.quote = quote;
    }

    public String getAuthor ()
    {
        return author;
    }

    public void setAuthor (String author)
    {
        this.author = author;
    }

    public String getBackground ()
    {
        return background;
    }

    public void setBackground (String background)
    {
        this.background = background;
    }

    public String getLength ()
    {
        return length;
    }

    public void setLength (String length)
    {
        this.length = length;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getCategory ()
    {
        return category;
    }

    public void setCategory (String category)
    {
        this.category = category;
    }

    public String getPermalink ()
    {
        return permalink;
    }

    public void setPermalink (String permalink)
    {
        this.permalink = permalink;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String[] getTags ()
    {
        return tags;
    }

    public void setTags (String[] tags)
    {
        this.tags = tags;
    }

    @Override
    public String toString()
    {
        return "Qoutes [date = "+date+", quote = "+quote+", author = "+author+", background = "+background+", length = "+length+", id = "+id+", category = "+category+", permalink = "+permalink+", title = "+title+", tags = "+tags+"]";
    }
}
			