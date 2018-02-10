// Adnar Lozano
// CIS-18B: Java
// R.Casolaro
// 03/27/2014

import javax.swing.JFrame;

public class LogoAnimator 
{
   // execute animation in a JFrame
   public static void main( String args[] )
   {
      LogoAnimatorJPanel animation = new LogoAnimatorJPanel(); 

      JFrame window = new JFrame( "Animator test" ); // set up window
      window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      window.add( animation ); // add panel to frame

      window.pack();  // make window just large enough for its GUI
      window.setVisible( true );   // display window

      animation.startAnimation();  // begin animation
   } // end main
} // end class LogoAnimator