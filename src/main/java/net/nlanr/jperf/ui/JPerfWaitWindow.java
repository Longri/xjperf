/**
 * - 02/2008: Class created by Nicolas Richasse
 * 
 * Changelog:
 * 	- class created
 * 
 *-05/2009:
 *	- code improved
 */


package net.nlanr.jperf.ui;

import org.jdesktop.swingx.JXBusyLabel;

import javax.swing.*;
import java.awt.*;

public class JPerfWaitWindow extends JDialog
{
	private JFrame parent;
	
	public JPerfWaitWindow(JFrame parent)
	{
		super(parent, "Stopping Iperf3...", false);
		this.parent = parent;
		setFocusableWindowState(false);
		setFocusable(false);
		init();
	}
	
	private void init()
	{
		this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		
		JLabel messageLabel = new JLabel("Please wait while Iperf3 is stopping...");
		messageLabel.setHorizontalAlignment(JLabel.CENTER);
		JXBusyLabel busyLabel = new JXBusyLabel();
		busyLabel.setOpaque(false);
		busyLabel.setBusy(true);
		busyLabel.setHorizontalAlignment(JLabel.CENTER);
		
		super.setLayout(new BorderLayout());
		add(messageLabel, BorderLayout.NORTH);
		add(busyLabel, BorderLayout.CENTER);
		pack();
		
		this.setLocationRelativeTo(parent);
	}
}
