/**
 */
package ecarules.impl;

import ecarules.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EcarulesFactoryImpl extends EFactoryImpl implements EcarulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcarulesFactory init() {
		try {
			EcarulesFactory theEcarulesFactory = (EcarulesFactory)EPackage.Registry.INSTANCE.getEFactory(EcarulesPackage.eNS_URI);
			if (theEcarulesFactory != null) {
				return theEcarulesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcarulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcarulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcarulesPackage.EVENT_SET_MANAGER: return (EObject)createEventSetManager();
			case EcarulesPackage.EVENT: return (EObject)createEvent();
			case EcarulesPackage.KEY_CONCEPT: return (EObject)createKeyConcept();
			case EcarulesPackage.REGEX_CONCEPT: return (EObject)createRegexConcept();
			case EcarulesPackage.DATA_CONNECTION: return (EObject)createDataConnection();
			case EcarulesPackage.CONDITION: return (EObject)createCondition();
			case EcarulesPackage.EXPRESSION: return (EObject)createExpression();
			case EcarulesPackage.LITERAL: return (EObject)createLiteral();
			case EcarulesPackage.ACTION_EXECUTABLE_EXTENSION: return (EObject)createActionExecutableExtension();
			case EcarulesPackage.CONCEPT_PARAM: return (EObject)createConceptParam();
			case EcarulesPackage.STRING_PARAM: return (EObject)createStringParam();
			case EcarulesPackage.ACTION_CALL: return (EObject)createActionCall();
			case EcarulesPackage.POINT: return (EObject)createPoint();
			case EcarulesPackage.REGION: return (EObject)createRegion();
			case EcarulesPackage.QUERY_CALL: return (EObject)createQueryCall();
			case EcarulesPackage.PARAM_VALUE: return (EObject)createParamValue();
			case EcarulesPackage.FIRST: return (EObject)createFirst();
			case EcarulesPackage.LAST: return (EObject)createLast();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EcarulesPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EcarulesPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSetManager createEventSetManager() {
		EventSetManagerImpl eventSetManager = new EventSetManagerImpl();
		return eventSetManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyConcept createKeyConcept() {
		KeyConceptImpl keyConcept = new KeyConceptImpl();
		return keyConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegexConcept createRegexConcept() {
		RegexConceptImpl regexConcept = new RegexConceptImpl();
		return regexConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnection createDataConnection() {
		DataConnectionImpl dataConnection = new DataConnectionImpl();
		return dataConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExecutableExtension createActionExecutableExtension() {
		ActionExecutableExtensionImpl actionExecutableExtension = new ActionExecutableExtensionImpl();
		return actionExecutableExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptParam createConceptParam() {
		ConceptParamImpl conceptParam = new ConceptParamImpl();
		return conceptParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringParam createStringParam() {
		StringParamImpl stringParam = new StringParamImpl();
		return stringParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCall createActionCall() {
		ActionCallImpl actionCall = new ActionCallImpl();
		return actionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryCall createQueryCall() {
		QueryCallImpl queryCall = new QueryCallImpl();
		return queryCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamValue createParamValue() {
		ParamValueImpl paramValue = new ParamValueImpl();
		return paramValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public First createFirst() {
		FirstImpl first = new FirstImpl();
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Last createLast() {
		LastImpl last = new LastImpl();
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcarulesPackage getEcarulesPackage() {
		return (EcarulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcarulesPackage getPackage() {
		return EcarulesPackage.eINSTANCE;
	}

} //EcarulesFactoryImpl
