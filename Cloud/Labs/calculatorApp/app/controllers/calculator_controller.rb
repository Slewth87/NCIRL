require 'arithmetic_calculator'

class CalculatorController < ApplicationController

    def calculate
    end

    def sum
        @operator = params[:commit]
        if @operator == '+'
            @num1 = params[:number1]
            @num2 = params[:number2]
            @result = ArithmeticCalculator.add(@num1.to_i, @num2.to_i)
        elsif @operator == '-'
            @num1 = params[:number1]
            @num2 = params[:number2]
            @result = ArithmeticCalculator.subtract(@num1.to_i, @num2.to_i)
        elsif @operator == 'x'
            @num1 = params[:number1]
            @num2 = params[:number2]
            @result = ArithmeticCalculator.multiply(@num1.to_i, @num2.to_i)
        elsif @operator == '/'
            @num1 = params[:number1]
            @num2 = params[:number2]
            @result = ArithmeticCalculator.divide(@num1.to_i, @num2.to_i)
        end
    end
        
end
