$winnersFile = "winners.txt"
$notPresentFile = "notPresent.txt"
$studentFile = "studentList.txt"

def getArrayFromFile filename
	array = []
	File.open(filename, :encoding => 'UTF-8').each_line do |line|
		next if line.start_with? '#'
		array.push(line.chomp)
	end
	return array
end

def setUpStudents filename
	students = getArrayFromFile(filename)
	puts "All students: " + students.to_s
	studentsNotPresent = getArrayFromFile($notPresentFile)
	puts "Students not present: " + studentsNotPresent.to_s
	previousWinners = getArrayFromFile($winnersFile)
	puts "Previous winners: " + previousWinners.to_s
	availableStudents = students - previousWinners - studentsNotPresent
	return availableStudents
end

def getStudentToRemoveFrom arrayOfCandidates
	index = rand(arrayOfCandidates.length)	
	arrayOfCandidates[index]
end

def displayWinner winner	
	puts
	print "And the winner is..."
	sleep(2)
	puts winner
	puts "Congratulations!!!"
end

def eliminateStudents availableStudents
	while (availableStudents.length > 1) do
		studentToRemove = getStudentToRemoveFrom availableStudents
		availableStudents -= [studentToRemove]
		print "Eliminating student"
		3.times do
	 		sleep(1)
	 		print ". "
	  		$stdout.flush
		end			
		puts studentToRemove
		sleep(1)
	end
	return availableStudents
end

def writeWinnerToFile winner
	file = File.open($winnersFile, 'a', :encoding => 'UTF-8')
	file.puts(winner)
	file.close
end

if ARGV.length > 0
	availableStudents = setUpStudents(ARGV[0])
else
	availableStudents = setUpStudents($studentFile)
end
availableStudents = eliminateStudents(availableStudents)
if availableStudents.length > 0
	winner = availableStudents
	displayWinner(winner[0])
	writeWinnerToFile(winner[0])
else
	puts "No more student to draw from"
end
