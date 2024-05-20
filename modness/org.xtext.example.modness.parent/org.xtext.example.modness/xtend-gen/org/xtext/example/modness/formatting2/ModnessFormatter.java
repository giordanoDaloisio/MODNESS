/**
 * generated by Xtext 2.35.0.M1
 */
package org.xtext.example.modness.formatting2;

import com.google.inject.Inject;
import fairness.GroupAnalysis;
import fairness.GroupBias;
import fairness.PositiveOutcome;
import fairness.SensitiveGroup;
import fairness.SensitiveVariable;
import fairness.SensitiveVariableValue;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.modness.services.ModnessGrammarAccess;

@SuppressWarnings("all")
public class ModnessFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ModnessGrammarAccess _modnessGrammarAccess;

  protected void _format(final GroupBias groupBias, @Extension final IFormattableDocument document) {
    EList<SensitiveVariable> _sensitiveVariables = groupBias.getSensitiveVariables();
    for (final SensitiveVariable sensitiveVariable : _sensitiveVariables) {
      document.<SensitiveVariable>format(sensitiveVariable);
    }
    document.<PositiveOutcome>format(groupBias.getPositiveOutcome());
    EList<SensitiveGroup> _unprivilegedGroup = groupBias.getUnprivilegedGroup();
    for (final SensitiveGroup sensitiveGroup : _unprivilegedGroup) {
      document.<SensitiveGroup>format(sensitiveGroup);
    }
    EList<SensitiveGroup> _privilegedGroup = groupBias.getPrivilegedGroup();
    for (final SensitiveGroup sensitiveGroup_1 : _privilegedGroup) {
      document.<SensitiveGroup>format(sensitiveGroup_1);
    }
    EList<GroupAnalysis> _analysis = groupBias.getAnalysis();
    for (final GroupAnalysis groupAnalysis : _analysis) {
      document.<GroupAnalysis>format(groupAnalysis);
    }
  }

  protected void _format(final SensitiveVariable sensitiveVariable, @Extension final IFormattableDocument document) {
    EList<SensitiveVariableValue> _sensitiveVariableValue = sensitiveVariable.getSensitiveVariableValue();
    for (final SensitiveVariableValue sensitiveVariableValue : _sensitiveVariableValue) {
      document.<SensitiveVariableValue>format(sensitiveVariableValue);
    }
  }

  public void format(final Object groupBias, final IFormattableDocument document) {
    if (groupBias instanceof GroupBias) {
      _format((GroupBias)groupBias, document);
      return;
    } else if (groupBias instanceof SensitiveVariable) {
      _format((SensitiveVariable)groupBias, document);
      return;
    } else if (groupBias instanceof XtextResource) {
      _format((XtextResource)groupBias, document);
      return;
    } else if (groupBias instanceof EObject) {
      _format((EObject)groupBias, document);
      return;
    } else if (groupBias == null) {
      _format((Void)null, document);
      return;
    } else if (groupBias != null) {
      _format(groupBias, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(groupBias, document).toString());
    }
  }
}
