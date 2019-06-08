package wrappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Collection;

@ToString
@Data
@AllArgsConstructor
public class Function {

    private String name;
    private Collection<Variable> arguments;
    private String returnType;
    private Collection<Instruction> instructions;
    private Collection<Variable> assignments;
}
