module be.ac.umons.projet.projetumons {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.ac.umons.projet.projetumons to javafx.fxml;
    exports be.ac.umons.projet.projetumons;
}