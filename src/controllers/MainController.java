package controllers;

import java.util.Random;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;

    public MainController(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
        this.initEvent();
    }
    
    public void initEvent() {
        this.mainWindow.startBtn.addActionListener(
            event -> {
                System.out.println("Működik");
                Random random = new Random();
                int hcard1 = random.nextInt(13) + 1;
                int hcard2 = random.nextInt(13) + 1;
                System.out.printf(
                    "%d %d\n", hcard1, hcard2);
            });
        this.mainWindow.stopBtn.addActionListener(
            event -> {
                System.out.println("Állj");
            });
    }

}
