/*
 * generated by Xtext 2.9.2
 */
package eagledata.core.dsl.datadesc.serializer;

import com.google.inject.Inject;
import eagledata.core.dsl.datadesc.dataDsl.BooleanOption;
import eagledata.core.dsl.datadesc.dataDsl.DataDslPackage;
import eagledata.core.dsl.datadesc.dataDsl.DataFragment;
import eagledata.core.dsl.datadesc.dataDsl.DataModel;
import eagledata.core.dsl.datadesc.dataDsl.DataOption;
import eagledata.core.dsl.datadesc.dataDsl.DataSourceDescription;
import eagledata.core.dsl.datadesc.dataDsl.DataType;
import eagledata.core.dsl.datadesc.dataDsl.DoubleOption;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;
import eagledata.core.dsl.datadesc.dataDsl.Import;
import eagledata.core.dsl.datadesc.dataDsl.IntOption;
import eagledata.core.dsl.datadesc.dataDsl.LeafNode;
import eagledata.core.dsl.datadesc.dataDsl.SequenceOption;
import eagledata.core.dsl.datadesc.dataDsl.StringConcept;
import eagledata.core.dsl.datadesc.dataDsl.StringOption;
import eagledata.core.dsl.datadesc.dataDsl.StructDataType;
import eagledata.core.dsl.datadesc.dataDsl.Substring;
import eagledata.core.dsl.datadesc.services.DataDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class DataDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DataDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DataDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DataDslPackage.BOOLEAN_OPTION:
				sequence_BooleanOption(context, (BooleanOption) semanticObject); 
				return; 
			case DataDslPackage.CHARACTER:
				sequence_Character(context, (eagledata.core.dsl.datadesc.dataDsl.Character) semanticObject); 
				return; 
			case DataDslPackage.DATA_FRAGMENT:
				sequence_DataFragment(context, (DataFragment) semanticObject); 
				return; 
			case DataDslPackage.DATA_MODEL:
				sequence_DataModel(context, (DataModel) semanticObject); 
				return; 
			case DataDslPackage.DATA_OPTION:
				sequence_DataOption(context, (DataOption) semanticObject); 
				return; 
			case DataDslPackage.DATA_SOURCE_DESCRIPTION:
				sequence_DataSourceDescription(context, (DataSourceDescription) semanticObject); 
				return; 
			case DataDslPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case DataDslPackage.DOUBLE_OPTION:
				sequence_DoubleOption(context, (DoubleOption) semanticObject); 
				return; 
			case DataDslPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case DataDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case DataDslPackage.INT_OPTION:
				sequence_IntOption(context, (IntOption) semanticObject); 
				return; 
			case DataDslPackage.LEAF_NODE:
				sequence_LeafNode(context, (LeafNode) semanticObject); 
				return; 
			case DataDslPackage.PACKAGE:
				sequence_PackageDeclaration(context, (eagledata.core.dsl.datadesc.dataDsl.Package) semanticObject); 
				return; 
			case DataDslPackage.SEQUENCE_OPTION:
				sequence_SequenceOption(context, (SequenceOption) semanticObject); 
				return; 
			case DataDslPackage.STRING_CONCEPT:
				sequence_StringConcept(context, (StringConcept) semanticObject); 
				return; 
			case DataDslPackage.STRING_OPTION:
				sequence_StringOption(context, (StringOption) semanticObject); 
				return; 
			case DataDslPackage.STRUCT_DATA_TYPE:
				sequence_StructDataType(context, (StructDataType) semanticObject); 
				return; 
			case DataDslPackage.SUBSTRING:
				sequence_Substring(context, (Substring) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Option returns BooleanOption
	 *     BooleanOption returns BooleanOption
	 *
	 * Constraint:
	 *     (key=BooleanOptionKey value=BOOLEAN)
	 */
	protected void sequence_BooleanOption(ISerializationContext context, BooleanOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.BOOLEAN_OPTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.BOOLEAN_OPTION__KEY));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.BOOLEAN_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.BOOLEAN_OPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanOptionAccess().getKeyBooleanOptionKeyEnumRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getBooleanOptionAccess().getValueBOOLEANTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SubstringConcept returns Character
	 *     Character returns Character
	 *
	 * Constraint:
	 *     (typeCharacter=TypeCharacter name=ID value=STRING?)
	 */
	protected void sequence_Character(ISerializationContext context, eagledata.core.dsl.datadesc.dataDsl.Character semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataModelElement returns DataFragment
	 *     DataPackableDescription returns DataFragment
	 *     DataFragment returns DataFragment
	 *
	 * Constraint:
	 *     (name=ID (fragments+=[DataFragment|QualifiedName] fragments+=[DataFragment|QualifiedName]*)? (nodes+=LeafNode nodes+=LeafNode*)?)
	 */
	protected void sequence_DataFragment(ISerializationContext context, DataFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataModel returns DataModel
	 *
	 * Constraint:
	 *     (descriptions+=DataModelElement descriptions+=DataModelElement*)
	 */
	protected void sequence_DataModel(ISerializationContext context, DataModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataOption returns DataOption
	 *
	 * Constraint:
	 *     (key=DataOptionKey value=STRING)
	 */
	protected void sequence_DataOption(ISerializationContext context, DataOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.DATA_OPTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.DATA_OPTION__KEY));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.DATA_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.DATA_OPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataOptionAccess().getKeyDataOptionKeyEnumRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getDataOptionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataModelElement returns DataSourceDescription
	 *     DataSourceDescription returns DataSourceDescription
	 *
	 * Constraint:
	 *     (
	 *         format=Format 
	 *         name=ID 
	 *         (fragments+=[DataFragment|QualifiedName] fragments+=[DataFragment|QualifiedName]*)? 
	 *         (nodes+=LeafNode nodes+=LeafNode*)? 
	 *         (options+=DataOption options+=DataOption*)?
	 *     )
	 */
	protected void sequence_DataSourceDescription(ISerializationContext context, DataSourceDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataModelElement returns DataType
	 *     DataPackableDescription returns DataType
	 *     TypeSpecification returns DataType
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     (name=ID refine=BasicType (options+=Option options+=Option*)?)
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Option returns DoubleOption
	 *     DoubleOption returns DoubleOption
	 *
	 * Constraint:
	 *     (key=DoubleOptionKey value=DOUBLE)
	 */
	protected void sequence_DoubleOption(ISerializationContext context, DoubleOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.DOUBLE_OPTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.DOUBLE_OPTION__KEY));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.DOUBLE_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.DOUBLE_OPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoubleOptionAccess().getKeyDoubleOptionKeyEnumRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getDoubleOptionAccess().getValueDOUBLETerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataModelElement returns Enumeration
	 *     DataPackableDescription returns Enumeration
	 *     TypeSpecification returns Enumeration
	 *     Enumeration returns Enumeration
	 *
	 * Constraint:
	 *     (name=ID values+=STRING values+=STRING*)
	 */
	protected void sequence_Enumeration(ISerializationContext context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *     DataModelElement returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Option returns IntOption
	 *     IntOption returns IntOption
	 *
	 * Constraint:
	 *     (key=IntOptionKey value=INT)
	 */
	protected void sequence_IntOption(ISerializationContext context, IntOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.INT_OPTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.INT_OPTION__KEY));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.INT_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.INT_OPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntOptionAccess().getKeyIntOptionKeyEnumRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getIntOptionAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LeafNode returns LeafNode
	 *
	 * Constraint:
	 *     ((key?='key' | unique?='unique' | list?='list')? (type=BasicType | typeCall=[TypeSpecification|ID]) name=ID (options+=Option options+=Option*)?)
	 */
	protected void sequence_LeafNode(ISerializationContext context, LeafNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataModelElement returns Package
	 *     PackageDeclaration returns Package
	 *
	 * Constraint:
	 *     (name=QualifiedName elements+=DataPackableDescription elements+=DataPackableDescription*)
	 */
	protected void sequence_PackageDeclaration(ISerializationContext context, eagledata.core.dsl.datadesc.dataDsl.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Option returns SequenceOption
	 *     SequenceOption returns SequenceOption
	 *
	 * Constraint:
	 *     (key=SequenceOptionKey value=[StringConcept|QualifiedName])
	 */
	protected void sequence_SequenceOption(ISerializationContext context, SequenceOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.SEQUENCE_OPTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.SEQUENCE_OPTION__KEY));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.SEQUENCE_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.SEQUENCE_OPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceOptionAccess().getKeySequenceOptionKeyEnumRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getSequenceOptionAccess().getValueStringConceptQualifiedNameParserRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataModelElement returns StringConcept
	 *     DataPackableDescription returns StringConcept
	 *     StringConcept returns StringConcept
	 *
	 * Constraint:
	 *     (name=ID (subsequence+=SubstringConcept subsequence+=SubstringConcept*)?)
	 */
	protected void sequence_StringConcept(ISerializationContext context, StringConcept semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Option returns StringOption
	 *     StringOption returns StringOption
	 *
	 * Constraint:
	 *     (key=StringOptionKey value=STRING)
	 */
	protected void sequence_StringOption(ISerializationContext context, StringOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.STRING_OPTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.STRING_OPTION__KEY));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.STRING_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.STRING_OPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringOptionAccess().getKeyStringOptionKeyEnumRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getStringOptionAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataModelElement returns StructDataType
	 *     DataPackableDescription returns StructDataType
	 *     TypeSpecification returns StructDataType
	 *     StructDataType returns StructDataType
	 *
	 * Constraint:
	 *     (name=ID subnodes+=LeafNode subnodes+=LeafNode* (options+=Option options+=Option*)?)
	 */
	protected void sequence_StructDataType(ISerializationContext context, StructDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SubstringConcept returns Substring
	 *     Substring returns Substring
	 *
	 * Constraint:
	 *     (typeString=TypeString name=ID minlength=INT maxlength=INT)
	 */
	protected void sequence_Substring(ISerializationContext context, Substring semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.SUBSTRING__TYPE_STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.SUBSTRING__TYPE_STRING));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.SUBSTRING_CONCEPT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.SUBSTRING_CONCEPT__NAME));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.SUBSTRING__MINLENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.SUBSTRING__MINLENGTH));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.SUBSTRING__MAXLENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.SUBSTRING__MAXLENGTH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSubstringAccess().getTypeStringTypeStringEnumRuleCall_0_0(), semanticObject.getTypeString());
		feeder.accept(grammarAccess.getSubstringAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSubstringAccess().getMinlengthINTTerminalRuleCall_3_0(), semanticObject.getMinlength());
		feeder.accept(grammarAccess.getSubstringAccess().getMaxlengthINTTerminalRuleCall_5_0(), semanticObject.getMaxlength());
		feeder.finish();
	}
	
	
}