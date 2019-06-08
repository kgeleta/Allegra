import generated.SomeLanguageBaseListener;
import generated.SomeLanguageLexer;
import generated.SomeLanguageParser;
import lombok.Data;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import wrappers.*;
import wrappers.Class;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;

public class MyVisitor {

    public Class parse(String source) throws Exception {

//        String source = "";
//        new ANTLRInputStream(new FileInputStream("C:\\Users\\Leslie\\IdeaProjects\\compilers\\src\\test\\java\\test.txt"));
        CharStream imput = new ANTLRInputStream(new FileInputStream(source));
        SomeLanguageLexer lexer = new SomeLanguageLexer(imput);
        TokenStream tokens = new CommonTokenStream(lexer);
        SomeLanguageParser parser = new SomeLanguageParser(tokens);

        ClassListener classListener = new ClassListener();
        parser.classDeclaration().enterRule(classListener);
        return classListener.getParsedClass();
    }

    @Data
    class ClassListener extends SomeLanguageBaseListener {

        private Class parsedClass;

        @Override
        public void enterClassDeclaration(@NotNull SomeLanguageParser.ClassDeclarationContext ctx) {
            String className = ctx.className().getText();

            // handle variable declarations
            VariableDeclarationListener variableDeclarationListener = new VariableDeclarationListener();
            for(SomeLanguageParser.VariableDeclarationContext variableDeclaration : ctx.variableDeclaration())
                variableDeclaration.enterRule(variableDeclarationListener);

            // handle functions
            FunctionListener functionListener = new FunctionListener();
            for(SomeLanguageParser.FunctionContext function : ctx.function())
                function.enterRule(functionListener);

            LineListener lineListener = new LineListener();
            for (SomeLanguageParser.LineContext line : ctx.line())
                line.enterRule(lineListener);

//            // handle methods
//            MethodListener methodListener = new MethodListener();
//            for(SomeLanguageParser.MethodContext method : ctx.method())
//                method.enterRule(methodListener);

            Collection<Variable> variables = variableDeclarationListener.getVariables();
            Collection<Function> functions = functionListener.getFunctions();
//            Collection<Method> methods = methodListener.getMethods();

            parsedClass = new Class(className, variables, functions, lineListener.getLines());
        }
    }


//    @Data
//    class MethodListener extends SomeLanguageBaseListener {
//
//        private Collection<Method> methods;
//
//        public MethodListener() {
//            methods = new ArrayList<Method>();
//        }
//
//        @Override
//        public void enterMethod(@NotNull SomeLanguageParser.MethodContext ctx) {
//            String methodName = ctx.methodName().getText();
//            InstructionListener instructionListener = new InstructionListener();
//            for(SomeLanguageParser.InstructionContext instruction : ctx.instruction())
//                instruction.enterRule(instructionListener);
//
////            ctx.instruction().forEach(instruction -> instruction.enterRule(instructionListener));
//            Collection<Instruction> instructions = instructionListener.getInstructions();
//            methods.add(new Method(methodName, instructions));
//        }
//
//    }

//    @Data
//    class InstructionListener extends SomeLanguageBaseListener {
//
//        private Collection<Instruction> instructions;
//
//        public InstructionListener() {
//            instructions = new ArrayList<Instruction>();
//        }
//
//        @Override
//        public void enterInstruction(@NotNull SomeLanguageParser.InstructionContext ctx) {
//            String instructionName = ctx.getText();
//            instructions.add(new Instruction(instructionName));
//        }
//    }

    @Data
    class VariableDeclarationListener extends SomeLanguageBaseListener {

        private Collection<Variable> variables;

        public VariableDeclarationListener() {
            variables = new ArrayList<Variable>();
        }

        @Override
        public void enterVariableDeclaration(SomeLanguageParser.VariableDeclarationContext ctx) {
            String variableType = ctx.TYPE().getText();
            String variableName = ctx.ID().getText();

            variables.add(new Variable(variableType, variableName));
        }
    }

    @Data
    class ArgumentListener extends SomeLanguageBaseListener {

        private Collection<Variable> arguments;

        public ArgumentListener() {
            arguments = new ArrayList<Variable>();
        }

        @Override
        public void enterArgument(SomeLanguageParser.ArgumentContext ctx) {
            for(int i = 0; i < ctx.TYPE().size(); ++i)
                arguments.add(new Variable(ctx.TYPE(i).getText(), ctx.ID(i).getText()));
        }
    }

    @Data
    class FunctionListener extends SomeLanguageBaseListener {

        private Collection<Function> functions;

        public FunctionListener() {
            functions = new ArrayList<Function>();
        }

        @Override
        public void enterFunction(SomeLanguageParser.FunctionContext ctx) {

            String name = ctx.ID().getText();
            ArgumentListener argumentListener = new ArgumentListener();
            if (ctx.argument() != null)
                ctx.argument().enterRule(argumentListener);
            String returnType = ctx.TYPE().getText();

//            // handle instructions
//            InstructionListener instructionListener = new InstructionListener();
//            for(SomeLanguageParser.InstructionContext instruction : ctx.instruction())
//                instruction.enterRule(instructionListener);
//
//            //handle assignments
//            AssignmentListener assignmentListener = new AssignmentListener();
//            for(SomeLanguageParser.AssignmentContext assignment : ctx.assignment())
//                assignment.enterRule(assignmentListener);

            //handle lines
            LineListener lineListener = new LineListener();
            for(SomeLanguageParser.LineContext line : ctx.line())
                line.enterRule(lineListener);

            String retStatement = ctx.value().getText();

            functions.add(new Function(name, argumentListener.getArguments(), returnType, lineListener.getLines(), retStatement));
        }
    }

    @Data
    class LineListener extends SomeLanguageBaseListener {

        private Collection<Variable> lines;

        public LineListener() {
            lines = new ArrayList<Variable>();
        }

        @Override
        public void enterLine(SomeLanguageParser.LineContext ctx) {
            if (ctx.assignment() != null) {
                AssignmentListener assignmentListener = new AssignmentListener();
                ctx.assignment().enterRule(assignmentListener);
                lines.addAll(assignmentListener.getVariables());
            }

            else if(ctx.printfCall() != null) {
                PrintfListener printfListener = new PrintfListener();
                ctx.printfCall().enterRule(printfListener);
                lines.addAll(printfListener.getPrintfy());
            }

        }
    }

    @Data
    class PrintfListener extends SomeLanguageBaseListener {

        private Collection<Variable> printfy;

        public PrintfListener() {
            this.printfy = new ArrayList<Variable>();
        }

        @Override
        public void enterPrintfCall(SomeLanguageParser.PrintfCallContext ctx) {
            String type = "printf";
            String value = ctx.value().getText();

            printfy.add(new Variable(type, type, value));
        }
    }

    @Data
    class ValueListener extends SomeLanguageBaseListener {

        private String value;
        private String type;

        @Override
        public void enterValue(SomeLanguageParser.ValueContext ctx) {
            value = ctx.getText();
            type = ctx.STRING_VALUE() != null ? "String" : (ctx.expression() != null ? "Integer" : "function");
        }
    }

    @Data
    class AssignmentListener extends SomeLanguageBaseListener {

        private Collection<Variable> variables;

        public AssignmentListener() {
            variables = new ArrayList<Variable>();
        }

        @Override
        public void enterAssignment(SomeLanguageParser.AssignmentContext ctx) {

            ValueListener valueListener = new ValueListener();
            ctx.value().enterRule(valueListener);
            variables.add(new Variable(valueListener.getType(), ctx.ID().getText(), valueListener.getValue()));
        }
    }
}
