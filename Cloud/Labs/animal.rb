class Animal

    public

    def initialize()
        @breathing = "Inhale and exhale"
    end

    def breath
        puts(@breathing)
    end

end

a1 = Animal.new()
a1.breath

class Cat < Animal

    def initialize()
        super()
        @voice = "Meow"
    end

    def speak
        puts(@voice)
    end

end

c1 = Cat.new()
c1.speak
c1.breath

class Dog < Animal

    def initialize()
        super()
        @voice = "Woof"
    end

    def speak
        puts(@voice)
    end

end

d1 = Dog.new()
d1.speak
d1.breath