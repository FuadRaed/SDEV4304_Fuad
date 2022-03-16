package MyQuiz;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyQuiz extends Application {

    Text Question1, Question2, Question3, Question4, Question5,
            Question6, Question7, Question8, Question9, Question10;

    RadioButton Radio1Question1, Radio2Question1, Radio3Question1, Radio4Question1,
            Radio1Question2, Radio2Question2, Radio3Question2, Radio4Question2,
            Radio1Question3, Radio2Question3, Radio3Question3, Radio4Question3,
            Radio1Question4, Radio2Question4, Radio3Question4, Radio4Question4,
            Radio1Question5, Radio2Question5, Radio3Question5, Radio4Question5,
            Radio1Question6, Radio2Question6, Radio3Question6, Radio4Question6,
            Radio1Question7, Radio2Question7, Radio3Question7, Radio4Question7,
            Radio1Question8, Radio2Question8, Radio3Question8, Radio4Question8,
            Radio1Question9, Radio2Question9, Radio3Question9, Radio4Question9,
            Radio1Question10, Radio2Question10, Radio3Question10, Radio4Question10;

    ToggleGroup ToggleGroup1, ToggleGroup2, ToggleGroup3, ToggleGroup4, ToggleGroup5,
            ToggleGroup6, ToggleGroup7, ToggleGroup8, ToggleGroup9, ToggleGroup10;

    Button next1Button1, next2Button1, next3Button1, next4Button1,
            Previous1Button2, Previous2Button2, Previous3Button2,
            Previous4Button2, Previous5Button2,
            FButton, EButton, SButton;

    Label label1, label2, label3;

    VBox vbox, vbox1, vbox2, vbox3;

    HBox hBox;

    FlowPane Pane;

    Stage stage1, stage2, stage3, stage4, stage5, stage6;
    ImageView imageV = new ImageView();
    Image main_icon = new Image("file:src/photo/Group 4.png");

    public void start(Stage primaryStage) throws Exception {

        imageV.setImage(main_icon);
        imageV.setFitWidth(249);
        imageV.setFitHeight(112);
        imageV.setTranslateX(155);
        imageV.setTranslateY(30);
        Label txt = new Label("Start Your Round");
        txt.setStyle("-fx-text-fill:#fff; -fx-font-size:22; -fx-font-weight:bold;");
        txt.setTranslateX(-55);
        txt.setTranslateY(240);
        SButton = new Button("Start");
        SButton.setPrefWidth(249);
        SButton.setPrefHeight(50);
        SButton.setTranslateX(155);
        SButton.setTranslateY(300);
        SButton.setDefaultButton(true);

        SButton.setOnAction(e -> {
            primaryStage.close();
            stage1.show();
        });

        Pane = new FlowPane(SButton, txt, imageV);
        Pane.setPadding(new Insets(10));

        Scene scene = new Scene(Pane, 600, 600);
        scene.getStylesheets().add("file:src/MyQuiz/style2.css");

        primaryStage.setScene(scene);
        primaryStage.setTitle("My Quiz");
        primaryStage.show();

        Question1 = new Text("1) Who is the 2010 FIFA World Cup champion?");
        Question1.setId("question");

        ToggleGroup1 = new ToggleGroup();
        Radio1Question1 = new RadioButton("Germany");
        Radio2Question1 = new RadioButton("Spain");
        Radio3Question1 = new RadioButton("France");
        Radio4Question1 = new RadioButton("Italy");
        Radio1Question1.setToggleGroup(ToggleGroup1);
        Radio2Question1.setToggleGroup(ToggleGroup1);
        Radio3Question1.setToggleGroup(ToggleGroup1);
        Radio4Question1.setToggleGroup(ToggleGroup1);

        vbox1 = new VBox(10, Question1, Radio1Question1, Radio2Question1, Radio3Question1, Radio4Question1);
        vbox1.setPadding(new Insets(20));

        Question2 = new Text("2) Who is the 2008 Champions League champion?");
        Question2.setId("question");

        ToggleGroup2 = new ToggleGroup();
        Radio1Question2 = new RadioButton("Real Madrid");
        Radio2Question2 = new RadioButton("Manchester City");
        Radio3Question2 = new RadioButton("Manchester United");
        Radio4Question2 = new RadioButton("Barcelona");
        Radio1Question2.setToggleGroup(ToggleGroup2);
        Radio2Question2.setToggleGroup(ToggleGroup2);
        Radio3Question2.setToggleGroup(ToggleGroup2);
        Radio4Question2.setToggleGroup(ToggleGroup2);

        vbox2 = new VBox(10, Question2, Radio1Question2, Radio2Question2, Radio3Question2, Radio4Question2);
        vbox2.setPadding(new Insets(20));

        next1Button1 = new Button("Next Question");
        next1Button1.setDefaultButton(true);
        next1Button1.setAlignment(Pos.CENTER);
        next1Button1.setOnAction(e -> {
            stage1.close();
            stage2.show();
        });

        Previous1Button2 = new Button("Back");
        Previous1Button2.setAlignment(Pos.CENTER);
        Previous1Button2.setDisable(true);

        hBox = new HBox(30, Previous1Button2, next1Button1);
        hBox.setAlignment(Pos.CENTER);

        vbox3 = new VBox(20, vbox1, vbox2, hBox);
        Pane = new FlowPane(vbox3);
        Pane.setPadding(new Insets(10));

        scene = new Scene(Pane, 600, 600);
        scene.getStylesheets().add("file:src/MyQuiz/style.css");
        stage1 = new Stage();
        stage1.setScene(scene);
        stage1.setTitle("My Quiz");

        Question3 = new Text("3) Who is the best player in the world in 2003?");
        Question3.setId("question");

        ToggleGroup3 = new ToggleGroup();
        Radio1Question3 = new RadioButton("Zinedine Zidane");
        Radio2Question3 = new RadioButton("Cristiano Ronaldo");
        Radio3Question3 = new RadioButton("Messi");
        Radio4Question3 = new RadioButton("Kaka");
        Radio1Question3.setToggleGroup(ToggleGroup3);
        Radio2Question3.setToggleGroup(ToggleGroup3);
        Radio3Question3.setToggleGroup(ToggleGroup3);
        Radio4Question3.setToggleGroup(ToggleGroup3);

        vbox1 = new VBox(10, Question3, Radio1Question3, Radio2Question3, Radio3Question3, Radio4Question3);
        vbox1.setPadding(new Insets(20));

        Question4 = new Text("4) Who is the best goalkeeper in the world 2016?");
        Question4.setId("question");

        ToggleGroup4 = new ToggleGroup();
        Radio1Question4 = new RadioButton("Gigi Buffon");
        Radio2Question4 = new RadioButton("Ter Stegen");
        Radio3Question4 = new RadioButton("Iker Casillas");
        Radio4Question4 = new RadioButton("Manuel Neuer");
        Radio1Question4.setToggleGroup(ToggleGroup4);
        Radio2Question4.setToggleGroup(ToggleGroup4);
        Radio3Question4.setToggleGroup(ToggleGroup4);
        Radio4Question4.setToggleGroup(ToggleGroup4);

        vbox2 = new VBox(10, Question4, Radio1Question4, Radio2Question4, Radio3Question4, Radio4Question4);
        vbox2.setPadding(new Insets(20));

        next2Button1 = new Button("Next Question");
        next2Button1.setDefaultButton(true);
        next2Button1.setAlignment(Pos.CENTER);
        next2Button1.setOnAction(e -> {
            stage2.close();
            stage3.show();
        });

        Previous2Button2 = new Button("Back");
        Previous2Button2.setAlignment(Pos.CENTER);
        Previous2Button2.setOnAction(e -> {
            stage2.close();
            stage1.show();
        });

        hBox = new HBox(30, Previous2Button2, next2Button1);
        hBox.setAlignment(Pos.CENTER);

        vbox3 = new VBox(20, vbox1, vbox2, hBox);
        Pane = new FlowPane(vbox3);
        Pane.setPadding(new Insets(10));
        scene = new Scene(Pane, 600, 600);
        scene.getStylesheets().add("file:src/MyQuiz/style.css");
        stage2 = new Stage();
        stage2.setScene(scene);
        stage2.setTitle("My Quiz");

        Question5 = new Text("5) Who is the best coach in the world 2020?");
        Question5.setId("question");

        ToggleGroup5 = new ToggleGroup();
        Radio1Question5 = new RadioButton("Jurgen Klopp");
        Radio2Question5 = new RadioButton("Zinedine Zidane");
        Radio3Question5 = new RadioButton("Pep Guardiola");
        Radio4Question5 = new RadioButton("Jose Mourinho");
        Radio1Question5.setToggleGroup(ToggleGroup5);
        Radio2Question5.setToggleGroup(ToggleGroup5);
        Radio3Question5.setToggleGroup(ToggleGroup5);
        Radio4Question5.setToggleGroup(ToggleGroup5);

        vbox1 = new VBox(10, Question5, Radio1Question5, Radio2Question5, Radio3Question5, Radio4Question5);
        vbox1.setPadding(new Insets(20));

        Question6 = new Text("6) Who is the club that won the most Champions League?");
        Question6.setId("question");

        ToggleGroup6 = new ToggleGroup();
        Radio1Question6 = new RadioButton("Real Madrid");
        Radio2Question6 = new RadioButton("Bayern Munich");
        Radio3Question6 = new RadioButton("Liverpool");
        Radio4Question6 = new RadioButton("Milan");
        Radio1Question6.setToggleGroup(ToggleGroup6);
        Radio2Question6.setToggleGroup(ToggleGroup6);
        Radio3Question6.setToggleGroup(ToggleGroup6);
        Radio4Question6.setToggleGroup(ToggleGroup6);

        vbox2 = new VBox(10, Question6, Radio1Question6, Radio2Question6, Radio3Question6, Radio4Question6);
        vbox2.setPadding(new Insets(20));

        next3Button1 = new Button("Next Question");
        next3Button1.setDefaultButton(true);
        next3Button1.setAlignment(Pos.CENTER);
        next3Button1.setOnAction(e -> {
            stage3.close();
            stage4.show();
        });

        Previous3Button2 = new Button("Back");
        Previous3Button2.setAlignment(Pos.CENTER);
        Previous3Button2.setOnAction(e -> {
            stage3.close();
            stage2.show();
        });

        hBox = new HBox(30, Previous3Button2, next3Button1);
        hBox.setAlignment(Pos.CENTER);

        vbox3 = new VBox(20, vbox1, vbox2, hBox);
        Pane = new FlowPane(vbox3);
        Pane.setPadding(new Insets(10));
        scene = new Scene(Pane, 600, 600);
        scene.getStylesheets().add("file:src/MyQuiz/style.css");
        stage3 = new Stage();
        stage3.setScene(scene);
        stage3.setTitle("My Quiz");

        Question7 = new Text("7) Who is the player who won the most Ballon d'Or?");
        Question7.setId("question");

        ToggleGroup7 = new ToggleGroup();
        Radio1Question7 = new RadioButton("Christiano");
        Radio2Question7 = new RadioButton("Michel Platini");
        Radio3Question7 = new RadioButton("Messi");
        Radio4Question7 = new RadioButton("Maradona");
        Radio1Question7.setToggleGroup(ToggleGroup7);
        Radio2Question7.setToggleGroup(ToggleGroup7);
        Radio3Question7.setToggleGroup(ToggleGroup7);
        Radio4Question7.setToggleGroup(ToggleGroup7);

        vbox1 = new VBox(10, Question7, Radio1Question7, Radio2Question7, Radio3Question7, Radio4Question7);
        vbox1.setPadding(new Insets(20));

        Question8 = new Text("8) Who is the team that won the World Cup the most?");
        Question8.setId("question");
        ToggleGroup8 = new ToggleGroup();
        Radio1Question8 = new RadioButton("Russia");
        Radio2Question8 = new RadioButton("Germany");
        Radio3Question8 = new RadioButton("Argentina");
        Radio4Question8 = new RadioButton("Brazilian");
        Radio1Question8.setToggleGroup(ToggleGroup8);
        Radio2Question8.setToggleGroup(ToggleGroup8);
        Radio3Question8.setToggleGroup(ToggleGroup8);
        Radio4Question8.setToggleGroup(ToggleGroup8);

        vbox2 = new VBox(10, Question8, Radio1Question8, Radio2Question8, Radio3Question8, Radio4Question8);
        vbox2.setPadding(new Insets(20));

        next4Button1 = new Button("Next Question");
        next4Button1.setDefaultButton(true);
        next4Button1.setAlignment(Pos.CENTER);
        next4Button1.setOnAction(e -> {
            stage4.close();
            stage5.show();
            if (finishedAll()) {
                FButton.setDisable(false);
            } else {
                FButton.setDisable(true);
            }
        });
        Previous4Button2 = new Button("Back");
        Previous4Button2.setAlignment(Pos.CENTER);
        Previous4Button2.setOnAction(e -> {
            stage4.close();
            stage3.show();
        });

        hBox = new HBox(30, Previous4Button2, next4Button1);
        hBox.setAlignment(Pos.CENTER);

        vbox3 = new VBox(20, vbox1, vbox2, hBox);
        Pane = new FlowPane(vbox3);
        Pane.setPadding(new Insets(10));
        scene = new Scene(Pane, 600, 600);
        scene.getStylesheets().add("file:src/MyQuiz/style.css");
        stage4 = new Stage();
        stage4.setScene(scene);
        stage4.setTitle("My Quiz");

        Question9 = new Text("9) Who is the first Arab team to go to the World Cup?");
        Question9.setId("question");

        ToggleGroup9 = new ToggleGroup();
        Radio1Question9 = new RadioButton("Egypt");
        Radio2Question9 = new RadioButton("Algeria");
        Radio3Question9 = new RadioButton("Tunisia");
        Radio4Question9 = new RadioButton("Palestine");
        Radio1Question9.setToggleGroup(ToggleGroup9);
        Radio2Question9.setToggleGroup(ToggleGroup9);
        Radio3Question9.setToggleGroup(ToggleGroup9);
        Radio4Question9.setToggleGroup(ToggleGroup9);

        vbox1 = new VBox(10, Question9, Radio1Question9, Radio2Question9, Radio3Question9, Radio4Question9);
        vbox1.setPadding(new Insets(20));

        Question10 = new Text("10) Who is the Egyptian who currently plays for Liverpool?");
        Question10.setId("question");

        ToggleGroup10 = new ToggleGroup();
        Radio1Question10 = new RadioButton("Mohammed Abu Trika");
        Radio2Question10 = new RadioButton("Riyad Mahrez");
        Radio3Question10 = new RadioButton("Mohamed Salah");
        Radio4Question10 = new RadioButton("Hakim Ziyash");
        Radio1Question10.setToggleGroup(ToggleGroup10);
        Radio2Question10.setToggleGroup(ToggleGroup10);
        Radio3Question10.setToggleGroup(ToggleGroup10);
        Radio4Question10.setToggleGroup(ToggleGroup10);

        vbox2 = new VBox(10, Question10, Radio1Question10, Radio2Question10, Radio3Question10, Radio4Question10);
        vbox2.setPadding(new Insets(20));

        FButton = new Button("Finish Quiz");
        FButton.setAlignment(Pos.CENTER);

        Previous5Button2 = new Button("Back");
        Previous5Button2.setAlignment(Pos.CENTER);
        Previous5Button2.setOnAction(e -> {
            stage5.close();
            stage4.show();
        });
        hBox = new HBox(30, Previous5Button2, FButton);
        hBox.setAlignment(Pos.CENTER);
        label1 = new Label("foremost");
        vbox3 = new VBox(20, vbox1, vbox2, label1, hBox);
        Pane = new FlowPane(vbox3);
        Pane.setPadding(new Insets(10));
        scene = new Scene(Pane, 600, 600);
        scene.getStylesheets().add("file:src/MyQuiz/style.css");
        stage5 = new Stage();
        stage5.setScene(scene);
        stage5.setTitle("My Quiz");
        ImageView imgView = new ImageView();
        Image img = new Image("file:src/photo/giphy-downsized.gif");
        imgView.setFitWidth(219);
        imgView.setFitHeight(200);
        imgView.setImage(img);
        imgView.setLayoutX(205);
        imgView.setLayoutY(57);

        EButton = new Button("Exit program");
        EButton.setAlignment(Pos.CENTER);
        EButton.setStyle("-fx-hgap: 35px;\n" + "-fx-vgap: 65px;\n" + "-fx-background-color:#ff0000;\n" + "-fx-border-radius: 20;\n" + "-fx-background-radius:20px;\n" + "-fx-font-weight: bold;\n" + "-fx-text-fill: white;" + "-fx-font-size:15pt;");
        EButton.setOnAction(e -> {
            System.exit(0);
        });
        label3 = new Label();
        label3.setTextFill(Color.WHITE);
        label3.setAlignment(Pos.CENTER);
        label2 = new Label();
        label2.setAlignment(Pos.CENTER);
        label2.setPadding(new Insets(20, 20, 20, 20));
        FButton.setOnAction(e -> {
            if (lastStageSolved()) {
                int score = getResult();
                if (score >= 5) {
                    label3.setText("You are awesome my friend you did a great job");
                    label3.setStyle("-fx-font-size:20pt;-fx-font-weight:bold");
                    Pane.setStyle("-fx-background-color:#39e5d8;");
                } else {
                    label3.setText("Sorry my friend good luck another day");
                    label3.setStyle("-fx-font-size:16pt;-fx-font-weight:bold");
                    Pane.setStyle("-fx-background-color: #183D6B;");
                }
                label2.setText("Your Score is " + score + "/10");
                label2.setStyle("-fx-font-size:25pt;");
                label2.setTextFill(Color.FORESTGREEN);
                label2.setAlignment(Pos.CENTER);
                stage5.close();
                stage6.show();
            }
        });
        vbox = new VBox(20, label3, imgView, label2, EButton);
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(20));
        Pane = new FlowPane(vbox);
        Pane.setAlignment(Pos.CENTER);
        Pane.setPadding(new Insets(15));
        scene = new Scene(Pane, 600, 600);
        stage6 = new Stage();
        stage6.setScene(scene);
        stage6.setTitle("MyQuiz");
    }

    public static void main(String[] args) {
        launch(args);
    }

    private boolean finishedAll() {
        boolean completed = false;
        String notfinished = "";
        boolean finishedQuestion1 = false, finishedQuestion2 = false, finishedQuestion3 = false, finishedQuestion4 = false, finishedQuestion5 = false,
                finishedQuestion6 = false, finishedQuestion7 = false, finishedQuestion8 = false;
        if (Radio1Question1.isSelected() || Radio2Question1.isSelected() || Radio3Question1.isSelected() || Radio4Question1.isSelected()) {
            finishedQuestion1 = true;
        } else {
            notfinished += "Question1";
        }
        if (Radio1Question2.isSelected() || Radio2Question2.isSelected() || Radio3Question2.isSelected() || Radio4Question2.isSelected()) {
            finishedQuestion2 = true;
        } else {
            notfinished += " Question2";
        }
        if (Radio1Question3.isSelected() || Radio2Question3.isSelected() || Radio3Question3.isSelected() || Radio4Question3.isSelected()) {
            finishedQuestion3 = true;
        } else {
            notfinished += " Question3";
        }
        if (Radio1Question4.isSelected() || Radio2Question4.isSelected() || Radio3Question4.isSelected() || Radio4Question4.isSelected()) {
            finishedQuestion4 = true;
        } else {
            notfinished += " Question4";
        }
        if (Radio1Question5.isSelected() || Radio2Question5.isSelected() || Radio3Question5.isSelected() || Radio4Question5.isSelected()) {
            finishedQuestion5 = true;
        } else {
            notfinished += " Question5";
        }
        if (Radio1Question6.isSelected() || Radio2Question6.isSelected() || Radio3Question6.isSelected() || Radio4Question6.isSelected()) {
            finishedQuestion6 = true;
        } else {
            notfinished += " Question6";
        }
        if (Radio1Question7.isSelected() || Radio2Question7.isSelected() || Radio3Question7.isSelected() || Radio4Question7.isSelected()) {
            finishedQuestion7 = true;
        } else {
            notfinished += " Question7";
        }
        if (Radio1Question8.isSelected() || Radio2Question8.isSelected() || Radio3Question8.isSelected() || Radio4Question8.isSelected()) {
            finishedQuestion8 = true;
        } else {
            notfinished += " Question8";
        }

        completed = finishedQuestion1 && finishedQuestion2 && finishedQuestion3 && finishedQuestion4
                && finishedQuestion5 && finishedQuestion6 && finishedQuestion7 && finishedQuestion8;
        if (!completed) {
            notfinished += "notfinished";
            label1.setText(notfinished);
            label1.setTextFill(Color.RED);
        } else {
            label1.setText("");
        }
        return completed;
    }

    private int getResult() {
        int scores = 0;

        if (Radio2Question1.isSelected()) {
            scores++;
        }
        if (Radio3Question2.isSelected()) {
            scores++;
        }
        if (Radio1Question3.isSelected()) {
            scores++;
        }
        if (Radio4Question4.isSelected()) {
            scores++;
        }
        if (Radio1Question5.isSelected()) {
            scores++;
        }
        if (Radio1Question6.isSelected()) {
            scores++;
        }
        if (Radio3Question7.isSelected()) {
            scores++;
        }
        if (Radio4Question8.isSelected()) {
            scores++;
        }
        if (Radio1Question9.isSelected()) {
            scores++;
        }
        if (Radio3Question10.isSelected()) {
            scores++;
        }
        return scores;
    }

    private boolean lastStageSolved() {
        boolean finishedQuestion9 = false, finishedQuestion10 = false;
        if (Radio1Question9.isSelected() || Radio2Question9.isSelected() || Radio3Question9.isSelected() || Radio4Question9.isSelected()) {
            finishedQuestion9 = true;
        } else {
            label1.setText("Question9 notfinished");
        }
        if (Radio1Question10.isSelected() || Radio2Question10.isSelected() || Radio3Question10.isSelected() || Radio4Question10.isSelected()) {
            finishedQuestion10 = true;
        } else {
            label1.setText("Question10 notfinished");
        }
        return finishedQuestion9 && finishedQuestion10;
    }

}
