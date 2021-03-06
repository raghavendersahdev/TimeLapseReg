//====================================================================================================
// Project: SpotCaliper
// 
// Authors: Zsuzsanna Puspoki and Daniel Sage
// Organization: Biomedical Imaging Group (BIG), Ecole Polytechnique Federale de Lausanne
// Address: EPFL-STI-IMT-LIB, 1015 Lausanne, Switzerland
//
// Information: http://bigwww.epfl.ch/algorithms/spotcaliper/
//
// References:
// Zsuzsanna Puspoki et al.
// SpotCaliper: Fast Wavelet-based Spot Detection with Accurate Size Estimation 
// Bioinformatics Oxford, submitted in June 2015.
// Available at: http://bigwww.epfl.ch/publications/
//
// Conditions of use:
// You'll be free to use this software for research purposes, but you should not redistribute 
// it without our consent. In addition, we expect you to include a citation whenever you 
// present or publish results that are based on it.
//====================================================================================================
package timelapsereg.gui.components;

import java.awt.Color;

import javax.swing.JComboBox;

public class ColorName {

	public static String[]	names	= {"Maroon", "Red", "Purple", "Fuchsia", "Green", "Lime", "Olive", "Yellow", "Navy", "Blue", "Teal", "Aqua", "Black", "Silver", "Gray", "White" };

	public static Color[]	colors	= { new Color(0x80, 0x00, 0x00), new Color(0xFF, 0x00, 0x00), new Color(0x80, 0x00, 0x80), new Color(0xFF, 0x00, 0xFF), new Color(0x00, 0x80, 0x00),
			new Color(0x00, 0xFF, 0x00), new Color(0x80, 0x80, 0x00), new Color(0xFF, 0xFF, 0x00), new Color(0x00, 0x00, 0x80), new Color(0x00, 0x00, 0xFF), new Color(0x00, 0x80, 0x80),
			new Color(0x00, 0xFF, 0xFF), new Color(0x00, 0x00, 0x00), new Color(0xC0, 0xC0, 0xC0), new Color(0x80, 0x80, 0x80), new Color(0xFF, 0xFF, 0xFF), new Color(0xFF, 0xF0, 0xFF) };

	public static String getName(Color c) {
		for (int i = 0; i < names.length; i++) {
			if (c.getRed() == colors[i].getRed())
				if (c.getGreen() == colors[i].getGreen())
					if (c.getBlue() == colors[i].getBlue())
						return names[i];
		}
		return "unknown";
	}

	public static Color getColor(String name) {
		for (int i = 0; i < names.length; i++)
			if (names[i].equals(name))
				return colors[i];
		return colors[0];
	}

	public static JComboBox createComboBox() {
		JComboBox cmb = new JComboBox();
		for (String name : names)
			cmb.addItem(name);
		return cmb;
	}
	
	public static Color inverse(Color c) {
		return new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue());
	}
	
	public static Color inverse(Color c, int opacity) {
		return new Color(255 - c.getRed(), 255 - c.getGreen(), 255 - c.getBlue(), opacity);
	}
	
	public static Color opacify(Color c, int opacity) {
		return new Color(c.getRed(), c.getGreen(), c.getBlue(), opacity);
	}
}
