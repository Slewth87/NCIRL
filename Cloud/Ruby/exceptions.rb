begin
    user_input = Integer(gets())
rescue ArgumentError => ex
    puts(ex)
end

begin
    raise "An error"
rescue ArgumentError => ex
    puts(ex)
rescue Exception => ex
    puts(ex)
end