public class AddCommand implements Command {
    Interpreter interpreter;

    public AddCommand(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        interpreter.addPos();
    }
}
