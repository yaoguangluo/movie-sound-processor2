package org.LYG.node.movie.LYGWrite;
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
public class LYGWriteNodeInterface extends objectInterface
{	
	public LYGWriteNodeInterface() throws IOException
 	{
		thisicon=new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisname=new String("LYGWrite");
		position=new String("MOVIE");
		Image img = ((ImageIcon) thisicon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisimage=img.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH );
		thisicon = new ImageIcon(newimg);
 	}
	public void config() throws IOException
	{
		thisview=new LYGWriteNodeView();
		thisrun=new LYGWriteNodeRun();
		thispanel=new LYGWriteNodePanel((LYGWriteNodeRun) thisrun);
		thispanel.config();
		showed=false;
	}
	public void execute() throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((LYGWriteNodeRun) thisrun).run((LYGWriteNodeView) thisview);
	}
	public void view() throws Exception
	{
		thisview.view();
		showed=true;
	}
	public objectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        stu = new LYGWriteNodeInterface();   
	        return stu;  
	}
}
