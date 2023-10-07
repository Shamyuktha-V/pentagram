package com.example.pentagram;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.io.IOException;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.shape.Line;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.ImagePattern;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;

public class login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login Page");
        Image login_backgroundImage = new Image("D:/Studies/sem5/java/pentagram/pics/login_final.JPG");
        BackgroundImage login_background = new BackgroundImage(
                login_backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                null,
                new BackgroundSize(
                        BackgroundSize.AUTO,
                        BackgroundSize.AUTO,
                        false,
                        false,
                        true,
                        false
                )
        );

        Image input_backgroundImage = new Image("file:D:/Studies/sem5/java/pentagram/pics/login_rect.jpg");
        ImagePattern input_backgroundPattern = new ImagePattern(input_backgroundImage);
        Pane root = new Pane();
        root.setBackground(new Background(login_background));

        Scene login_page = new Scene(root,1300,750);

        Pane input_pane = new Pane();

        Rectangle input = new Rectangle();
        input.setX(105);
        input.setY(105);
        input.setWidth(400);
        input.setHeight(450);
        input.setArcWidth(20); // Set the width of the corner arc
        input.setArcHeight(20);
        input.setFill(input_backgroundPattern);
        input_pane.getChildren().addAll(input);

        Label log_in=new Label("Login");
        log_in.setLayoutX(270);
        log_in.setLayoutY(120);
        log_in.setStyle(" -fx-text-fill:#2C165C; -fx-font-size:30");

        Label username=new Label("Username or Email Address");
        username.setLayoutX(180);
        username.setLayoutY(170);
        username.setStyle(" -fx-text-fill:#2C165C; -fx-font-size:20");

        TextField username_input=new TextField();
        username_input.setLayoutX(190);
        username_input.setLayoutY(220);
        username_input.setStyle("-fx-background-color:#E6E6FA;-fx-text-fill:#2C165C; -fx-font-size:15");

        Line line1 = new Line();
        line1.setStartX(150);
        line1.setStartY(250);
        line1.setEndX(450);
        line1.setEndY(250);

        Label password=new Label("Password");
        password.setLayoutX(260);
        password.setLayoutY(280);
        password.setStyle(" -fx-text-fill:#2C165C; -fx-font-size:20");

        PasswordField password_input=new PasswordField();
        password_input.setLayoutX(190);
        password_input.setLayoutY(320);
        password_input.setStyle("-fx-background-color:#E6E6FA; -fx-text-fill:#2C165C; -fx-font-size:15");

        Line line2 = new Line();
        line2.setStartX(150);
        line2.setStartY(350);
        line2.setEndX(450);
        line2.setEndY(350);

        Button login_btn = new Button("Log In");
        login_btn.setLayoutX(265);
        login_btn.setLayoutY(400);
        login_btn.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");
        login_btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Home page");
                Pane home_pane = new Pane();
                home_pane.setStyle("-fx-background-color: #E5E4E2;");
                Scene home_scene = new Scene(home_pane,1300,750);

                Rectangle details = new Rectangle();
                details.setWidth(300);
                details.setHeight(750);
                details.setFill(Color.WHITE);
                details.setX(0);
                details.setY(0);


                Image instag_logo = new Image("D:/Studies/sem5/java/pentagram/pics/insta_logo.PNG");
                Image home = new Image("D:/Studies/sem5/java/pentagram/pics/home.PNG");
                Image like = new Image("D:/Studies/sem5/java/pentagram/pics/like.JPG");
                Image add_post = new Image("D:/Studies/sem5/java/pentagram/pics/add_post.PNG");
                Image comment = new Image("D:/Studies/sem5/java/pentagram/pics/comment.PNG");
                Image search = new Image("D:/Studies/sem5/java/pentagram/pics/search.PNG");
                Image settings = new Image("D:/Studies/sem5/java/pentagram/pics/settings.PNG");
                Image saved = new Image("D:/Studies/sem5/java/pentagram/pics/saved.PNG");
                Image notification = new Image("D:/Studies/sem5/java/pentagram/pics/notification.PNG");
                Image profile = new Image("D:/Studies/sem5/java/pentagram/pics/profile.PNG");
                Image back_image = new Image("D:/Studies/sem5/java/pentagram/pics/back.PNG");
                Image next_image = new Image("D:/Studies/sem5/java/pentagram/pics/next.PNG");


                ImageView imageView_instag_logo = new ImageView(instag_logo);
                ImageView imageView_home = new ImageView(home);
                ImageView imageView_like = new ImageView(like);
                ImageView imageView_add_post = new ImageView(add_post);
                ImageView imageView_comment = new ImageView(comment);
                ImageView imageView_search = new ImageView(search);
                ImageView imageView_settings = new ImageView(settings);
                ImageView imageView_saved = new ImageView(saved);
                ImageView imageView_notification = new ImageView(notification);
                ImageView imageView_profile = new ImageView(profile);
                ImageView imageView_back = new ImageView(back_image);
                ImageView imageView_next = new ImageView(next_image);


                int desiredWidth=40;
                int desiredHeight=40;


                imageView_instag_logo.setFitWidth(desiredWidth);
                imageView_instag_logo.setFitHeight(desiredHeight);
                imageView_home.setFitWidth(desiredWidth);
                imageView_home.setFitHeight(desiredHeight);
                imageView_like.setFitWidth(desiredWidth);
                imageView_like.setFitHeight(desiredHeight);
                imageView_add_post.setFitWidth(desiredWidth);
                imageView_add_post.setFitHeight(desiredHeight);
                imageView_comment.setFitWidth(desiredWidth);
                imageView_comment.setFitHeight(desiredHeight);
                imageView_search.setFitWidth(desiredWidth);
                imageView_search.setFitHeight(desiredHeight);
                imageView_settings.setFitWidth(desiredWidth);
                imageView_settings.setFitHeight(desiredHeight);
                imageView_saved.setFitWidth(desiredWidth);
                imageView_saved.setFitHeight(desiredHeight);
                imageView_notification.setFitWidth(desiredWidth);
                imageView_notification.setFitHeight(desiredHeight);
                imageView_profile.setFitWidth(desiredWidth);
                imageView_profile.setFitHeight(desiredHeight);
                imageView_add_post.setFitWidth(desiredWidth);
                imageView_add_post.setFitHeight(desiredHeight);
                imageView_next.setFitWidth(50);
                imageView_next.setFitHeight(50);
                imageView_back.setFitWidth(50);
                imageView_back.setFitHeight(50);


                imageView_instag_logo.setLayoutX(30);
                imageView_instag_logo.setLayoutY(30);
                imageView_home.setLayoutX(40);
                imageView_home.setLayoutY(340);
                imageView_search.setLayoutX(40);
                imageView_search.setLayoutY(400);
                imageView_saved.setLayoutX(40);
                imageView_saved.setLayoutY(460);
                imageView_notification.setLayoutX(40);
                imageView_notification.setLayoutY(520);
                imageView_settings.setLayoutX(40);
                imageView_settings.setLayoutY(580);
                imageView_profile.setLayoutX(40);
                imageView_profile.setLayoutY(640);
                imageView_add_post.setLayoutX(40);
                imageView_add_post.setLayoutY(700);



                Label insta=new Label("Pentagram");
                insta.setLayoutX(80);
                insta.setLayoutY(35);
                insta.setStyle(" -fx-background-color:#FFFFFF; -fx-text-fill:#010000; -fx-font-size:20; -fx-font-family:Georgia; -fx-font-weight:bold");

                Button feed = new Button("Feed");
                feed.setLayoutX(80);
                feed.setLayoutY(345);
                feed.setStyle("-fx-background-color:#FFFFFF; -fx-text-fill:#010000; -fx-font-size:16; -fx-font-family:Georgia" );


                Button explore = new Button("Explore");
                explore.setLayoutX(80);
                explore.setLayoutY(405);
                explore.setStyle("-fx-background-color:#FFFFFF; -fx-text-fill:#010000; -fx-font-size:16; -fx-font-family:Georgia" );


                Button collection = new Button("Collection");
                collection.setLayoutX(80);
                collection.setLayoutY(465);
                collection.setStyle("-fx-background-color:#FFFFFF; -fx-text-fill:#010000; -fx-font-size:16; -fx-font-family:Georgia" );


                Button notification_btn = new Button("Notification");
                notification_btn.setLayoutX(80);
                notification_btn.setLayoutY(525);
                notification_btn.setStyle("-fx-background-color:#FFFFFF; -fx-text-fill:#010000; -fx-font-size:16; -fx-font-family:Georgia" );


                Button settings_btn = new Button("Settings");
                settings_btn.setLayoutX(80);
                settings_btn.setLayoutY(585);
                settings_btn.setStyle("-fx-background-color:#FFFFFF; -fx-text-fill:#010000; -fx-font-size:16; -fx-font-family:Georgia" );


                Button profile_btn = new Button("Profile");
                profile_btn.setLayoutX(80);
                profile_btn.setLayoutY(645);
                profile_btn.setStyle("-fx-background-color:#FFFFFF; -fx-text-fill:#010000; -fx-font-size:16; -fx-font-family:Georgia" );


                Button post = new Button("New post");
                post.setLayoutX(80);
                post.setLayoutY(705);
                post.setStyle("-fx-background-color:#FFFFFF; -fx-text-fill:#010000; -fx-font-size:16; -fx-font-family:Georgia" );


                Rectangle post1 = new Rectangle();
                post1.setWidth(300);
                post1.setHeight(300);
                post1.setFill(Color.WHITE);
                post1.setX(325);
                post1.setY(25);

                Rectangle post2 = new Rectangle();
                post2.setWidth(300);
                post2.setHeight(300);
                post2.setFill(Color.WHITE);
                post2.setX(650);
                post2.setY(25);

                Rectangle post3 = new Rectangle();
                post3.setWidth(300);
                post3.setHeight(300);
                post3.setFill(Color.WHITE);
                post3.setX(975);
                post3.setY(25);

                Rectangle post4 = new Rectangle();
                post4.setWidth(300);
                post4.setHeight(300);
                post4.setFill(Color.WHITE);
                post4.setX(325);
                post4.setY(350);

                Rectangle post5 = new Rectangle();
                post5.setWidth(300);
                post5.setHeight(300);
                post5.setFill(Color.WHITE);
                post5.setX(650);
                post5.setY(350);

                Rectangle post6 = new Rectangle();
                post6.setWidth(300);
                post6.setHeight(300);
                post6.setFill(Color.WHITE);
                post6.setX(975);
                post6.setY(350);


                Button exit_btn = new Button();
                exit_btn.setGraphic(imageView_back);
                exit_btn.setLayoutX(325);
                exit_btn.setLayoutY(680);

                Button next_post_btn = new Button("");
                next_post_btn.setGraphic(imageView_next);
                next_post_btn.setLayoutX(1210);
                next_post_btn.setLayoutY(680);

                home_pane.getChildren().addAll(details,imageView_instag_logo,imageView_home,imageView_search,imageView_saved,imageView_notification,imageView_settings,imageView_profile,imageView_add_post,feed,explore,collection,post,notification_btn,settings_btn,profile_btn,insta,post1,post2,post3,post4,post5,post6,exit_btn,next_post_btn);
                primaryStage.setScene(home_scene);
            }
        });
        Button forgot_btn = new Button("Forgot password?");
        forgot_btn.setLayoutX(235);
        forgot_btn.setLayoutY(460);
        forgot_btn.setStyle("-fx-text-fill:#2C165C; -fx-font-size:15");
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
                password_change.setFill(input_backgroundPattern);
                forgot_pane.getChildren().addAll(password_change);


                Label forgot_password=new Label("Forgot Password");
                forgot_password.setLayoutX(215);
                forgot_password.setLayoutY(120);
                forgot_password.setStyle("-fx-text-fill:#2C165C; -fx-font-size:25");

                Label school=new Label("Enter first school name");
                school.setLayoutX(190);
                school.setLayoutY(180);
                school.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                TextField school_input=new TextField();
                school_input.setLayoutX(180);
                school_input.setLayoutY(220);
                school_input.setStyle("-fx-background-color:#E6E6FA;-fx-text-fill:#2C165C; -fx-font-size:15");

                Line line3 = new Line();
                line3.setStartX(150);
                line3.setStartY(250);
                line3.setEndX(450);
                line3.setEndY(250);


                Label nick_name=new Label("Enter nick name");
                nick_name.setLayoutX(220);
                nick_name.setLayoutY(280);
                nick_name.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                TextField nickname_input=new TextField();
                nickname_input.setLayoutX(180);
                nickname_input.setLayoutY(320);
                nickname_input.setStyle("-fx-background-color:#E6E6FA; -fx-text-fill:#2C165C; -fx-font-size:15");

                Line line4 = new Line();
                line4.setStartX(150);
                line4.setStartY(350);
                line4.setEndX(450);
                line4.setEndY(350);

                Button change_password = new Button("Submit");
                change_password.setLayoutX(265);
                change_password.setLayoutY(400);
                change_password.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                Button back_forgot = new Button("Back");
                back_forgot.setLayoutX(265);
                back_forgot.setLayoutY(460);
                back_forgot.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                back_forgot.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        root.getChildren().clear();
                        root.getChildren().add(input_pane);
                    }
                });

                change_password.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        root.getChildren().clear();
                        root.getChildren().add(input_pane);
                    }
                });

                forgot_pane.getChildren().addAll(forgot_password,school_input,school,nickname_input,nick_name,change_password,line3,line4,back_forgot);
                root.getChildren().add(forgot_pane);
            }
        });
        Button signup_btn = new Button("Doesn't have an account? Create account");
        signup_btn.setLayoutX(160);
        signup_btn.setLayoutY(500);
        signup_btn.setStyle(" -fx-text-fill:#2C165C; -fx-font-size:15");
        signup_btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                primaryStage.setTitle("Sign up page");
                Pane signup1_pane = new Pane();

                Rectangle signup1_rect = new Rectangle();
                signup1_rect.setX(105);
                signup1_rect.setY(105);
                signup1_rect.setWidth(400);
                signup1_rect.setHeight(450);
                signup1_rect.setArcWidth(20); // Set the width of the corner arc
                signup1_rect.setArcHeight(20);
                signup1_rect.setFill(input_backgroundPattern);
                signup1_pane.getChildren().addAll(signup1_rect);


                Label signup1_label=new Label("Sign UP");
                signup1_label.setLayoutX(255);
                signup1_label.setLayoutY(120);
                signup1_label.setStyle("-fx-text-fill:#2C165C; -fx-font-size:25");

                Label mailid=new Label("Mail id");
                mailid.setLayoutX(160);
                mailid.setLayoutY(180);
                mailid.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                TextField mailid_input=new TextField();
                mailid_input.setLayoutX(270);
                mailid_input.setLayoutY(180);
                mailid_input.setStyle("-fx-background-color:#E6E6FA; -fx-text-fill:#2C165C; -fx-font-size:15");

                Line line5 = new Line();
                line5.setStartX(270);
                line5.setStartY(210);
                line5.setEndX(455);
                line5.setEndY(210);

                Label full_name=new Label("Full name");
                full_name.setLayoutX(160);
                full_name.setLayoutY(250);
                full_name.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                TextField fullname_input=new TextField();
                fullname_input.setLayoutX(270);
                fullname_input.setLayoutY(250);
                fullname_input.setStyle("-fx-background-color:#E6E6FA; -fx-text-fill:#2C165C; -fx-font-size:15");

                Line line6 = new Line();
                line6.setStartX(270);
                line6.setStartY(280);
                line6.setEndX(455);
                line6.setEndY(280);

                Label signup_username=new Label("Username");
                signup_username.setLayoutX(160);
                signup_username.setLayoutY(320);
                signup_username.setStyle(" -fx-text-fill:#2C165C; -fx-font-size:20");

                TextField signup_username_input=new TextField();
                signup_username_input.setLayoutX(270);
                signup_username_input.setLayoutY(320);
                signup_username_input.setStyle("-fx-background-color:#E6E6FA;-fx-text-fill:#2C165C; -fx-font-size:15");

                Line line7 = new Line();
                line7.setStartX(270);
                line7.setStartY(350);
                line7.setEndX(455);
                line7.setEndY(350);

                Label signup_password=new Label("Password");
                signup_password.setLayoutX(160);
                signup_password.setLayoutY(390);
                signup_password.setStyle(" -fx-text-fill:#2C165C; -fx-font-size:20");

                PasswordField signup_password_input=new PasswordField();
                signup_password_input.setLayoutX(270);
                signup_password_input.setLayoutY(390);
                signup_password_input.setStyle("-fx-background-color:#E6E6FA; -fx-text-fill:#2C165C; -fx-font-size:15");

                Line line8 = new Line();
                line8.setStartX(270);
                line8.setStartY(420);
                line8.setEndX(455);
                line8.setEndY(420);

                Button next1_btn = new Button("Next");
                next1_btn.setLayoutX(375);
                next1_btn.setLayoutY(460);
                next1_btn.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");
                next1_btn.setOnAction(new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event) {

                        primaryStage.setTitle("Sign up page");
                        Pane signup2_pane = new Pane();

                        Rectangle signup2_rect = new Rectangle();
                        signup2_rect.setX(105);
                        signup2_rect.setY(105);
                        signup2_rect.setWidth(400);
                        signup2_rect.setHeight(450);
                        signup2_rect.setArcWidth(20); // Set the width of the corner arc
                        signup2_rect.setArcHeight(20);
                        signup2_rect.setFill(input_backgroundPattern);
                        signup2_pane.getChildren().addAll(signup2_rect);


                        Label signup2_label=new Label("Sign UP");
                        signup2_label.setLayoutX(255);
                        signup2_label.setLayoutY(120);
                        signup2_label.setStyle("-fx-text-fill:#2C165C; -fx-font-size:25");

                        Label date=new Label("DOB");
                        date.setLayoutX(160);
                        date.setLayoutY(180);
                        date.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                        DatePicker datePicker = new DatePicker();

                        VBox vbox = new VBox(datePicker);
                        vbox.setLayoutX(270);
                        vbox.setLayoutY(180);

                        Label bio=new Label("Bio");
                        bio.setLayoutX(160);
                        bio.setLayoutY(250);
                        bio.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                        TextField bio_input=new TextField();
                        bio_input.setLayoutX(270);
                        bio_input.setLayoutY(250);
                        bio_input.setStyle("-fx-background-color:#E6E6FA; -fx-text-fill:#2C165C; -fx-font-size:15");

                        Line line9 = new Line();
                        line9.setStartX(270);
                        line9.setStartY(280);
                        line9.setEndX(455);
                        line9.setEndY(280);

                        Button next2_btn = new Button("Sign Up");
                        next2_btn.setLayoutX(265);
                        next2_btn.setLayoutY(320);
                        next2_btn.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                        next2_btn.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                root.getChildren().clear();
                                signup_btn.setText("Doesn't have an account? Create account");
                                signup_btn.setLayoutX(160);
                                signup_btn.setLayoutY(500);
                                signup_btn.setStyle(" -fx-text-fill:#2C165C; -fx-font-size:15");
                                input_pane.getChildren().remove(signup_btn);
                                input_pane.getChildren().add(signup_btn);
                                root.getChildren().add(input_pane);
                            }
                        });

                        signup_btn.setText("Back");
                        signup_btn.setLayoutX(265);
                        signup_btn.setLayoutY(380);
                        signup_btn.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                        signup2_pane.getChildren().addAll(signup2_label,date,vbox,bio,bio_input,line9,next2_btn,signup_btn);
                        root.getChildren().add(signup2_pane);
                    }});
                Button back_home = new Button("Back");
                back_home.setLayoutX(175);
                back_home.setLayoutY(460);
                back_home.setStyle("-fx-text-fill:#2C165C; -fx-font-size:20");

                back_home.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        root.getChildren().clear();
                        signup_btn.setText("Doesn't have an account? Create account");
                        signup_btn.setLayoutX(160);
                        signup_btn.setLayoutY(500);
                        signup_btn.setStyle(" -fx-text-fill:#2C165C; -fx-font-size:15");
                        input_pane.getChildren().remove(signup_btn);
                        input_pane.getChildren().add(signup_btn);
                        root.getChildren().add(input_pane);
                    }
                });

                signup1_pane.getChildren().addAll(signup1_label,mailid,mailid_input,line5,full_name,fullname_input,line6,signup_username,signup_username_input,line7,signup_password,signup_password_input,line8,next1_btn,back_home);
                root.getChildren().add(signup1_pane);
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
