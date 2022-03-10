=begin

The instructions for the lab has an error.
It states that 56 should produce the "hello world" output.
But 56 is not divisible by 9 without a remainder.
63 will result in the "hello world" output

=end

def hello_world(input)
    for i in 0...input
        if input%7 == 0 and input%9 == 0
            puts("hello world")   
        elsif input%7 == 0
            puts("hello")
        elsif input%9 == 0
            puts("world")
        end
    end
end

puts("Enter a number:")
hello_world(Integer(gets()))