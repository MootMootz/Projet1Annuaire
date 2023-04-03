package fr.isika.cda24.TPAnnuaire.JFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DeuxiemeFenetre extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		BorderPane root = new BorderPane();

		// Etape 01: Les créations et instanciations des variables pour la HBox en haut:

		Label lbl1 = new Label("Login : ");
		TextField tf1 = new TextField("Login");
		Label lbl2 = new Label("Mot de passe : ");
		PasswordField pf1 = new PasswordField();
		Button btn1 = new Button("Valider");

		HBox hBox1 = new HBox();

		hBox1.getChildren().addAll(lbl1, tf1, lbl2, pf1, btn1);
		hBox1.setPrefSize(800, 50);
		hBox1.setStyle("-fx-background-color:#fffff0");
		hBox1.setPrefSize(800, 50);
		hBox1.setAlignment(Pos.CENTER);
		hBox1.setSpacing(10);
		hBox1.setPadding(new Insets(20));

		// Etape 02: Les créations et instanciantions des éléments de recherche à
		// gauche:

		VBox vBox1 = new VBox();

		Label lbl3 = new Label("Nom :");
		TextField tf2 = new TextField("Nom");
		Label lbl4 = new Label("Prénom :");
		TextField tf3 = new TextField("Prénom");
		Label lbl5 = new Label("Département :");
		TextField tf4 = new TextField("Département");
		Label lbl6 = new Label("Année :");
		TextField tf5 = new TextField("Année");
		Label lbl7 = new Label("Promotion :");
		TextField tf6 = new TextField("Promotion");

		Button btn2 = new Button("Rechercher");
		Button btn3 = new Button("Imprimer");
		Button btn4 = new Button("Modifier");
		Button btn5 = new Button("Supprimer");
		Button btn6 = new Button("Mettre à jour");

		vBox1.getChildren().addAll(lbl3, tf2, lbl4, tf3, lbl5, tf4, lbl6, tf5, lbl7, tf6, btn2, btn3, btn4, btn5, btn6);
		// Info chiffres (colonne, ligne) :
//		vBox1.addRow(lbl3, 0,1);
		vBox1.setPrefSize(300, 600);
		vBox1.setStyle("-fx-background-color:#fffff0");
		vBox1.setPrefSize(800, 100);
		vBox1.setSpacing(10);
		vBox1.setAlignment(Pos.CENTER_LEFT);
		vBox1.setMaxSize(250, 600);
		vBox1.setPadding(new Insets(20));
		
		VBox.setVgrow(btn2, Priority.ALWAYS);

		root.setTop(hBox1);
		root.setLeft(vBox1);
//		root.setVgap(10);

		root.setStyle("-fx-background-color:#fffff0; -fx-font-family:'serif';");

		Scene scene = new Scene(root, 800, 600);
		stage.setScene(scene);
		stage.setTitle("Annuaire - Page de consultation");
		stage.show();

	}

}
