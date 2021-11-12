# Programa para hallar el factorial de un número
# Guarda este programa como fact.rb

def fact(n)
  if n == 0
    1
  else
    n * fact(n-1)
  end
end

print fact(ARGV[0].to_i), "\n"