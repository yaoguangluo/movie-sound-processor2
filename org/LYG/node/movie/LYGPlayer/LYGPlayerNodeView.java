package org.LYG.node.movie.LYGPlayer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.geom.Line2D;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JButton;

import org.LYG.GUI.OSGI.*;

import soundProcessor.soundWaveVector;

public class LYGPlayerNodeView extends objectView
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public Vector lines = new Vector();
	public AudioInputStream cur;
	public int pos;
	public LYGPlayerNodeView()
	{
 	}
	public void view() throws Exception
	{
		jsp = new ScrollPane();
		//show graph
		soundWaveVector sv = new soundWaveVector();
		lines = sv.getVectorLines(lygout);

		jp=new Panel()
		{
			private static final long serialVersionUID = 1L;

			public void paint(Graphics g) {

		     	  Dimension d = this.getSize();
		          int w = 800;
		          int h = 600;
		         // System.out.println(d.width+"**"+d.height);
		          int INFOPAD = 15;
		          //Graphics g= getGraphics();  
		          Graphics2D g2 = (Graphics2D) g;
		          g2.setBackground(Color.white);
		          g2.clearRect(0, 0, w, h);
		          g2.setColor(Color.white);
		          g2.fillRect(0, h-INFOPAD, w, INFOPAD);
		              if (lygout != null) {
		                  // .. render sampling graph ..
		                  g2.setColor(Color.black);
		                  for (int i = 1; i < lines.size(); i++) {
		                	  Line2D v=(Line2D) lines.get(i);
		                	  System.out.println("linenumber"+i+"codin->"+v.getX1()+"|"+v.getY1()+"|"+v.getX2()+"|"+v.getY2());
		                      g2.draw((Line2D) lines.get(i));
		                  }
		              }
		     }
		};	
		//
		jsp.add(jp);
		add(jsp);
		close=false;
		this.setClosable(true);	
		this.resizable=true;
	}
	    @Override  
	    public objectView clone() {   
	        addr = (objectView)super.clone();  
	        return addr;  
	    }  
	
	
}
