def setUpStudents
	students = ["Pelle", "Kåre", "Svein", "Marie", "Bertil"]
	studentsNotPresent = []
	excludedStudents = []
	students.sort - excludedStudents - studentsNotPresent
end

def getStudentToRemoveFrom arrayOfCandidates
	index = rand(arrayOfCandidates.length)
	#puts index
	arrayOfCandidates[index]
end

def displayWinner winner
	puts
	puts
	print "And the winner is..."
	sleep(2)
	puts winner[0]
	puts "Congratulations!!!"
end

availableStudents = setUpStudents
while (availableStudents.length > 1) do
	studentToRemove = getStudentToRemoveFrom availableStudents
	availableStudents -= [studentToRemove]
	#availableStudents = availableStudents - [studentToRemove]
	print "Eliminating student"
	3.times do
 		sleep(1)
 		print ". "
  		$stdout.flush
	end			
	puts studentToRemove
	sleep(1)
end

winner = availableStudents
displayWinner winner