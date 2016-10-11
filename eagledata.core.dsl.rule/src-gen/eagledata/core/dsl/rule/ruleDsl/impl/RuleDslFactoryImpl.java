/**
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.rule.ruleDsl.impl;

import eagledata.core.dsl.rule.ruleDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuleDslFactoryImpl extends EFactoryImpl implements RuleDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RuleDslFactory init()
  {
    try
    {
      RuleDslFactory theRuleDslFactory = (RuleDslFactory)EPackage.Registry.INSTANCE.getEFactory(RuleDslPackage.eNS_URI);
      if (theRuleDslFactory != null)
      {
        return theRuleDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RuleDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RuleDslPackage.RULE_MODEL: return createRuleModel();
      case RuleDslPackage.RULE_ELEMENT: return createRuleElement();
      case RuleDslPackage.RULE: return createRule();
      case RuleDslPackage.ACTION: return createAction();
      case RuleDslPackage.QUERY: return createQuery();
      case RuleDslPackage.ADDING_SELECT: return createAddingSelect();
      case RuleDslPackage.SELECT: return createSelect();
      case RuleDslPackage.SET_SELECT: return createSetSelect();
      case RuleDslPackage.WHERE: return createWhere();
      case RuleDslPackage.WHEN: return createWhen();
      case RuleDslPackage.EXPRESSION: return createExpression();
      case RuleDslPackage.OPERAND: return createOperand();
      case RuleDslPackage.PLAIN_OPERAND: return createPlainOperand();
      case RuleDslPackage.NUMERAL: return createNumeral();
      case RuleDslPackage.QUERY_OPERAND: return createQueryOperand();
      case RuleDslPackage.COMPLEX_OPERAND: return createComplexOperand();
      case RuleDslPackage.MESSAGE: return createMessage();
      case RuleDslPackage.MESSAGE_STRING: return createMessageString();
      case RuleDslPackage.SELECT_MESSAGE_STRING: return createSelectMessageString();
      case RuleDslPackage.TEXT_MESSAGE_STRING: return createTextMessageString();
      case RuleDslPackage.RECEIVER: return createReceiver();
      case RuleDslPackage.RECEIVER_LIST: return createReceiverList();
      case RuleDslPackage.DISTRIBUTION_LIST: return createDistributionList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleModel createRuleModel()
  {
    RuleModelImpl ruleModel = new RuleModelImpl();
    return ruleModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleElement createRuleElement()
  {
    RuleElementImpl ruleElement = new RuleElementImpl();
    return ruleElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Query createQuery()
  {
    QueryImpl query = new QueryImpl();
    return query;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddingSelect createAddingSelect()
  {
    AddingSelectImpl addingSelect = new AddingSelectImpl();
    return addingSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetSelect createSetSelect()
  {
    SetSelectImpl setSelect = new SetSelectImpl();
    return setSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Where createWhere()
  {
    WhereImpl where = new WhereImpl();
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public When createWhen()
  {
    WhenImpl when = new WhenImpl();
    return when;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand createOperand()
  {
    OperandImpl operand = new OperandImpl();
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlainOperand createPlainOperand()
  {
    PlainOperandImpl plainOperand = new PlainOperandImpl();
    return plainOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numeral createNumeral()
  {
    NumeralImpl numeral = new NumeralImpl();
    return numeral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QueryOperand createQueryOperand()
  {
    QueryOperandImpl queryOperand = new QueryOperandImpl();
    return queryOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexOperand createComplexOperand()
  {
    ComplexOperandImpl complexOperand = new ComplexOperandImpl();
    return complexOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageString createMessageString()
  {
    MessageStringImpl messageString = new MessageStringImpl();
    return messageString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectMessageString createSelectMessageString()
  {
    SelectMessageStringImpl selectMessageString = new SelectMessageStringImpl();
    return selectMessageString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextMessageString createTextMessageString()
  {
    TextMessageStringImpl textMessageString = new TextMessageStringImpl();
    return textMessageString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Receiver createReceiver()
  {
    ReceiverImpl receiver = new ReceiverImpl();
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReceiverList createReceiverList()
  {
    ReceiverListImpl receiverList = new ReceiverListImpl();
    return receiverList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DistributionList createDistributionList()
  {
    DistributionListImpl distributionList = new DistributionListImpl();
    return distributionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleDslPackage getRuleDslPackage()
  {
    return (RuleDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RuleDslPackage getPackage()
  {
    return RuleDslPackage.eINSTANCE;
  }

} //RuleDslFactoryImpl
