package logika;

public class Button {

    javafx.scene.control.Button button;
    int x;
    int y;
    onClickEvent runnable;

    public Button(javafx.scene.control.Button button, int x, int y) {
        this.button = button;
        this.x = x;
        this.y = y;


        if(runnable != null){

            button.setOnAction((event)->{
                runnable.onClick(this.x,this.y);
            });
        }
    }

    public void onClick(onClickEvent runnable){
        this.runnable = runnable;
    }
}
