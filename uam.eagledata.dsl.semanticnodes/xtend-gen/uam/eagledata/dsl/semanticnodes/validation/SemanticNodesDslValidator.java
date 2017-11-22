/**
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.semanticnodes.validation;

import org.eclipse.xtext.validation.Check;
import semanticmanager.MetaData;
import semanticmanager.MetaDataValue;
import semanticmanager.SemanticmanagerPackage;
import uam.eagledata.dsl.semanticnodes.validation.AbstractSemanticNodesDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class SemanticNodesDslValidator extends AbstractSemanticNodesDslValidator {
  public final static String VALUE_NOT_VALID = "metaDataValue";
  
  @Check
  public void checkMetaDataValueValidator(final MetaDataValue metaDataValue) {
    MetaData _keyMetaData = metaDataValue.getKeyMetaData();
    String _value = metaDataValue.getValue();
    boolean _validateValue = _keyMetaData.validateValue(_value);
    boolean _not = (!_validateValue);
    if (_not) {
      this.error("MetaData value is not valid", 
        SemanticmanagerPackage.Literals.META_DATA_VALUE__KEY_META_DATA, 
        SemanticNodesDslValidator.VALUE_NOT_VALID);
    }
  }
}
