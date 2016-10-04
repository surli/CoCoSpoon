package fil.iagl.opl.cocospoon.insert.impl;

import fil.iagl.opl.cocospoon.insert.Insertion;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;

public class IfInsert implements Insertion {

	@Override
	public boolean match(CtElement element) {
		return element instanceof CtIf;
	}

	@Override
	public void apply(CtElement element, CtStatement statementToInsert) {
		((CtIf) element).insertBefore(statementToInsert);
		/*if (ctIf.getElseStatement() != null && !(ctIf.getElseStatement() instanceof CtIf))
			ctIf.getElseStatement().insertBefore(statementToInsert);*/
	}
}
