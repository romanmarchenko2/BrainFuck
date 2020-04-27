class ShiftRightCommand implements Command {
    Interpreter interpreter;

    public ShiftRightCommand(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        interpreter.shiftRight();
    }
}
