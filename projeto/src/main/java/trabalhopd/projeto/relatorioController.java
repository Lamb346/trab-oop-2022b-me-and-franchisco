package trabalhopd.projeto;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;


import static javafx.application.Platform.exit;

public class relatorioController {

    @FXML private static Label point1;
    @FXML private static CheckBox q1;
    @FXML private Label point2;

    public static void Summ(){
        System.out.println("AQUI");
    }
    public void pontuation(Aluno alunool){
        point2.setText(String.valueOf(alunool.getpontuacao()));
    }
    public void cancel(Event event){
        exit();
    }
//dataController.catchInfos.alunool+

}