module com.example.mix_farieb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mix_farieb to javafx.fxml;
    exports com.example.mix_farieb;
}