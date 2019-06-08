package wrappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collection;

@ToString
@Data
@AllArgsConstructor
public class Function {

    private String name;
    private Collection<Variable> arguments;
    private String returnType;
    private Collection<Variable> lines;
    private String returnStatement;

    public String parse() {

        StringBuilder sb = new StringBuilder("public static ");
        sb.append(returnType);
        sb.append(" ");
        sb.append(name);
        sb.append("(");

        //arguments
        ArrayList<Variable> var = new ArrayList<Variable>(arguments);
        for (int i = 0; i < var.size() - 1; ++i) {
            sb.append(var.get(i).getType());
            sb.append(" ");
            sb.append(var.get(i).getName());
            sb.append(", ");
        }
        if(! var.isEmpty()) {
            sb.append(var.get(var.size()-1).getType());
            sb.append(" ");
            sb.append(var.get(var.size()-1).getName());
        }
        sb.append(") {\n\n");

        for (Variable v : lines) {
            sb.append("\t");
            sb.append(v.parse());
           // sb.append(";\n");
        }

        sb.append("\n\treturn ");
        sb.append(returnStatement);
        sb.append(";\n}\n");
        return sb.toString();
    }
}
