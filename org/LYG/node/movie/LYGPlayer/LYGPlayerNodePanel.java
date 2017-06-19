package org.LYG.node.movie.LYGPlayer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import org.LYG.GUI.OSGI.*;
import org.LYG.node.sound.WavRead.WavReadNodeRun;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
public class LYGPlayerNodePanel extends objectPanel
{
	private static final long serialVersionUID = 1L;
	private FileDialog filedialog;
	public LYGPlayerNodePanel(final LYGPlayerNodeRun thisrun)
	{
		setLayout(null);
		jsp = new ScrollPane();
		add(jsp);
		jp=new Panel();
		jp.setLayout(null);
		jp.setBackground(Color.white);
		JButton button = new JButton("Finish");
		button.setBounds(0, 0, 200, 30);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	System.out.println(e.getSource());
                	close=true;
                	thisrun.value=1;
            }
        });   
		jp.add(button);
		JButton readfile= new JButton("Read LYG");
		readfile.setBounds(0, 35, 200, 40);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog=new FileDialog(new Frame(),"readfilechoose",FileDialog.LOAD);
				 filedialog.setVisible(true);
				 thisrun.filepath=filedialog.getDirectory()+filedialog.getFile();
			     System.out.println(thisrun.filepath);

				}
			});
		jp.add(readfile);
		
		
		jsp.add(jp);
		close=false;
		this.setClosable(true);
 	}
	public void config()
	{    
		System.out.println("configued");      
	}
}
