h = {
    "a" => 100,
    "b" => "Jeremy"
}

puts(h['a'])

h.delete("b")

puts(h)

h["a"] = 200
h["age"] = 30

puts(h)