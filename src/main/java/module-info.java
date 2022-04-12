module com.example.mu_ku_202_2022 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.mu_ku_202_2022 to javafx.fxml;
    exports com.example.mu_ku_202_2022;
}