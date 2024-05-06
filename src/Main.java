import static oop.minesweeper.Game.startGame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        startGame(new boolean[][]{
                {true, false, false},
                {false, true, false},
                {false, false, false}
        });
    }
}