package thatsFun;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class thatsFun extends Application{
    @Override
    public void start(Stage stage) throws Exception {

        BorderPane pane = new BorderPane();
        Button button = new Button("Button");
        button.setPrefSize(300.0,20.0);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("Button clicked");
            }
        });
        pane.setCenter(button);
        stage.setTitle("Lmao");
        Scene scene = new Scene(pane,500,500);
        stage.setScene(scene);
        stage.show();

    }

}
