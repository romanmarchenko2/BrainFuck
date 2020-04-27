class Invoker {

    Command shiftRight;
    Command shiftLeft;
    Command add;
    Command sub;
    Command printChar;

    public Invoker(Command shiftRight, Command shiftLeft, Command add, Command sub, Command printChar) {
        this.shiftRight = shiftRight;
        this.shiftLeft = shiftLeft;
        this.add = add;
        this.sub = sub;
        this.printChar = printChar;
    }

    void shiftRight() {
        shiftRight.execute();
    }

    void shiftLeft() {
        shiftLeft.execute();
    }

    void add() {
        add.execute();
    }

    void sub() {
        sub.execute();
    }

    void printChar() {
        printChar.execute();
    }

}
