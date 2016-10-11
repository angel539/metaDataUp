/*
 * generated by Xtext 2.9.1
 */
package eagledata.core.dsl.datadesc.serializer;

import com.google.inject.Inject;
import eagledata.core.dsl.datadesc.dataDsl.CompositeNode;
import eagledata.core.dsl.datadesc.dataDsl.DataDslPackage;
import eagledata.core.dsl.datadesc.dataDsl.DataFragment;
import eagledata.core.dsl.datadesc.dataDsl.DataModel;
import eagledata.core.dsl.datadesc.dataDsl.DataSource;
import eagledata.core.dsl.datadesc.dataDsl.DataType;
import eagledata.core.dsl.datadesc.dataDsl.Enumeration;
import eagledata.core.dsl.datadesc.dataDsl.LeafNode;
import eagledata.core.dsl.datadesc.dataDsl.Option;
import eagledata.core.dsl.datadesc.dataDsl.Reference;
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
			case DataDslPackage.COMPOSITE_NODE:
				sequence_CompositeNode(context, (CompositeNode) semanticObject); 
				return; 
			case DataDslPackage.DATA_FRAGMENT:
				sequence_DataFragment(context, (DataFragment) semanticObject); 
				return; 
			case DataDslPackage.DATA_MODEL:
				sequence_DataModel(context, (DataModel) semanticObject); 
				return; 
			case DataDslPackage.DATA_SOURCE:
				sequence_DataSource(context, (DataSource) semanticObject); 
				return; 
			case DataDslPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case DataDslPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case DataDslPackage.LEAF_NODE:
				sequence_LeafNode(context, (LeafNode) semanticObject); 
				return; 
			case DataDslPackage.OPTION:
				sequence_Option(context, (Option) semanticObject); 
				return; 
			case DataDslPackage.REFERENCE:
				sequence_Reference(context, (Reference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Node returns CompositeNode
	 *     CompositeNode returns CompositeNode
	 *
	 * Constraint:
	 *     (
	 *         environment?='>'? 
	 *         name=ID 
	 *         representedAs=STRING? 
	 *         (extends+=[CompositeNode|ID] extends+=[CompositeNode|ID]*)? 
	 *         subnodes+=Node 
	 *         subnodes+=Node* 
	 *         (options+=Option options+=Option*)?
	 *     )
	 */
	protected void sequence_CompositeNode(ISerializationContext context, CompositeNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataDescription returns DataFragment
	 *     DataFragment returns DataFragment
	 *
	 * Constraint:
	 *     (name=ID (fragments+=[DataFragment|ID] fragments+=[DataFragment|ID]*)? (nodes+=Node nodes+=Node*)?)
	 */
	protected void sequence_DataFragment(ISerializationContext context, DataFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataModel returns DataModel
	 *
	 * Constraint:
	 *     (descriptions+=DataDescription descriptions+=DataDescription*)
	 */
	protected void sequence_DataModel(ISerializationContext context, DataModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataDescription returns DataSource
	 *     DataSource returns DataSource
	 *
	 * Constraint:
	 *     (
	 *         format=FORMAT 
	 *         name=ID 
	 *         (fragments+=[DataFragment|ID] fragments+=[DataFragment|ID]*)? 
	 *         (nodes+=Node nodes+=Node*)? 
	 *         (options+=Option options+=Option*)?
	 *     )
	 */
	protected void sequence_DataSource(ISerializationContext context, DataSource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataDescription returns DataType
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
	 *     DataDescription returns Enumeration
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
	 *     Node returns LeafNode
	 *     LeafNode returns LeafNode
	 *
	 * Constraint:
	 *     (
	 *         uniqueness=UNIQUENESS? 
	 *         (type=BasicType | typeCall=[TypeSpecification|ID]) 
	 *         keyword?='#'? 
	 *         name=ID 
	 *         representedAs=STRING? 
	 *         (options+=Option options+=Option*)?
	 *     )
	 */
	protected void sequence_LeafNode(ISerializationContext context, LeafNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Option returns Option
	 *
	 * Constraint:
	 *     (key=OptionKey value=STRING)
	 */
	protected void sequence_Option(ISerializationContext context, Option semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.OPTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.OPTION__KEY));
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.OPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOptionAccess().getKeyOptionKeyEnumRuleCall_0_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getOptionAccess().getValueSTRINGTerminalRuleCall_0_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Reference returns Reference
	 *
	 * Constraint:
	 *     referenceType=[CompositeNode|ID]
	 */
	protected void sequence_Reference(ISerializationContext context, Reference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DataDslPackage.Literals.REFERENCE__REFERENCE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DataDslPackage.Literals.REFERENCE__REFERENCE_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeIDTerminalRuleCall_1_0_1(), semanticObject.getReferenceType());
		feeder.finish();
	}
	
	
}
