package org.example;
import javafx.application*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Practica3 extends Application {

    @Override
    public void start(Stage primaryStage) {

        // -------- VENTANA 1 (Selector) --------
        ComboBox<String> combo = new ComboBox<>();
        combo.getItems().addAll(
                "FlowPane",
                "BorderPane",
                "GridPane",
                "VBox",
                "HBox"
        );
        combo.setValue("FlowPane");

        VBox root = new VBox();
        root.setSpacing(10);
        root.getChildren().addAll(new Label("Selecciona un Layout:"), combo);

        Scene scene1 = new Scene(root, 300, 120);
        primaryStage.setTitle("Selector de Layouts");
        primaryStage.setScene(scene1);
        primaryStage.show();


        // -------- VENTANA 2 (Componentes) --------
        Stage ventana2 = new Stage();
        ventana2.setTitle("Componentes de Interfaz");

        // Componentes
        Label etiqueta = new Label("Etiqueta");
        Button boton = new Button("Botón");
        TextField texto = new TextField("Escribe aquí");
        CheckBox check = new CheckBox("Opción");
        RadioButton radio = new RadioButton("Radio");

        FlowPane layoutInicial = new FlowPane();
        layoutInicial.setHgap(10);
        layoutInicial.setVgap(10);
        layoutInicial.getChildren().addAll(etiqueta, boton, texto, check, radio);

        Scene scene2 = new Scene(layoutInicial, 400, 250);
        ventana2.setScene(scene2);
        ventana2.show();


        // -------- EVENTO DEL COMBOBOX --------
        combo.setOnAction(e -> {

            String seleccion = combo.getValue();

            if (seleccion.equals("FlowPane")) {

                FlowPane flow = new FlowPane();
                flow.setHgap(10);
                flow.setVgap(10);
                flow.getChildren().addAll(etiqueta, boton, texto, check, radio);
                ventana2.setScene(new Scene(flow, 400, 250));

            } else if (seleccion.equals("BorderPane")) {

                BorderPane border = new BorderPane();
                border.setTop(etiqueta);
                border.setBottom(boton);
                border.setLeft(texto);
                border.setRight(check);
                border.setCenter(radio);
                ventana2.setScene(new Scene(border, 400, 250));

            } else if (seleccion.equals("GridPane")) {

                GridPane grid = new GridPane();
                grid.setHgap(10);
                grid.setVgap(10);
                grid.add(etiqueta, 0, 0);
                grid.add(boton, 1, 0);
                grid.add(texto, 0, 1);
                grid.add(check, 1, 1);
                grid.add(radio, 0, 2);
                ventana2.setScene(new Scene(grid, 400, 250));

            } else if (seleccion.equals("VBox")) {

                VBox vbox = new VBox();
                vbox.setSpacing(10);
                vbox.getChildren().addAll(etiqueta, boton, texto, check, radio);
                ventana2.setScene(new Scene(vbox, 400, 250));

            } else if (seleccion.equals("HBox")) {

                HBox hbox = new HBox();
                hbox.setSpacing(10);
                hbox.getChildren().addAll(etiqueta, boton, texto, check, radio);
                ventana2.setScene(new Scene(hbox, 400, 250));
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
        import javafx.scene.layout.*;
        import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // -------- VENTANA 1 (Selector) --------
        ComboBox<String> combo = new ComboBox<>();
        combo.getItems().addAll(
                "FlowPane",
                "BorderPane",
                "GridPane",
                "VBox",
                "HBox"
        );
        combo.setValue("FlowPane");

        VBox root = new VBox();
        root.setSpacing(10);
        root.getChildren().addAll(new Label("Selecciona un Layout:"), combo);

        Scene scene1 = new Scene(root, 300, 120);
        primaryStage.setTitle("Selector de Layouts");
        primaryStage.setScene(scene1);
        primaryStage.show();


        // -------- VENTANA 2 (Componentes) --------
        Stage ventana2 = new Stage();
        ventana2.setTitle("Componentes de Interfaz");

        // Componentes
        Label etiqueta = new Label("Etiqueta");
        Button boton = new Button("Botón");
        TextField texto = new TextField("Escribe aquí");
        CheckBox check = new CheckBox("Opción");
        RadioButton radio = new RadioButton("Radio");

        FlowPane layoutInicial = new FlowPane();
        layoutInicial.setHgap(10);
        layoutInicial.setVgap(10);
        layoutInicial.getChildren().addAll(etiqueta, boton, texto, check, radio);

        Scene scene2 = new Scene(layoutInicial, 400, 250);
        ventana2.setScene(scene2);
        ventana2.show();


        // -------- EVENTO DEL COMBOBOX --------
        combo.setOnAction(e -> {

            String seleccion = combo.getValue();

            if (seleccion.equals("FlowPane")) {

                FlowPane flow = new FlowPane();
                flow.setHgap(10);
                flow.setVgap(10);
                flow.getChildren().addAll(etiqueta, boton, texto, check, radio);
                ventana2.setScene(new Scene(flow, 400, 250));

            } else if (seleccion.equals("BorderPane")) {

                BorderPane border = new BorderPane();
                border.setTop(etiqueta);
                border.setBottom(boton);
                border.setLeft(texto);
                border.setRight(check);
                border.setCenter(radio);
                ventana2.setScene(new Scene(border, 400, 250));

            } else if (seleccion.equals("GridPane")) {

                GridPane grid = new GridPane();
                grid.setHgap(10);
                grid.setVgap(10);
                grid.add(etiqueta, 0, 0);
                grid.add(boton, 1, 0);
                grid.add(texto, 0, 1);
                grid.add(check, 1, 1);
                grid.add(radio, 0, 2);
                ventana2.setScene(new Scene(grid, 400, 250));

            } else if (seleccion.equals("VBox")) {

                VBox vbox = new VBox();
                vbox.setSpacing(10);
                vbox.getChildren().addAll(etiqueta, boton, texto, check, radio);
                ventana2.setScene(new Scene(vbox, 400, 250));

            } else if (seleccion.equals("HBox")) {

                HBox hbox = new HBox();
                hbox.setSpacing(10);
                hbox.getChildren().addAll(etiqueta, boton, texto, check, radio);
                ventana2.setScene(new Scene(hbox, 400, 250));
            }

        });

    }

    public static void main(String[] args) {
        launch(args);
    }
}

