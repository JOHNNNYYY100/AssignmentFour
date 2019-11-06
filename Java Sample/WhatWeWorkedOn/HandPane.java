package assign3;

import javafx.scene.layout.Pane;

public class HandPane extends Pane {
    private String name;

    public HandPane(String name){
        this.name="Player One";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
