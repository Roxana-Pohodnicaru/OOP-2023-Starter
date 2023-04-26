package ie.tudublin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	ArrayList<Word> model = new ArrayList<Word>();

    
	public String word = " ";
	public int count = 0;

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	// show contents of file
	public void printModel()
	{
		for(Word w:model)
		{
			println(w);
		}
	}

	public Word findWord(String string)
	{
		for (Word w:model)
		{
			if (w.getWord().equals(string))
			{
				return w;
			}
		}

		return null;
	}

	public void loadFile()
	{

		String[] lines = loadStrings("small.txt");
		String[] words;
		String w;
		String next;

		for (String l:lines)
		{
			words = split(l, ' ');

			for (int i = 0; i < words.length; i++)
			{
				w = words[i].replaceAll("[^\\w\\s]", "");
				w.toLowerCase();

				Word word = findWord(w);

				// adding to arraylist
				if (word == null)
				{
					word = new Word(w);
					model.add(word);

				}

				// need to check for next word in list
				// if thats true
				// incrementFollows(next);

			}
		}

		// not sure why but this code no longer 
		// prints the text file
		// BufferedReader input = null;

		// try {

		// 	input = new BufferedReader(new FileReader("data/small.txt"));

			
		// 	String line;
		// 	String words[];

		// 	// read entire file
		// 	while((line = input.readLine()) != null)
		// 	{
		// 		words = line.split(" ");

		// 		// for each word, add it to array list
		// 		for(String w:words)
		// 		{
		// 			model.add(new Word(w));
		// 		}

		// 	}
		// }
		// catch (IOException e)
		// {
		// 	e.printStackTrace();
		// }
		// finally
		// {
		// 	if (input != null)
		// 	{
		// 		try {
		// 			input.close();
		// 		}
		// 		catch(Exception e)
		// 		{
		// 			e.printStackTrace();
		// 		}
		// 	}
		// }

	}

	String[] sonnet;

    public String[] writeSonnet()
    {
		// 14 lines
		sonnet = new String[14];

		for (int i = 0; i < sonnet.length; i++)
		{
			for ( int j = 0; j < 8; j ++)
			{
				// pick a word randomly to form a sentence
			}
		}
    
		return null;
    }

	public void setup() {
		colorMode(HSB);

		loadFile();
		printModel();
       
	}

	public void keyPressed() {

		if (key == ' ')
		{
			//writeSonnet();
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
