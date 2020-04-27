public class ParseClass {
    private int counter = 0;
    private byte[] memoryArray = Interpreter.getData();
    private int memoryPointer = Interpreter.getPtr();

    void parse(String chars) {

        Interpreter interpreter = new Interpreter();
        Invoker invoker = new Invoker(new ShiftRightCommand(interpreter),
                new ShiftLeftCommand(interpreter),
                new AddCommand(interpreter),
                new SubCommand(interpreter),
                new PrintCharCommand(interpreter)
        );

        for (int charPointer = 0; charPointer < chars.length(); charPointer++) {

           if (chars.charAt(charPointer) == '>') {
                invoker.shiftRight();
            } else if (chars.charAt(charPointer) == '<')
                invoker.shiftLeft();
            else if (chars.charAt(charPointer) == '+')
                invoker.add();
            else if (chars.charAt(charPointer) == '-')
                invoker.sub();
            else if (chars.charAt(charPointer) == '.')
                invoker.printChar();
            else if (chars.charAt(charPointer) == '[') {
                if (memoryArray[memoryPointer] == 0) {
                    charPointer++;
                    while (counter > 0 || chars.charAt(charPointer) != ']') {
                        if (chars.charAt(charPointer) == '[')
                            counter++;
                        else if (chars.charAt(charPointer) == ']')
                            counter--;
                        charPointer++;
                    }
                }
            } else if (chars.charAt(charPointer) == ']') {
                if (memoryArray[memoryPointer] != 0) {
                    charPointer--;
                    while (counter > 0 || chars.charAt(charPointer) != '[') {
                        if (chars.charAt(charPointer) == ']')
                            counter++;
                        else if (chars.charAt(charPointer) == '[')
                            counter--;
                        charPointer--;
                    }
                    charPointer--;
                }
            }
        }
    }
}



