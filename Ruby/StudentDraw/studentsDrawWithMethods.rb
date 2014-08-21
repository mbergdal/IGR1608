def setUpStudents
	students = ["Pelle", "Kåre", "Svein", "Marie", "Bertil"]
	studentsNotPresent = ["Kåre"]
	excludedStudents = []
	students.sort - excludedStudents - studentsNotPresent
end

def drawWinnerFrom arrayOfCandidates
	index = rand(arrayOfCandidates.length)
	#puts index
	arrayOfCandidates[index]
end

def displayWinner winner
	puts winner
end

availableStudents = setUpStudents
winner = drawWinnerFrom availableStudents
displayWinner winner