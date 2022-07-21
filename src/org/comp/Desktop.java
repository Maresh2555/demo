package org.comp;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("Desktop size is 1200mm");
	}
	public static void main(String[] args) {
		Desktop d= new Desktop();
		d.desktopSize();
		d.computerModel();
	}
}
