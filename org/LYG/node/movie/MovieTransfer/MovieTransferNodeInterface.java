package org.LYG.node.movie.MovieTransfer;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.media.NoDataSinkException;
import javax.media.NoProcessorException;
import javax.media.NotRealizedError;

import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.*;

import org.LYG.GUI.OSGI.*;

public class MovieTransferNodeInterface extends objectInterface
{	
	public MovieTransferNodeInterface() throws IOException
 	{
		thisicon = new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisname = new String("MovieTransfer");
		position = new String("MOVIE");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage = img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview = new MovieTransferNodeView();
		thisrun = new MovieTransferNodeRun();
		thispanel = new MovieTransferNodePanel((MovieTransferNodeRun) thisrun);
		thispanel.config();
		showed = false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		try {
			((MovieTransferNodeRun) thisrun).run((MovieTransferNodeView) thisview);
		} catch (NoProcessorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoDataSinkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotRealizedError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void view() throws Exception
	{
		thisview.view();
		showed = true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new MovieTransferNodeInterface();   
	        return stu;  
	}
}
