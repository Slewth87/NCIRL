valid = true
puts("Enter what day of the week you would like to go to fitness class:")
day = gets.chomp

if day.casecmp("Monday") == 0 or day.casecmp("Tuesday") == 0 or day.casecmp("Wednesday") == 0 or day.casecmp("Thursday") == 0
    cost = "€10"
elsif day.casecmp("Friday") == 0 or day.casecmp("Saturday") == 0 or day.casecmp("Sunday") == 0
    cost = "€20"
else
    valid = false
end

if valid == true
    puts("The cost of your class will be #{cost}.")
else
    puts("Invalid day entered")
end