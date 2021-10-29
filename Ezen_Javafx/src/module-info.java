module FX {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
	opens Day01 to javafx.graphics, javafx.fxml;
	opens App to javafx.graphics, javafx.fxml;
	opens Controller to javafx.graphics, javafx.fxml;
	opens Day02 to javafx.graphics, javafx.fxml;
}