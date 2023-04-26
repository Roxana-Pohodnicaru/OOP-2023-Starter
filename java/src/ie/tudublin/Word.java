package ie.tudublin;

import java.util.ArrayList;

public class Word {
    
    public String word = " ";

    ArrayList<Follow> follows = new ArrayList<Follow>();

    // constructor
    public Word(String word)
    {
        this.word = word;
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
