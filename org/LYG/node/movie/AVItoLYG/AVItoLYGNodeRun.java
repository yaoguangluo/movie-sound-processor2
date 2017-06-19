package org.LYG.node.movie.AVItoLYG;
import java.io.IOException;


import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import movieProcessor.lygFileIO;

import org.LYG.GUI.OSGI.*;
import org.LYG.node.movie.AVItoLYG.jp;

public class AVItoLYGNodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public String writefile;
	jp jj;
	public String filepathWAV;
	public AVItoLYGNodeRun()throws IOException
 	{	
 	}
	public void run(final AVItoLYGNodeView thisview) throws IOException, UnsupportedAudioFileException
	{		
		 thisview.lygout = new lygFileIO();
		 jj = new jp(filepath ,filepathWAV,writefile, thisview.lygout);			
		 JFrame ff = new JFrame();
		 ff.add(jj);
	     ff.setSize(500, 200);
	     ff.setVisible(true);
	    System.out.println("run end");
	}
}
