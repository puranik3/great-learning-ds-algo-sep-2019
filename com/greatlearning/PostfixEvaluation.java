package com.greatlearning;

public class PostfixEvaluation {
    static ArrayStack<Object> expressions = new ArrayStack<Object>();

    public static void main( String[] args ) {
        double x, y, z;

        for( int i = 0; i < args.length; i++ ) {
            if( isOperator( args[i] ) ) {
                y = Double.parseDouble( (String) expressions.pop() );
                x = Double.parseDouble( (String) expressions.pop() );

                expressions.pop();
                z = evaluate( x, y, args[i] );

                expressions.push( "" + z );
            } else {
                expressions.push( args[i] );
            }
        }

        System.out.println( expressions.peek() );
    }

    private static boolean isOperator( String arg ) {
        return arg.length() == 1 && "+-x/".indexOf( arg ) != -1;
    }

    private static Double evaluate( Double x, Double y, String operator ) {
        switch( operator ) {
            case "+": return x + y;
            case "-": return x - y;
            case "x": return x * y;
            case "/": return x / y;
            default: throw new IllegalArgumentException( "unknown operator" );
        }
    }
}