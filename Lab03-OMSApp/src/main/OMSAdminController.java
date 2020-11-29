package main;

import cart.CartController;
import media.AdminBookPageController;
import media.UserBookPageController;

import javax.swing.*;

public class OMSAdminController {

	
	public JPanel getBookPage() {
		AdminBookPageController controller = new AdminBookPageController();
		return controller.getDataPagePane();
	}
}
