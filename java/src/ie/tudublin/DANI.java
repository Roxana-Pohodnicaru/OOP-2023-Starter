package ie.tudublin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> model = new ArrayList<Word>();

    String[] sonnet;
	public String word = " ";
	public int count = 0;

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	// created my own method to check if the file contents
	// are being loaded correctly
	public void displayFile()
	{
		for(Word w:model)
		{
			println(w);
		}
	}

	public void loadFile()
	{
		BufferedReader input = null;

		try {

			input = new BufferedReader(new FileReader("data/small.txt"));

			
			String line;
			String words[];

			// read entire file
			while((line = input.readLine()) != null)
			{
				words = line.split("\\s+");

				// for each word, add it to array list
				for(String w:words)
				{
					model.add(new Word(w));
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

		if (key == ' ')
		{
			// write sonnet
		}

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
