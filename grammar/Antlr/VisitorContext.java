
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class VisitorContext extends ParserRuleContext
{
        public VisitorContext(ParserRuleContext P, int S) 
        {
            super(P,S);
        }

        public VisitorContext()
        {
            super();
        }
}