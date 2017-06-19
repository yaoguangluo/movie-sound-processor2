package org.LYG.node.movie.MovieTransfer;

import java.awt.Frame;
import java.io.File;

import java.io.IOException;

import javax.media.DataSink;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoDataSinkException;
import javax.media.NoProcessorException;
import javax.media.NotRealizedError;
import javax.media.Processor;
import javax.media.format.AudioFormat;
import javax.media.format.VideoFormat;
import javax.media.protocol.ContentDescriptor;
import javax.media.protocol.FileTypeDescriptor;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;


import movie.export.ExportWizard;
import movieProcessor.Export;
import movieProcessor.lygFileIO;

import org.LYG.GUI.OSGI.*;

import com.sun.media.format.AviVideoFormat;
import com.sun.media.format.WavAudioFormat;

public class MovieTransferNodeRun extends objectRun
{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public MovieTransferNodeRun()throws IOException
 	{	
 	}
	public void run(final MovieTransferNodeView thisview) throws IOException, UnsupportedAudioFileException, NoProcessorException, NoDataSinkException, NotRealizedError, InterruptedException
	{		
		File f = new File(this.filepath);
		Export e=new Export(f.toURL().toString());	
	    thisview.lygout=toplygin;
	    System.out.println("run end");
	}
}
