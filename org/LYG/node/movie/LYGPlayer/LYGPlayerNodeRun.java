package org.LYG.node.movie.LYGPlayer;
import java.io.IOException;


import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import movieProcessor.lygFileIO;

import org.LYG.GUI.OSGI.*;

public class LYGPlayerNodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public String writefile;
	jp jj;
	public String filepathWAV;
	public LYGPlayerNodeRun()throws IOException
 	{	
 	}
	public void run(final LYGPlayerNodeView thisview) throws IOException, UnsupportedAudioFileException
	{		
		 thisview.lygout = new lygFileIO();
		 jj = new jp(filepath);			
		 JFrame ff = new JFrame();
		 ff.add(jj);
	     ff.setSize(800, 600);
	     ff.setVisible(true);
	     System.out.println("run end");
	}
}
