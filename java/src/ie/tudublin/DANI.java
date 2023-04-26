package ie.tudublin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Follow> follows = new ArrayList<Follow>();

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	public String word = " ";
	public int count = 0;


	public void findWord(String string)
	{
		// iterate through array list
		// if word matches next word, count ++
		for (Follow f:follows)
		{
			if (f.getWord().equals(string))
			{
				count++;
			}
		}
	}

	// created my own method to check if the file contents
	// are being loaded correctly
	public void displayFile()
	{
		for(Follow f:follows)
		{
			println(f);
		}
	}

	public void loadFile()
	{
		BufferedReader input = null;

		try {

			input = new BufferedReader(new FileReader("data/small.txt"));

			
			String line;


			// read entire file
			while((line = input.readLine()) != null)
			{

				// make new array to hold words
				String[] words = line.split("\\s+");

				// for each word, add it to array list
				for(String word:words)
				{
					findWord(word);
					follows.add(new Follow(word, count));
				}

			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (input != null)
			{
				try {
					input.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}

	}

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);

		loadFile();
		displayFile();
       
	}

	public void keyPressed() {

		// space to start program here

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);

        
	}
}
