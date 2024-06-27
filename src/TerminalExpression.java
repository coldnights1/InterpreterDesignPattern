public class TerminalExpression implements AbstractExpression{
    Character ch;
    TerminalExpression(Character ch){
        this.ch=ch;
    }
    public Integer interpret(Context context){
        return context.umap.get(ch);
    }
}
