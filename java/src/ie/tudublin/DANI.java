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
	String word = " ";
	int count = 0;


	public void findWord(Follow word)
	{
		// iterate through array list
		// if word matches next word, count ++
		for (Follow f:follows)
		{
			word = f;

			if(follows.contains(word))
			{
				count++;
			}	
		}
	}


	public void loadFile()
	{
		BufferedReader input = null;

		try {

			input = new BufferedReader(new FileReader("small.txt"));

			

			// read entire file
			while((word = input.readLine()) != null)
			{
				// add word to array list
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
