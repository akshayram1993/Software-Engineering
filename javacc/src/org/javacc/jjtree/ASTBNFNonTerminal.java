/* Generated By:JJTree: Do not edit this line. ASTBNFNonTerminal.java Version 4.1 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY= */
package org.javacc.jjtree;

public class ASTBNFNonTerminal extends JJTreeNode{
  public ASTBNFNonTerminal(int id) {
    super(id);
  }

  public ASTBNFNonTerminal(JJTreeParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JJTreeParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=a533c768890ba216ba639b0d042aa586 (do not edit this line) */
