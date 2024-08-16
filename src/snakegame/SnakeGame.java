package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {
    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack(); //refresh frame

        setVisible(true );
        setSize(700,700);
        setLocationRelativeTo(null);

    }
    public static void main(String[] args){
        new SnakeGame().setVisible(true);
    }
}
