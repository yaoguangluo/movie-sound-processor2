package org.LYG.node.movie.LYGPlayer;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;
import org.LYG.node.sound.WavRead.WavReadNodeInterface;
import org.LYG.node.sound.WavRead.WavReadNodePanel;
import org.LYG.node.sound.WavRead.WavReadNodeRun;
import org.LYG.node.sound.WavRead.WavReadNodeView;
public class LYGPlayerNodeInterface extends objectInterface
{	
	public LYGPlayerNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisname=new String("LYGPlayer");
		position=new String("MOVIE");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage = img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new LYGPlayerNodeView();
		thisrun=new LYGPlayerNodeRun();
		thispanel=new LYGPlayerNodePanel((LYGPlayerNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((LYGPlayerNodeRun) thisrun).run((LYGPlayerNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new LYGPlayerNodeInterface();   
	        return stu;  
	}
}
