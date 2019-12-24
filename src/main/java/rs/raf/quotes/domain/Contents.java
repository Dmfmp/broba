package rs.raf.quotes.domain;

public class Contents{
	
    private String copyright;

    private Quotes[] quotes;

    public String getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (String copyright)
    {
        this.copyright = copyright;
    }

    public Quotes[] getQuotes ()
    {
        return quotes;
    }

    public void setQuotes (Quotes[] quotes)
    {
        this.quotes = quotes;
    }

    @Override
    public String toString()
    {
        return "Contents [copyright = "+copyright+", quotes = "+quotes+"]";
    }
}