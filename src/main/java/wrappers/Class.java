package wrappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Collection;

@ToString
@Data
@AllArgsConstructor
public class Class {

    private String name;
    private Collection<Variable> variables;
    private Collection<Function> functions;
   // private Collection<Method> methods;
}
