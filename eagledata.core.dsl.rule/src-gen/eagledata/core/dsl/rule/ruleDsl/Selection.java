/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ruleDsl;

import eagledata.core.dsl.pattern.streamingDsl.Concept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Selection#getSelector <em>Selector</em>}</li>
 *   <li>{@link eagledata.core.dsl.rule.ruleDsl.Selection#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getSelection()
 * @model
 * @generated
 */
public interface Selection extends EObject
{
  /**
   * Returns the value of the '<em><b>Selector</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selector</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selector</em>' reference.
   * @see #setSelector(Concept)
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getSelection_Selector()
   * @model
   * @generated
   */
  Concept getSelector();

  /**
   * Sets the value of the '{@link eagledata.core.dsl.rule.ruleDsl.Selection#getSelector <em>Selector</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selector</em>' reference.
   * @see #getSelector()
   * @generated
   */
  void setSelector(Concept value);

  /**
   * Returns the value of the '<em><b>Root</b></em>' reference list.
   * The list contents are of type {@link eagledata.core.dsl.pattern.streamingDsl.Concept}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' reference list.
   * @see eagledata.core.dsl.rule.ruleDsl.RuleDslPackage#getSelection_Root()
   * @model
   * @generated
   */
  EList<Concept> getRoot();

} // Selection