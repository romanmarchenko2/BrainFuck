class PrintCharCommand implements Command {

    Interpreter interpreter;

    public PrintCharCommand(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    @Override
    public void execute() {
        interpreter.printChar();
    }

}