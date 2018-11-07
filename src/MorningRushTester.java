import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
					--gulps;
				}
				else if(gulps == 0)
				{
					System.out.println("Go to school");
				}
			}
		}
		
		DrinkCoffee dc = new DrinkCoffee(5);
		Timer t = new Timer(DELAY, dc);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Make another?");
		System.exit(0);
	}
}
