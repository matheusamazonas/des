package persons.tasks.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import persons.tasks.taskDSL.Action;
import persons.tasks.taskDSL.LunchAction;
import persons.tasks.taskDSL.MeetingAction;
import persons.tasks.taskDSL.PaperAction;
import persons.tasks.taskDSL.PaymentAction;
import persons.tasks.taskDSL.Person;
import persons.tasks.taskDSL.Planning;
import persons.tasks.taskDSL.Task;

@SuppressWarnings("all")
public class HtmlGenerator {
  public static CharSequence toHtml(final Planning root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<style>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("table, th, td");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{ border:1px solid black;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("padding:5px;}");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("table");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("{ border-spacing:15px; }");
    _builder.newLine();
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append(" \t\t");
    String _name = root.getName();
    _builder.append(_name, " \t\t");
    _builder.append("</H1> ");
    _builder.newLineIfNotEmpty();
    _builder.append(" \t\t");
    CharSequence _listTasks = HtmlGenerator.listTasks(root);
    _builder.append(_listTasks, " \t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    return _builder;
  }
  
  public static CharSequence listTasks(final Planning root) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<table style=\"width:300px\">");
    _builder.newLine();
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("<th>Persons</th>");
    _builder.newLine();
    _builder.append("<th>Action</th>");
    _builder.newLine();
    _builder.append("<th>Priority</th>");
    _builder.newLine();
    _builder.append("</tr>");
    _builder.newLine();
    {
      EList<Task> _tasks = root.getTasks();
      for(final Task t : _tasks) {
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append(" \t\t\t");
        _builder.append("<td>");
        {
          boolean _isAnonymous = root.isAnonymous();
          boolean _not = (!_isAnonymous);
          if (_not) {
            CharSequence _listPersons = HtmlGenerator.listPersons(t);
            _builder.append(_listPersons, " \t\t\t");
          }
        }
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t\t\t");
        _builder.append("<td>");
        CharSequence _action2Html = HtmlGenerator.action2Html(t.getAction());
        _builder.append(_action2Html, " \t\t\t");
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t\t\t");
        _builder.append("<td>");
        int _prio = t.getPrio();
        _builder.append(_prio, " \t\t\t");
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t\t\t");
        _builder.append("</tr> \t\t ");
        _builder.newLine();
        _builder.append(" \t\t");
      }
    }
    _builder.append(" </table>");
    return _builder;
  }
  
  public static CharSequence listPersons(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Person> _persons = task.getPersons();
      boolean _hasElements = false;
      for(final Person p : _persons) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" , ", "");
        }
        _builder.append("<i>");
        String _name = p.getName();
        _builder.append(_name);
        _builder.append("</i> ");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t\t");
      }
      if (_hasElements) {
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  protected static CharSequence _action2Html(final LunchAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Lunch at ");
    String _location = action.getLocation();
    _builder.append(_location);
    return _builder;
  }
  
  protected static CharSequence _action2Html(final MeetingAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Meeting ");
    return _builder;
  }
  
  protected static CharSequence _action2Html(final PaperAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Paper for ");
    String _report = action.getReport();
    _builder.append(_report);
    return _builder;
  }
  
  protected static CharSequence _action2Html(final PaymentAction action) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Pay");
    return _builder;
  }
  
  public static CharSequence action2Html(final Action action) {
    if (action instanceof LunchAction) {
      return _action2Html((LunchAction)action);
    } else if (action instanceof MeetingAction) {
      return _action2Html((MeetingAction)action);
    } else if (action instanceof PaperAction) {
      return _action2Html((PaperAction)action);
    } else if (action instanceof PaymentAction) {
      return _action2Html((PaymentAction)action);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(action).toString());
    }
  }
}
