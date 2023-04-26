package ie.tudublin;

import java.util.ArrayList;

public class Word {
    
    public String word = " ";

    ArrayList<Follow> follows;

    // constructor
    public Word(String word)
    {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    // getters and setters
    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public ArrayList<Follow> getFollow()
    {
        return follows;
    }

    public void setFollow(ArrayList<Follow> follows)
    {
        this.follows = follows;
    }

    @Override
    public String toString()
    {
        
        StringBuffer sb = new StringBuffer();

        for (Follow f:follows)
        {
            sb.append(f + " ");
        }

        return sb.toString();

    }
}
