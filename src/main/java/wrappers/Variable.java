package wrappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
public class Variable {

    private String type;
    private String name;
    private String value;

    public Variable(String type, String name) {
        this.type = type;
        this.name = name;
        this.value = null;
    }

    public String parse() {

        StringBuilder sb = new StringBuilder();
        if (type.equals("printf")) {
            sb.append("System.out.println(");
            sb.append(value);
            sb.append(");\n");
        }
        else if(type.equals("function")) {
            sb.append(name);
            sb.append(" = ");
            sb.append(value);
            sb.append(";\n");
        }
        else {
            sb.append(value == null ? (type + " ") : "");
//            sb.append(" ");
            sb.append(name);
            sb.append(value == null ? "" : (" = " + value));
            sb.append(";\n");
        }
        return sb.toString();
    }
}
