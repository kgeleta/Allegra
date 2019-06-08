package wrappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Collection;

@ToString
@Data
@AllArgsConstructor
public class Method {

    private String name;
    private Collection<Instruction> instructions;
}
