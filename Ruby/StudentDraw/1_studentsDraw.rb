students = ["Pelle", "Kåre", "Svein", "Marie", "Bertil"]
studentsNotPresent = ["Kåre"]
excludedStudents = []

availableStudents = students - excludedStudents - studentsNotPresent

index = rand(availableStudents.length)

puts index
puts availableStudents[index]