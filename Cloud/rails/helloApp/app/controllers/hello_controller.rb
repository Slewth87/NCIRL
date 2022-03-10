require 'hello'

class HelloController < ApplicationController
    def hello
    end

    def say_hello
        @name = params[:name]
        @result = Hello.say_hello(@name)
    end
end