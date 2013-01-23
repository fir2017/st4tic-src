//
// Generated by JTB 1.3.2
//

package st4tic.syntaxtree;

/**
 * Grammar production:
 * f0 -> "while"
 * f1 -> RelationalExprssion()
 * f2 -> "do"
 * f3 -> ( StatementExpression() )*
 * f4 -> "stop"
 */
public class WhileExpression implements Node {
   public NodeToken f0;
   public RelationalExprssion f1;
   public NodeToken f2;
   public NodeListOptional f3;
   public NodeToken f4;

   public WhileExpression(NodeToken n0, RelationalExprssion n1, NodeToken n2, NodeListOptional n3, NodeToken n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public WhileExpression(RelationalExprssion n0, NodeListOptional n1) {
      f0 = new NodeToken("while");
      f1 = n0;
      f2 = new NodeToken("do");
      f3 = n1;
      f4 = new NodeToken("stop");
   }

   public void accept(st4tic.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(st4tic.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(st4tic.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(st4tic.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
