package Files;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Background

		if (Var.ingame == true) {
			g.drawImage(Var.BackLvl1, Var.backx, 0, 3840, 720, null);
		}

		if (Var.startscreen == true) {
			g.drawImage(Var.gifStartscreen, 0, 0, Var.screenwidth, Var.screenheight, null);

		}

		// SpielCharakter
		if (Var.standstill == true && Var.moveright == false && Var.moveleft == false && Var.ingame == true) {
			g.drawImage(Var.gifStandstill, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
		}

		if (Var.moveright == true && Var.moveleft == false) {
			g.drawImage(Var.gifAnimright, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
		}

		if (Var.moveleft == true && Var.moveright == false) {
			g.drawImage(Var.gifAnimleft, Var.x, Var.y, Var.Charwitdh, Var.Charheight, null);
		}

		if (Var.attack == true) {
			g.drawImage(Var.gifAttack, Var.x, Var.y, 384, 256, null);
		}

		if (Var.enemyExists == true) {
			g.drawImage(Var.gifEnemystand, Var.enemyx, Var.enemyy, 256, 256, null);
		} else if (Var.enemyIsDying == true) {
			g.drawImage(Var.gifEnemydying, Var.enemyx, Var.enemyy, 256, 256, null);
		}

	/*
	  	if (Var.Johnnystand == true) {
			if (Var.moveleft == true) {
				g.drawImage(Var.JohnnyStand, Var.x + 300, Var.y, 256, 256, null);
			} else {
				g.drawImage(Var.JohnnyStand, Var.x - 300, Var.y, 256, 256, null);
			}
		} else if (Var.Johnnymove == true) {
			if (Var.moveleft == true) {
				g.drawImage(Var.JohnnyBorad, Var.x + 300, Var.y - 64, 256, 320, null);
			} else {
				g.drawImage(Var.JohnnyBorad, Var.x - 300, Var.y - 64, 256, 320, null);
			}
		}
	 */
		// Koordinaten
		g.drawString("BackX: " + Var.backx, 20, 20);
		g.drawString("Var.x: " + Var.x, 20, 40);

		repaint();

	}

}
