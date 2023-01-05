import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.util.Random;

public class Main extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    TextArea textArea = new TextArea();
    TextArea textArea2 = new TextArea();
    TextArea timetextarea = new TextArea();
    Button btn = new Button();
    Button btn2 = new Button();
    btn.setText("重新抽取数据");
    btn2.setText("显示现在的时间");
    automath mat = new automath();
    String a = mat.sss();
btn.setOnAction(event -> {
    String all[] = {"做数学题", "读10分钟故事书", "做眼保健操", "写拼音", "看3分钟手机"};
    Random random = new Random();
    int num = random.nextInt(4);
    // 将随机数映射到abc三个字母之一
    String all2[] = {"做数学题", "跳绳100下", "做眼保健操", "看10分钟手机", "看3分钟手机"};
    Random random2 = new Random();
    int num2 = random2.nextInt(4);
    String contents = all[num] + "\n" + all2[num2] + "\n" + "--------------------------------------------------------------" + "\n" + "\n" + a;
    textArea.setText(contents);
  });

    primaryStage.setTitle("幸运抽抽抽");

    textArea.setStyle("-fx-background-color: green; -fx-text-fill: black; -fx-font-size: 40pt;");

    textArea.appendText("");
    textArea.setStyle(textArea.getStyle() + "; -fx-text-fill: black;");
    String origintext = textArea.getText();
    textArea.setText(origintext + "\n" + textArea2.getText());
    HBox vbox = new HBox();
    vbox.getChildren().add(textArea);
    vbox.getChildren().add(textArea2);
    vbox.getChildren().add(btn);
    vbox.getChildren().add(btn2);
    Scene scene = new Scene(vbox, 1000, 700);
    primaryStage.setScene(scene);
    primaryStage.show();
    textArea2.setStyle("-fx-background-color: green; -fx-text-fill: blue; -fx-font-size: 50pt;");
    btn.setMinSize(100,100);
    btn.setMaxSize(100,100);
    btn2.setMinSize(100,100);
    btn2.setMaxSize(100,100);
    textArea.setMaxSize(800,1000);
    textArea2.setMaxSize(900,1000);
    textArea.setMinSize(800,1000);
    textArea2.setMinSize(900,1000);
    for (int i = 1; i <= 20; i++) {
      textArea2.setText(textArea2.getText() + "练习" + i + "       "+"\n\n");
    }
    btn2.setOnAction(event -> {
      LocalDateTime currentTime = LocalDateTime.now();
      textArea2.appendText(String.valueOf(currentTime));
    });
  }
}
