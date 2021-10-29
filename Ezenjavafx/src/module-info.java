module Ezenjavafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires mail;
	requires activation;
	

	opens app to javafx.graphics, javafx.fxml;
	opens Controller to javafx.graphics, javafx.fxml;
	opens dao to java.sql;
	opens domain to mail, activation;
}
