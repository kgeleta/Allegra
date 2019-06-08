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
}
