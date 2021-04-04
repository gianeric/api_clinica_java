package br.com.clinica.application;

import br.com.clinica.application.view.ViewCadastroCidade;
import br.com.clinica.application.view.ViewCadastroCliente;
import br.com.clinica.application.view.ViewCadastroServico;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import br.com.clinica.utils.Alerts;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewMainControler implements Initializable {

    @FXML
    private MenuItem menuItemCadastroCidade;
    @FXML
    private MenuItem menuItemCadastroCliente;
    @FXML
    private MenuItem menuItemCadastroServico;
    @FXML
    private MenuItem menuItemAgendamento;
    @FXML
    private MenuItem menuItemRelatorioCidade;
    @FXML
    private MenuItem menuItemRelatorioCliente;
    @FXML
    private MenuItem menuItemRelatorioServico;
    @FXML
    private MenuItem menuItemRelatorioAgendamento;

    @FXML
    public void onMenuItemCadastroCidade() {
        try {
            ViewCadastroCidade vwCadastroCidade = new ViewCadastroCidade();
            vwCadastroCidade.start(new Stage());
        } catch (IOException e) {
            Alerts.showAlert("IOException", "Error loading View", e.getMessage(), Alert.AlertType.ERROR);
        } catch (Exception e) {
            Alerts.showAlert("IOException", "Error loading View", e.getMessage(), Alert.AlertType.ERROR);
            //e.printStackTrace();
        }
    }

    @FXML
    public void onMenuItemCadastroCliente() {
        try {
            ViewCadastroCliente vwCadastroCliente = new ViewCadastroCliente();
            vwCadastroCliente.start(new Stage());
        } catch (IOException e) {
            Alerts.showAlert("IOException", "Error loading View", e.getMessage(), Alert.AlertType.ERROR);
        } catch (Exception e) {
            Alerts.showAlert("IOException", "Error loading View", e.getMessage(), Alert.AlertType.ERROR);
            //e.printStackTrace();
        }
    }

    @FXML
    public void onMenuItemCadastroServico() {
        try {
            ViewCadastroServico vwCadastroServico = new ViewCadastroServico();
            vwCadastroServico.start(new Stage());
        } catch (IOException e) {
            Alerts.showAlert("IOException", "Error loading View", e.getMessage(), Alert.AlertType.ERROR);
        } catch (Exception e) {
            Alerts.showAlert("IOException", "Error loading View", e.getMessage(), Alert.AlertType.ERROR);
            //e.printStackTrace();
        }
    }

    @FXML
    public void onMenuItemAgendamento() {
        System.out.println("Cadastro");
    }

    @FXML
    public void onMenuItemRelatorioCidade() {
        System.out.println("Cadastro");
    }

    @FXML
    public void onMenuItemRelatorioCliente() {
        System.out.println("Cadastro");
    }

    @FXML
    public void onMenuItemRelatorioServico() {
        System.out.println("Agendamentos");
    }

    @FXML
    public void onMenuItemRelatorioAgendamento() {
        System.out.println("Relatorios");
    }

    @Override
    public void initialize(URL uri, ResourceBundle rb) {

    }

    private void loadView(String absoluteName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            AnchorPane newAnchorPane = loader.load();

//            Scene mainScene = ViewMain.getMainScene();
//            ScrollPane mainScrollpane = ((ScrollPane) mainScene.getRoot().getContent());
        } catch (IOException e) {
            Alerts.showAlert("IOException", "Error loading View", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}
