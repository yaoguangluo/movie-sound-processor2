package org.LYG.node.movie.LYGWrite;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

import movieProcessor.lygFileIO;

import org.LYG.GUI.OSGI.*;

public class LYGWriteNodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public LYGWriteNodeRun()throws IOException
 	{	
 	}
	public void run(final LYGWriteNodeView thisview) throws IOException, UnsupportedAudioFileException
	{		
		toplygin = new lygFileIO();
		toplygin.reset();
		toplygin.lygRead(filepath);
		//IO.lygRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newluo.lyg");
		toplygin.init();
	    thisview.lygout=toplygin;
	    System.out.println("run end");
	}
}
