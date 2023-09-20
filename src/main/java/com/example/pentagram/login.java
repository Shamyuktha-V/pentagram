package com.example.pentagram;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.io.IOException;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login Page");
        Image backgroundImage = new Image("D:/Studies/sem5/java/pentagram/pics/login_final.JPG");
        BackgroundImage background = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,    // BackgroundRepeat (you can change this)
                BackgroundRepeat.NO_REPEAT,
                null,
                new BackgroundSize(
                        BackgroundSize.AUTO,       // Width
                        BackgroundSize.AUTO,       // Height
                        false,                     // WidthAsPercentage
                        false,                     // HeightAsPercentage
                        true,                      // Contain
                        false                      // Cover
                )
        );
        Pane root = new Pane();
        root.setBackground(new Background(background));

        Scene login_page = new Scene(root,1300,750);

        Pane input_pane = new Pane();

        Rectangle input = new Rectangle();
        input.setX(105);
        input.setY(105);
        input.setWidth(400);
        input.setHeight(450);
        input.setArcWidth(20); // Set the width of the corner arc
        input.setArcHeight(20);
        input.setFill(Color.rgb(246,138,223));
        input_pane.getChildren().addAll(input);

        Label log_in=new Label("Login");
        log_in.setLayoutX(270);
        log_in.setLayoutY(120);
        log_in.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:30");

        Label username=new Label("Username or Email Address");
        username.setLayoutX(180);
        username.setLayoutY(170);
        username.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:20");

        TextField username_input=new TextField();
        username_input.setLayoutX(180);
        username_input.setLayoutY(220);
        username_input.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:15");

        Line line1 = new Line();
        line1.setStartX(150);
        line1.setStartY(250);
        line1.setEndX(450);
        line1.setEndY(250);

        Label password=new Label("Password");
        password.setLayoutX(260);
        password.setLayoutY(280);
        password.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:20");

        PasswordField password_input=new PasswordField();
        password_input.setLayoutX(180);
        password_input.setLayoutY(320);
        password_input.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:15");

        Line line2 = new Line();
        line2.setStartX(150);
        line2.setStartY(350);
        line2.setEndX(450);
        line2.setEndY(350);

        Button login_btn = new Button("Log In");
        login_btn.setLayoutX(265);
        login_btn.setLayoutY(400);
        login_btn.setStyle("-fx-background-color:#2C165C; -fx-text-fill:#F68ADF; -fx-font-size:20");
        login_btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Home page");
                Pane home_page = new Pane();
                Scene feed_page = new Scene(home_page,600,750,Color.BLUEVIOLET);
                Rectangle rect = new Rectangle();
                rect.setFill(Color.BLUEVIOLET);
                rect.setHeight(100);
                rect.setWidth(200);
                home_page.getChildren().add(rect);
                primaryStage.setScene(feed_page);
            }
        });
        Button forgot_btn = new Button("Forgot password?");
        forgot_btn.setLayoutX(235);
        forgot_btn.setLayoutY(460);
        forgot_btn.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:15");
        forgot_btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Forgot password page");
                Pane forgot_pane = new Pane();

                Rectangle password_change = new Rectangle();
                password_change.setX(105);
                password_change.setY(105);
                password_change.setWidth(400);
                password_change.setHeight(450);
                password_change.setArcWidth(20); // Set the width of the corner arc
                password_change.setArcHeight(20);
                password_change.setFill(Color.rgb(246,138,223));
                forgot_pane.getChildren().addAll(password_change);


                Label forgot_password=new Label("Forgot Password");
                forgot_password.setLayoutX(215);
                forgot_password.setLayoutY(120);
                forgot_password.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:25");

                Label school=new Label("Enter first school name");
                school.setLayoutX(190);
                school.setLayoutY(180);
                school.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:20");

                TextField school_input=new TextField();
                school_input.setLayoutX(180);
                school_input.setLayoutY(220);
                school_input.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:15");

                Line line3 = new Line();
                line3.setStartX(150);
                line3.setStartY(250);
                line3.setEndX(450);
                line3.setEndY(250);


                Label nick_name=new Label("Enter nick name");
                nick_name.setLayoutX(220);
                nick_name.setLayoutY(280);
                nick_name.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:20");

                TextField nickname_input=new TextField();
                nickname_input.setLayoutX(180);
                nickname_input.setLayoutY(320);
                nickname_input.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:15");

                Line line4 = new Line();
                line4.setStartX(150);
                line4.setStartY(350);
                line4.setEndX(450);
                line4.setEndY(350);

                Button change_password = new Button("Submit");
                change_password.setLayoutX(265);
                change_password.setLayoutY(400);
                change_password.setStyle("-fx-background-color:#2C165C; -fx-text-fill:#F68ADF; -fx-font-size:20");

                forgot_pane.getChildren().addAll(forgot_password,school_input,school,nickname_input,nick_name,change_password,line3,line4);
                root.getChildren().add(forgot_pane);
                forgot_pane.setVisible(!forgot_pane.isVisible());
                Rotate rotate = new Rotate(0, input.getWidth() / 2, input.getHeight() / 2, 0, Rotate.Y_AXIS);
                input_pane.getTransforms().add(rotate);

                Timeline timeline = new Timeline(
                        new KeyFrame(Duration.ZERO, new KeyValue(rotate.angleProperty(), 0)),
                        new KeyFrame(Duration.seconds(3), new KeyValue(rotate.angleProperty(), 360, Interpolator.EASE_BOTH))
                );
                timeline.setOnFinished(e -> {
                    // Toggle the visibility of the input pane and the "Forgot password" pane
                    input_pane.setVisible(!input_pane.isVisible());
                    forgot_pane.setVisible(!forgot_pane.isVisible());
                });
                timeline.play();
            }
        });
        Button signup_btn = new Button("Doesn't have an account? Create account");
        signup_btn.setLayoutX(160);
        signup_btn.setLayoutY(500);
        signup_btn.setStyle("-fx-background-color:#F68ADF; -fx-text-fill:#2C165C; -fx-font-size:15");
        signup_btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Pane feed_page = new Pane();
            }
        });
        input_pane.getChildren().addAll(log_in,username,password,username_input,password_input,line1,line2,login_btn,signup_btn,forgot_btn);
        root.getChildren().add(input_pane);
        primaryStage.setScene(login_page);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}