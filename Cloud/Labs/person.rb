class Person
    @@counter = 0
    attr_accessor :name, :age

    def initialize(aName, aAge)
        @name = aName
        @age = aAge
        @@counter +=1
    end

    def to_s
        "The person's name is #{@name} and they are #{@age}\n"
    end

    def numPersons
        puts(@@counter)
    end

end

p1 = Person.new("Josh", 30)

puts(p1.name)
puts(p1.age)

p1.name="Joshua"
puts p1.name

p2 = Person.new("Keith", 21)
p1.numPersons
p2.numPersons

puts(p1)

class Student < Person
    attr_accessor :studentNumber

    def initialize(aName, aAge, aStudentNumber)
        super(aName, aAge)
        @studentNumber = aStudentNumber
    end

    def to_s
        "The student's Student Number is #{@studentNumber}, their name is #{@name} and they are #{@age}\n"
    end

end

s1 = Student.new("Michael", 25, "S554446549")
puts(s1)

puts s1.methods
puts s1.instance_variables