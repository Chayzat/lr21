package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private TextArea txt_x;
    @FXML
    private TextArea txt_2;
    @FXML
    private TextArea txt_b;
    @FXML
    private TextArea txt_rs;
    @FXML
    private TextArea txt_rr;

    public void btn_ok_ch(ActionEvent actionEvent) {
        double x=Double.parseDouble(txt_x.getText());
        double a=Double.parseDouble(txt_2.getText());
        double b=Double.parseDouble(txt_b.getText());
      if(x>=7){
          double d=x*Math.pow(a+b,2);
          txt_rs.setText(String.valueOf(d));
       }
     else{

          double y=(x+4)/(a*a+b*b);
          txt_rs.setText(String.valueOf(y));
      txt_rr.setText("При x<=7, А и В не могут одновременно равняться нулю!");
      }
    }

    public void btn_cl_ch(ActionEvent actionEvent) {
        txt_x.setText("");
        txt_2.setText("");
        txt_b.setText("");
    }
@FXML
private Button btn_ex;
    public void btn_ex_ch(ActionEvent actionEvent) {
        Stage stage = (Stage) btn_ex.getScene().getWindow();
        stage.close();
    }
}
