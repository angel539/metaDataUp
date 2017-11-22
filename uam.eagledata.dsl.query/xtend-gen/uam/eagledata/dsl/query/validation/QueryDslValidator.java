/**
 * generated by Xtext 2.9.2
 */
package uam.eagledata.dsl.query.validation;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import query.CompositeFrom;
import query.From;
import query.QueryPackage;
import query.Select;
import query.SimpleFrom;
import uam.eagledata.dsl.query.validation.AbstractQueryDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class QueryDslValidator extends AbstractQueryDslValidator {
  public final static String QUERY_SYNTAX_ERROR = "querySyntaxError";
  
  @Check
  public void checkGreetingStartsWithCapital(final Select select) {
    boolean valid = true;
    EList<From> _from = select.getFrom();
    for (final From from : _from) {
      {
        EList<From> _from_1 = select.getFrom();
        final int index = _from_1.indexOf(from);
        boolean _and = false;
        if (!(index == 0)) {
          _and = false;
        } else {
          _and = (from instanceof CompositeFrom);
        }
        if (_and) {
          valid = false;
        } else {
          EList<From> _from_2 = select.getFrom();
          int _size = _from_2.size();
          int _minus = (_size - 1);
          boolean _lessThan = (index < _minus);
          if (_lessThan) {
            EList<From> _from_3 = select.getFrom();
            final From next = _from_3.get((index + 1));
            boolean _and_1 = false;
            if (!(from instanceof CompositeFrom)) {
              _and_1 = false;
            } else {
              boolean _and_2 = false;
              boolean _notEquals = (!Objects.equal(next, null));
              if (!_notEquals) {
                _and_2 = false;
              } else {
                _and_2 = (next instanceof SimpleFrom);
              }
              _and_1 = _and_2;
            }
            if (_and_1) {
              valid = false;
            }
          }
        }
      }
    }
    if ((!valid)) {
      this.error("Query syntax error: from cannot have a sequence composed by a set of joins and simple nodes", 
        QueryPackage.Literals.SELECT__FROM, 
        QueryDslValidator.QUERY_SYNTAX_ERROR);
    }
  }
}