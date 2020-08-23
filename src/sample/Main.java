package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Main extends Application {
private Label titlelb,Firstnamelb,Lastnamelb,yearlb,monthlb,daylb,outputlb;
private TextField Firstnametf,Lastnametf,yeartf,monthtf,daytf;
private Button calculateHeartrateBtn;
private VBox root,yearVBox,monthVBox,dayVBox;
private HBox dateHBox;
    @Override
    public void start(Stage primaryStage) throws Exception{
        titlelb=new Label("Heart Rate Calculator");
        titlelb.setStyle("-fx-font: 26px Arial");
        Firstnamelb=new Label("First Name");
        Lastnamelb=new Label("Last Name");
        yearlb=new Label("Year");
        monthlb=new Label("Month");
        daylb=new Label("Day");
        outputlb=new Label();
        Firstnametf=new TextField();
        Lastnametf=new TextField();
        yeartf=new TextField();
        monthtf=new TextField();
        daytf=new TextField();
        calculateHeartrateBtn=new Button("Calculate Heart Rate");
        yearVBox=new VBox();
        yearVBox.getChildren().addAll(yearlb,yeartf);
        monthVBox=new VBox();
        monthVBox.getChildren().addAll(monthlb,monthtf);
        dayVBox=new VBox();
        dayVBox.getChildren().addAll(daylb,daytf);
        dateHBox=new HBox();
        dateHBox.getChildren().addAll(yearVBox,monthVBox,dayVBox);
        dateHBox.setSpacing(20);
        root =new VBox();
        root.getChildren().addAll(titlelb,Firstnamelb,Firstnametf,Lastnamelb,Lastnametf,dateHBox,calculateHeartrateBtn);
        root.setSpacing(20);
        root.setPadding(new Insets(20));
        Scene scene=new Scene(root,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Heart Rate Calculator");
        primaryStage.show();

    }
    private int getAgeInYears(int year, Month m,int day) {
        LocalDate today = LocalDate.now();
        LocalDate bd = LocalDate.of(year,m,day);
        Period period = Period.between(bd,today);
        return (period.getYears());
    }
    private Month getMonth(String month){
        Month m;
        if(month.equalsIgnoreCase("January")){
            m = Month.JANUARY;
        }else if(month.equalsIgnoreCase("February")){
            m = Month.FEBRUARY;
        }else if(month.equalsIgnoreCase("March")){
            m = Month.MARCH;
        }else if(month.equalsIgnoreCase("april")){
            m = Month.APRIL;
        }
        else if(month.equalsIgnoreCase("may")){
            m = Month.MAY;
        }
        else if(month.equalsIgnoreCase("june")){
            m = Month.JUNE;
        }
        else if(month.equalsIgnoreCase("July")){
            m = Month.JULY;
        }
        else if(month.equalsIgnoreCase("August")){
            m = Month.AUGUST;
        }
        else if(month.equalsIgnoreCase("September")){
            m = Month.SEPTEMBER;
        }
        else if(month.equalsIgnoreCase("October")){
            m = Month.OCTOBER;
        }
        else if(month.equalsIgnoreCase("NOVEMBER")){
            m = Month.NOVEMBER;
        }
        else if(month.equalsIgnoreCase("DECEMBER")){
            m = Month.DECEMBER;
        }
        else {
            m = Month.JANUARY;
        }
        return m;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
