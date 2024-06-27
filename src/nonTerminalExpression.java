public class nonTerminalExpression implements AbstractExpression{

    AbstractExpression exp1,exp2;
    Character operation;
    nonTerminalExpression(AbstractExpression exp1,AbstractExpression exp2,Character operation){
        this.exp1=exp1;
        this.exp2=exp2;
        this.operation=operation;
    }
    public Integer interpret(Context context){
        if(operation=='*'){
            return exp1.interpret(context)*exp2.interpret(context);
        }
        else if(operation=='-'){
            return exp1.interpret(context)-exp2.interpret(context);

        }
        else if(operation=='+'){
            return exp1.interpret(context)+exp2.interpret(context);

        }
        return exp1.interpret(context)/exp2.interpret(context);
    }
}

