package lu.uni.adtool;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.*;

import org.jvnet.substance.skin.SubstanceAutumnLookAndFeel;
import org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel;
import org.jvnet.substance.skin.SubstanceBusinessBlueSteelLookAndFeel;
import org.jvnet.substance.skin.SubstanceCremeLookAndFeel;
import org.jvnet.substance.skin.SubstanceMistAquaLookAndFeel;
import org.jvnet.substance.skin.SubstanceModerateLookAndFeel;
import org.jvnet.substance.skin.SubstanceNebulaLookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel;
import org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel;
import org.jvnet.substance.skin.SubstanceSaharaLookAndFeel;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;

import lu.uni.adtool.ui.MainWindow;

public final class Main
{
  private Main()
  {
  }
  public static void main(final String[] args)
  {
      try {
    	  //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    	  
    	  //String lookAndFeel="javax.swing.plaf.metal.MetalLookAndFeel";   //Metal风格
    	  //String lookAndFeel="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";  //Windows风格
    	  //String lookAndFeel="com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel";   //Windows经典风格
    	  //String lookAndFeel ="com.sun.java.swing.plaf.motif.MotifLookAndFeel";    //Motif风格
    	  //String lookAndFeel =UIManager.getCrossPlatformLookAndFeelClassName();  
    	  //UIManager.setLookAndFeel(lookAndFeel);
    	  
    	  JFrame.setDefaultLookAndFeelDecorated(true);
    	  JDialog.setDefaultLookAndFeelDecorated(true);
    	  //UIManager.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());    //
    	  //UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());      //
    	  UIManager.setLookAndFeel(new SubstanceCremeLookAndFeel());    //待定
    	  //UIManager.setLookAndFeel(new SubstanceSaharaLookAndFeel());
    	  //UIManager.setLookAndFeel(new SubstanceModerateLookAndFeel()); //
    	  //UIManager.setLookAndFeel(new SubstanceOfficeSilver2007LookAndFeel());  //待定
    	  //UIManager.setLookAndFeel(new SubstanceOfficeBlue2007LookAndFeel());  //待定
    	  //UIManager.setLookAndFeel(new SubstanceNebulaLookAndFeel());   //待定
    	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        new MainWindow(args);
      }
    });
  }
}
