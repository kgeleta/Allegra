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

    private Collection<Variable> lines;

    public String parse() {

        StringBuilder sb = new StringBuilder("public class ");
        sb.append(name);
        sb.append(" { \n\n");

        for(Variable v : variables) {
            sb.append("private static ");
            sb.append(v.parse());
        }

        for (Function f : functions) {
            sb.append("\n");
            sb.append(f.parse());
        }

        sb.append("\npublic static void main(String[] args) {\n\n");
        for (Variable v : lines)
            sb.append("\t" + v.parse());
        sb.append("\n}");

        sb.append("\n}");
        return sb.toString();
    }
}
