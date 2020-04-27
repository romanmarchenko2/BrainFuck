public class ShiftLeftCommand implements Command {
    Interpreter interpreter;

    public ShiftLeftCommand(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        interpreter.shiftLeft();
    }

}
