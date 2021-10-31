package calculator;

import java.util.Stack;

public class evaluateExp {

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    static String evaluateExp(String expression){
        expression = adjust(expression);
        if(expression.equals("Syntax Error")){
            return "Syntax Error";
        }
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            //check if char is operator
            if(precedence(c)>0){
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
                while(x!='('){
                    result += x;
                    x = stack.pop();
                }
            }else if(c=='('){
                stack.push(c);
            }else{
                //character is neither operator nor ( 
                result += c;
            }
        }
        for (int i = 0; i <=stack.size() ; i++) {
            result += stack.pop();
        }
        
        //eval
        result = eval(result)+"";
        return result;
    }

    public static String adjust (String s){
        String result = "[";
        boolean hasOperator = false;
        boolean openpran = true;
        for (int i = 0; i < s.length(); i++) {
            if((i == 0 && (precedence(s.charAt(i)) != -1 || s.charAt(i) == '.')) || s.charAt(s.length() - 1) == '.'){
                return "Syntax Error";
            }else if(precedence(s.charAt(i)) != -1){
                // current char is operator
                if(hasOperator){
                    return "Syntax Error";
                }else{
                    result += "]" + s.charAt(i);
                    openpran = false;
                    hasOperator = true;
                }
            }else{
                //read num
                if(openpran){
                    result += s.charAt(i);
                    hasOperator = false;
                }else{
                    result += "[" + s.charAt(i);
                    openpran = true;
                    hasOperator = false;
                }
            }
            if(i == s.length() - 1){
                result += "]";
            }
        }
        return result;
    }
    
    private static String eval(String exp){
        Stack<Double> myStack = new Stack<>();
        String temp = "";
        boolean openpre = false;
        for (int i = 0; i < exp.length(); i++) {
            String num = "";
            if(exp.charAt(i) == '['){
                openpre = true;
            }else if(exp.charAt(i) == ']'){
                myStack.push(Double.parseDouble(temp));
                openpre = false;
                temp = "";
            }else if(openpre){
                temp += exp.charAt(i);
            }else{
                double num2 = myStack.pop();
                double num1 = myStack.pop();
                switch(exp.charAt(i)){
                    case '+':
                        myStack.push(num1 + num2);
                        break;
                    case '-':
                        myStack.push(num1 - num2);
                        break;
                    case '*':
                        myStack.push(num1 * num2);
                        break;
                    case '/':
                        if(num2 == 0){
                            return "Error devide by zero!!";
                        }else{
                        myStack.push(num1 / num2);
                        }
                        break;
                }
            }
        }
        return myStack.pop()+"";
    }
    
    
    
}