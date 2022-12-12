module com.georgiancollegeguiassignment3.diyapatel_assignment3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.georgiancollegeguiassignment3.diyapatel_assignment3 to javafx.fxml;
    exports com.georgiancollegeguiassignment3.diyapatel_assignment3;
}