// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Context context=new Context();
       AbstractExpression givenExpression=new nonTerminalExpression(new nonTerminalExpression
               (new TerminalExpression('a'),new TerminalExpression('b'),'+'),new TerminalExpression('c'),'*');
              Integer value=givenExpression.interpret(context);
       System.out.println("Value of our expression is "+value);
    }
}