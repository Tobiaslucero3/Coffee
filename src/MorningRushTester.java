import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class MorningRushTester
{
	private static final int DELAY = 1000;

	public MorningRushTester()
	{
		
	}
	
	public static void main (String args[])
	{
		final int initialGulps = 5;
		
		JFrame frame = new JFrame();
		
		
		class DrinkCoffee implements ActionListener
		{
			private int gulps;
			
			
			public DrinkCoffee(int inGulps)
			{
				gulps = inGulps;
			}
			
			@Override
			public void actionPerformed(ActionEvent event)
			{
				if(gulps > 0)
				{
					System.out.println(gulps);
				}
				else if(gulps == 0)
				{
					System.out.println("Go to school");
					JOptionPane.showMessageDialog(null, "Make another?");
					gulps = initialGulps;
				}
				--gulps;
			}
		}
		
		DrinkCoffee dc = new DrinkCoffee(5);
		Timer t = new Timer(DELAY, dc);
		t.start();
		
		
		System.exit(0);
	}
}
