public class SubCommand implements Command {
    Interpreter interpreter;

    public SubCommand(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        interpreter.subPos();
    }
}
